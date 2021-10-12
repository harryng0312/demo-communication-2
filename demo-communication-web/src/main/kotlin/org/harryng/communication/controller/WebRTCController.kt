package org.harryng.communication.controller

import org.harryng.communication.auth.service.AuthService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import javax.servlet.http.HttpServletRequest


@Controller
@RequestMapping("/rtc")
open class WebRTCController {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(WebRTCController::class.java)
    }
    @Autowired
    protected lateinit var request: HttpServletRequest

    @Autowired
    protected lateinit var authService: AuthService

    @Autowired
    private val simpMessagingTemplate: SimpMessagingTemplate? = null
    @RequestMapping(value = ["/rtc-web/{index}"], method = [RequestMethod.GET])
    fun initWebRtc(@PathVariable("index") index: String): String {
        return "webrtc/webrtc-$index"
    }
}
