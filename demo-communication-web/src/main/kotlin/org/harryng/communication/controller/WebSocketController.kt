package org.harryng.communication.controller

import org.harryng.communication.auth.service.AuthService
import org.harryng.communication.dto.ChatMessage
import org.harryng.communication.dto.OutputChatMessage
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.event.EventListener
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.handler.annotation.SendTo
import org.springframework.messaging.simp.SimpMessageHeaderAccessor
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.messaging.simp.stomp.StompHeaderAccessor
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.Authentication
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.socket.messaging.SessionConnectEvent
import org.springframework.web.socket.messaging.SessionConnectedEvent
import org.springframework.web.socket.messaging.SessionDisconnectEvent
import java.text.SimpleDateFormat
import java.util.*
import javax.servlet.http.HttpServletRequest


@Controller
@RequestMapping("/websocket")
open class WebSocketController {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(WebSocketController::class.java)
    }
    @Autowired
    protected lateinit var request: HttpServletRequest

    @Autowired
    protected lateinit var authService: AuthService

    @Autowired
    private lateinit var simpMessagingTemplate: SimpMessagingTemplate

    @RequestMapping(value = ["", "/", "/ws-basic"], method = [RequestMethod.GET])
    fun initWsBasic(): String {
        return "ws/ws-basic"
    }

    @RequestMapping(value = ["/ws-handler"], method = [RequestMethod.GET])
    fun initWsHandler(): String {
        return "ws/ws-handler"
    }

    @RequestMapping(value = ["/ws-stomp"], method = [RequestMethod.GET])
    fun initWsStomp(): String {
        return "ws/ws-stomp"
    }

    @RequestMapping(value = ["/ws-stomp2"], method = [RequestMethod.GET])
    fun initWsStomp2(): String {
        return "ws/ws-stomp2"
    }

    @RequestMapping(value = ["/ws-stomp/{name}"], method = [RequestMethod.GET])
    fun initWsStompAuth(@PathVariable("name") name: String): String {
        return "ws/ws-stomp-$name"
    }

    @EventListener(SessionConnectedEvent::class)
    protected fun handleSessionConnectedEvent(event: SessionConnectedEvent) {
        // Get Accessor
        val sha = StompHeaderAccessor.wrap(event.message)
        //        Principal user = new StompPrincipal("");
//        sha.setUser();
    }

    @EventListener(SessionConnectEvent::class)
    protected fun handleSessionConnectEvent(event: SessionConnectEvent) {
        val sha = StompHeaderAccessor.wrap(event.message)
        val username = sha.getFirstNativeHeader("user")
        logger.info("User $username connected")
        val authentication: Authentication = UsernamePasswordAuthenticationToken(username, "", ArrayList())
        val securityContext = SecurityContextHolder.getContext()
        securityContext.authentication = authentication
    }

    @EventListener(SessionDisconnectEvent::class)
    protected fun handleSessionDisconnectEvent(event: SessionDisconnectEvent) {
        // Get Accessor
        val sha = StompHeaderAccessor.wrap(event.message)
    }

    @MessageMapping("/ws/chat")
    @SendTo("/topic/messages")
    @Throws(Exception::class)
    fun send(headerAccessor: SimpMessageHeaderAccessor, @Payload message: ChatMessage): OutputChatMessage {
        val time = SimpleDateFormat("HH:mm").format(Calendar.getInstance().time)
        return OutputChatMessage(message.from, message.to, message.content, time)
    }

    //    @MessageMapping("/ws/chat/user")
    //    @SendTo("/topic/messages")
    @Throws(Exception::class)
    fun sendToUser(headerAccessor: SimpMessageHeaderAccessor, @Payload message: ChatMessage) {
        val time = SimpleDateFormat("HH:mm").format(Calendar.getInstance().time)
        val to = message.to
        val oMsg = OutputChatMessage(message.from, message.to, message.content, time)
        val dest = String.format("/topic/messages/%s", to)
        simpMessagingTemplate.convertAndSend(dest, oMsg)
    }

    @MessageMapping("/ws/chat/user") //    @SendToUser("/topic/messages")
    @Throws(Exception::class)
    fun sendToUserAuth(headerAccessor: SimpMessageHeaderAccessor, @Payload message: ChatMessage): ChatMessage {
        val time = SimpleDateFormat("HH:mm").format(Calendar.getInstance().time)
        val to = message.to
        val oMsg = OutputChatMessage(message.from, message.to, message.content, time)
        val origin = String.format("/topic/messages/%s", message.from)
        val dest = String.format("/topic/messages/%s", to)
        simpMessagingTemplate.convertAndSend(origin, oMsg)
        simpMessagingTemplate.convertAndSend(dest, oMsg)
        return oMsg
    }


}
