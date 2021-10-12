package org.harryng.communication.dto

open class OutputChatMessage(
    override var from: String,
    override var to: String,
    override var content: String,
    open var time: String
) : ChatMessage(from = from, to = to, content = content)
