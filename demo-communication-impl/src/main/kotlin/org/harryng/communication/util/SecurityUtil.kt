package org.harryng.communication.util

import org.slf4j.LoggerFactory
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.stream.Stream


object SecurityUtil {
    private val logger = LoggerFactory.getLogger(SecurityUtil::class.java)
    private var messageDigestMap: MutableMap<String, MessageDigest> = mutableMapOf()

    fun getMessageDigest(name: String): MessageDigest? {
        return messageDigestMap[name]
    }

    fun hashMessage(mdAlg: String, msgBin: ByteArray?): ByteArray {
        return getMessageDigest(mdAlg)!!.digest(msgBin)
    }

    init {
        messageDigestMap = HashMap()
        val msgDigestNames = arrayOf("MD5", "SHA1", "SHA-256", "SHA-512")
        Stream.of(*msgDigestNames).forEach { e: String ->
            try {
                val md = MessageDigest.getInstance(e)
                messageDigestMap[e] = md
            } catch (ex: NoSuchAlgorithmException) {
                logger.error("", e)
            }
        }
    }
}
