package org.harryng.communication.dto

data class ChatMessage(
    var from: String = "",
    var to: String = "",
    var content: String = "",
)
