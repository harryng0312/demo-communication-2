package org.harryng.communication.util

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import java.io.IOException
import java.util.*


object TextUtil {
    private val b64Encoder = Base64.getEncoder()
    private val b64Decoder = Base64.getDecoder()
    private val b64UrlEncoder = Base64.getUrlEncoder()
    private val b64UrlDecoder = Base64.getUrlDecoder()
    private val objectMapper = ObjectMapper()
    fun bytesToBase64Url(arr: ByteArray): String {
        return b64UrlEncoder.withoutPadding().encodeToString(arr)
    }

    fun bytesToBase64(arr: ByteArray): String {
        return b64Encoder.encodeToString(arr)
    }

    fun base64UrlToBytes(str: String): ByteArray {
        return b64UrlDecoder.decode(str)
    }

    fun base64ToBytes(str: String): ByteArray {
        return b64Decoder.decode(str)
    }

    @Throws(JsonProcessingException::class)
    fun <T : Any> objToJson(obj: T?): String {
        return objectMapper.writeValueAsString(obj)?:""
    }

    @Throws(IOException::class)
    fun <T : Any> jsonToObj(clazz: Class<T>, str: String?): T? {
        return objectMapper.readValue(str, clazz)
    }
}
