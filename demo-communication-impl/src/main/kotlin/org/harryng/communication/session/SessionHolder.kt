package org.harryng.communication.session

import java.util.concurrent.ConcurrentHashMap

object SessionHolder {
    private val sessionMap = ConcurrentHashMap<String, MutableMap<String, Any?>>()

    const val K_USER = "user"
    const val K_AUTH_INFO = "authInfo"
    fun getSession(key: String, created: Boolean): MutableMap<String, Any?>? {
        if (created && sessionMap[key] == null) {
            sessionMap[key] = mutableMapOf()
        }
        return sessionMap[key]
    }

    fun getSession(key: String): MutableMap<String, Any?>? {
        return getSession(key, true)
    }

    fun invalidateSession(key: String): Boolean {
        var rs = true
        if(sessionMap.contains(key)){
            sessionMap[key]?.clear()
            rs = (sessionMap.remove(key) != null)
        }
        return rs
    }
}