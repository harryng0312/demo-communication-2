package org.harryng.communication.kernel.cache

import com.hazelcast.map.IMap
import java.io.Serializable

interface CacheService {
    companion object{
        const val K_SESSION_MAP = "sessionMap"
    }
    fun <K: Serializable, V: Any> getMap(name: String): IMap<K, V>
    fun getSession(): IMap<Serializable, Map<Serializable, Serializable>>
}