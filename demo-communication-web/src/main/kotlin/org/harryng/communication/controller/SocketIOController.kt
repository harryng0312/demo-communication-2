package org.harryng.communication.controller

import org.harryng.communication.auth.service.AuthService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import javax.servlet.http.HttpServletRequest


@Controller
@RequestMapping("/socketio")
open class SocketIOController {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(SocketIOController::class.java)
    }
    @Autowired
    protected lateinit var request: HttpServletRequest

    @Autowired
    protected var authService: AuthService? = null
    @RequestMapping(value = ["/socketio"], method = [RequestMethod.GET])
    fun initForm(): String {
        return "ws/socketio"
    }
}
