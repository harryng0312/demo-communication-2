package org.harryng.communication.dto

open class ChatMessage(
    open var from: String = "",
    open var to: String = "",
    open var content: String = "",
)
