package org.harryng.communication.kernel.cache

import com.hazelcast.map.IMap
import java.io.Serializable

interface CacheService {
    companion object{
        const val K_SESSION = "session"
        const val K_SESSION_MAP = "sessionMap"
    }

    fun <K: Serializable, V: Serializable> getMap(name: String): IMap<K, V>
    fun getSessionMap(userKey: String): Map<String, Serializable>
    fun getSessionValue(userKey: String, dataKey: String): Serializable?
    fun putSessionValue(userKey: String, dataKey: String, value: Serializable)
    fun invalidateSession(userKey: String)
    fun removeSessionValues(userKey: String, vararg dataKeys: String)
}