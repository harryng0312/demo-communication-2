package org.harryng.communication.controller

import com.fasterxml.jackson.core.JsonProcessingException
import org.harryng.communication.auth.service.AuthService
import org.harryng.communication.auth.dto.AuthenticationInfo
import org.harryng.communication.session.SessionHolder
import org.harryng.communication.util.TextUtil
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.servlet.http.HttpServletRequest

@Controller
open class AuthController {

    companion object {
        val logger: Logger = LoggerFactory.getLogger(AuthController::class.java)
    }

    @Autowired
    protected lateinit var request: HttpServletRequest

    @Autowired
    protected lateinit var authService: AuthService

    @RequestMapping(value = ["/login"], method = [RequestMethod.GET])
    fun initLogin(): String {
        return "auth/login"
    }

    @RequestMapping(
        value = ["/login"],
        produces = [MediaType.APPLICATION_JSON_VALUE],
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        method = [RequestMethod.POST]
    )
    @ResponseBody
    fun doLogin(@RequestBody body: String): String {
        var response = ""
        try {
            val authenticationInfo: AuthenticationInfo? = TextUtil.jsonToObj(AuthenticationInfo::class.java, body)
            val username: String = authenticationInfo?.username ?: ""
            val password: String = authenticationInfo?.password ?: ""
            val user = authService.loginByUsernamePassword(username, password)
            authenticationInfo?.let { it.result = "0" }
            SessionHolder.getSession(authenticationInfo?.username ?: "")
                ?.let { it[SessionHolder.K_USER] = user }
            SessionHolder.getSession(authenticationInfo?.username ?: "")
                ?.let { it[SessionHolder.K_AUTH_INFO] = authenticationInfo }
            response = TextUtil.objToJson(authenticationInfo)
        } catch (e: Exception) {
            val authenticationInfoErr =
                AuthenticationInfo("0", "", "", Calendar.getInstance().time, "10")
            try {
                response = TextUtil.objToJson(authenticationInfoErr)
            } catch (ex: JsonProcessingException) {
                logger.info("", ex)
            }
            logger.error("", e)
        }
        return response
    }

    @RequestMapping(value = ["/afterLogin"], method = [RequestMethod.GET])
    fun submitLogin(@RequestParam(name = "tokenId", defaultValue = "") tokenId: String?): String {
        var rs = "auth/login"
        val result = SessionHolder.getSession(tokenId ?: "", false) != null
        if (result) {
            rs = String.format("redirect:%s", "welcome")
        }
        return rs
    }

    @RequestMapping(value = ["/welcome"], method = [RequestMethod.GET])
    fun welcome(): String {
        return "auth/welcome"
    }


}
