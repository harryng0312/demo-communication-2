package org.harryng.communication.endpoint

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler
import java.io.IOException
import java.util.*


class WebRtcChatHandler : TextWebSocketHandler() {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(WebRtcChatHandler::class.java)
    }
    private val sessions = Collections.synchronizedList(ArrayList<WebSocketSession>())
    @Throws(InterruptedException::class, IOException::class)
    public override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
        logger.info("Session[" + session.id + "] Text msg:" + message.payload)
        for (webSocketSession in sessions) {
            if (webSocketSession.isOpen && session.id != webSocketSession.id) {
                webSocketSession.sendMessage(message)
            }
        }
    }

    @Throws(Exception::class)
    override fun afterConnectionEstablished(session: WebSocketSession) {
        logger.info("Disconnect:" + session.id)
        sessions.add(session)
    }
}
