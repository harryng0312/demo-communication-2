package org.harryng.communication.dto

import java.io.Serializable

open class ChatMessage(
    open var from: String = "",
    open var to: String = "",
    open var content: ByteArray = byteArrayOf(),
    open var type: String = ""
): Serializable{
    companion object{
        const val TYPE_TEXT="text"
        const val TYPE_FILE="file-metadata"
        const val TYPE_FILE_PART="file-part"
    }
}
