package org.harryng.communication.controller

import com.fasterxml.jackson.core.JsonProcessingException
import org.harryng.communication.auth.dto.AuthenticationInfo
import org.harryng.communication.auth.service.AuthService
import org.harryng.communication.kernel.cache.CacheService
import org.harryng.communication.user.entity.UserImpl
import org.harryng.communication.util.SessionHolder
import org.harryng.communication.util.TextUtil
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.io.Serializable
import java.util.*
import javax.servlet.http.Cookie
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Controller
open class AuthController {

    companion object {
        val logger: Logger = LoggerFactory.getLogger(AuthController::class.java)
    }

    @Autowired
    protected lateinit var request: HttpServletRequest

    @Autowired
    protected lateinit var response: HttpServletResponse

    @Autowired
    protected lateinit var authService: AuthService

    @Autowired
    @Qualifier("cacheService")
    private lateinit var cacheService: CacheService

    @RequestMapping(value = ["/login"], method = [RequestMethod.GET])
    fun initLogin(): String {
        return "auth/login"
    }

    @RequestMapping(value = ["/logout"], method = [RequestMethod.GET])
    fun logout(): String {
        val tokenCookie: Cookie = request.cookies?.find { cookie -> cookie.name == "tokenId" }
            ?: Cookie("tokenId", "")
        val userId = request.session.getAttribute(SessionHolder.K_USER_ID) as Long?
        authService.logout(userId ?: 0L)
        request.session.removeAttribute(SessionHolder.K_USER_ID)
        request.session.invalidate()
        tokenCookie.maxAge = 0
        response.addCookie(tokenCookie)
        return "redirect:/login"
    }

    @RequestMapping(
        value = ["/login"],
        produces = [MediaType.APPLICATION_JSON_VALUE],
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        method = [RequestMethod.POST]
    )
    @ResponseBody
    fun doLogin(@RequestBody body: String): String {
        var responseRs = ""
        try {
            val authenticationInfo: AuthenticationInfo? = TextUtil.jsonToObj(AuthenticationInfo::class.java, body)
            val username: String = authenticationInfo?.username ?: ""
            val password: String = authenticationInfo?.password ?: ""
            val user: UserImpl = authService.loginByUsernamePassword(username, password)
            request.session.invalidate()
            authenticationInfo?.let { it.result = "0" }
            request.session.setAttribute(SessionHolder.K_USER_ID, user.id)
            response.addCookie(Cookie(SessionHolder.K_TOKEN_ID, username))
            responseRs = TextUtil.objToJson(authenticationInfo)
        } catch (e: Exception) {
            val authenticationInfoErr =
                AuthenticationInfo("0", "", "", Calendar.getInstance().time, "10")
            try {
                responseRs = TextUtil.objToJson(authenticationInfoErr)
            } catch (ex: JsonProcessingException) {
                logger.info("", ex)
            }
            logger.error("", e)
        } finally {

        }
        return responseRs
    }

    @RequestMapping(value = ["/afterLogin"], method = [RequestMethod.GET])
    fun afterLogin(@RequestParam(name = SessionHolder.K_TOKEN_ID, defaultValue = "") tokenId: String = ""): String {
        var rs = "auth/login"
        var tid = tokenId
        if ("" == tid) {
            tid = (request.cookies.find { cookie -> cookie.name == SessionHolder.K_TOKEN_ID }
                ?: Cookie(SessionHolder.K_TOKEN_ID, "")).value
        }
//        val result = SessionHolder.getSession(tid, false) != null
        val result = request.session.getAttribute(SessionHolder.K_USER_ID) != null
        if (result) {
            rs = String.format("redirect:%s", "welcome")
        }
        return rs
    }

    @RequestMapping(value = ["/welcome"], method = [RequestMethod.GET])
    fun welcome(): String {
        var rs = "redirect:/logout"
        val userId: Long? = request.session.getAttribute(SessionHolder.K_USER_ID) as Long?
        if (userId != null) {
            val session =
                cacheService.getSession()[userId]?.get(SessionHolder.K_SESSION_HOLDER) as SessionHolder?
            if (session != null) {
                request.setAttribute("user", session.user)
                rs = "auth/welcome"
            }
        }
        return rs
    }
}
