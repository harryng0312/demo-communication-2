package org.harryng.communication.dto

import com.google.gson.Gson
import javax.websocket.DecodeException
import javax.websocket.Decoder
import javax.websocket.EndpointConfig


open class ChatMessageDecoder : Decoder.Text<ChatMessage> {
    @Throws(DecodeException::class)
    override fun decode(s: String): ChatMessage {
        return gson.fromJson(s, ChatMessage::class.java)
    }

    override fun willDecode(s: String): Boolean {
        return s != null
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