package org.harryng.communication.endpoint

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.socket.WebSocketSession
import java.io.IOException
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap


object WsSessionManager {
    val logger: Logger = LoggerFactory.getLogger(WsSessionManager::class.java)
    private val SESSION_POOL: ConcurrentMap<String, WebSocketSession> = ConcurrentHashMap()
    val sessionPool: Map<String, WebSocketSession>
        get() = SESSION_POOL

    fun add(key: String, session: WebSocketSession) {
        // Add session
        SESSION_POOL[key] = session
    }

    fun remove(key: String): WebSocketSession? {
        // Delete session
        return SESSION_POOL.remove(key)
    }

    fun removeAndClose(key: String) {
        val session = remove(key)
        if (session != null) {
            try {
                // Close connection
                session.close()
            } catch (e: IOException) {
            }
        }
    }

    operator fun get(key: String): WebSocketSession? {
        // Get session
        return SESSION_POOL[key]
    }
}
