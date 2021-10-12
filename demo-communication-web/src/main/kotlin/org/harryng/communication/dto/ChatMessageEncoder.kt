package org.harryng.communication.dto

import com.google.gson.Gson
import javax.websocket.EncodeException
import javax.websocket.Encoder
import javax.websocket.EndpointConfig


class ChatMessageEncoder : Encoder.Text<ChatMessage?> {
    @Throws(EncodeException::class)
    override fun encode(message: ChatMessage?): String {
        return gson.toJson(message)
    }

    override fun init(endpointConfig: EndpointConfig) {
        // Custom initialization logic
    }

    override fun destroy() {
        // Close resources
    }

    companion object {
        private val gson = Gson()
    }
}
