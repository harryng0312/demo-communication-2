package org.harryng.communication.endpoint

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.socket.BinaryMessage
import org.springframework.web.socket.CloseStatus
import org.springframework.web.socket.PongMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.BinaryWebSocketHandler


class FileUploadHandler : BinaryWebSocketHandler() {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(FileUploadHandler::class.java)
    }
    @Throws(Exception::class)
    override fun afterConnectionEstablished(session: WebSocketSession) {
    }

    @Throws(Exception::class)
    override fun afterConnectionClosed(session: WebSocketSession, status: CloseStatus) {
    }

    @Throws(Exception::class)
    override fun handlePongMessage(session: WebSocketSession, message: PongMessage) {
    }

    @Throws(Exception::class)
    override fun handleTransportError(session: WebSocketSession, exception: Throwable) {
    }

    @Throws(Exception::class)
    override fun handleBinaryMessage(session: WebSocketSession, message: BinaryMessage) {
    }


}
