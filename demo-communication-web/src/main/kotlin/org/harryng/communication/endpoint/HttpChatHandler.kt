package org.harryng.communication.endpoint

import org.harryng.communication.dto.ChatMessage
import org.harryng.communication.dto.ChatMessageDecoder
import org.harryng.communication.dto.ChatMessageEncoder
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.socket.CloseStatus
import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler
import java.io.IOException
import java.time.LocalDateTime
import javax.websocket.EncodeException


class HttpChatHandler : TextWebSocketHandler() {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(HttpChatHandler::class.java)
        @Throws(IOException::class, EncodeException::class)
        private fun broadcast(message: WebSocketMessage<*>) {
            WsSessionManager.sessionPool.forEach { entry ->
                synchronized(entry) {
                    try {
                        val session: WebSocketSession = entry.value
                        session.sendMessage(message)
                        //.getBasicRemote().sendObject(message);
                    } catch (e: IOException) {
                        logger.error("", e)
                    }
                }
            }
        }
    }
    private val decoder = ChatMessageDecoder()
    private val encoder = ChatMessageEncoder()

    @Throws(Exception::class)  //    @DestinationVariable
    override fun afterConnectionEstablished(session: WebSocketSession) {
        val token = session.attributes["username"]
        if (token != null) {
            // The user is connected successfully and put into the online user cache
            WsSessionManager.add(token.toString(), session)
            val message = ChatMessage()
            message.from = (token as String?)!!
            message.content = "Connected!"
            broadcast(TextMessage(encoder.encode(message)))
        } else {
            throw RuntimeException("User login has expired!")
        }
    }

    @Throws(Exception::class)
    override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
        // Get messages from clients
        val payload = message.payload
        val chatMsg = decoder.decode(payload)
        chatMsg.from = (session.attributes["username"] as String?)!!
        val token = session.attributes["username"]
        logger.info("server Receive $token Transmitted $payload")
        session.sendMessage(
            TextMessage(
                "server Send to " + token + " news " + payload + " " + LocalDateTime.now().toString()
            )
        )
        broadcast(TextMessage(encoder.encode(chatMsg)))
    }

    @Throws(Exception::class)
    override fun afterConnectionClosed(session: WebSocketSession, status: CloseStatus) {
        val token = session.attributes["username"]
        if (token != null) {
            // User exit, remove cache
            WsSessionManager.remove(token.toString())
        }
    }


}
