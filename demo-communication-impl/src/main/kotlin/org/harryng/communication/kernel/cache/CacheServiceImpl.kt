package org.harryng.communication.kernel.cache

import com.hazelcast.core.HazelcastInstance
import com.hazelcast.map.IMap
import org.harryng.communication.util.SessionHolder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import java.io.Serializable

open class CacheServiceImpl : CacheService {
    @Autowired
    @Qualifier("cacheInstance")
    private lateinit var hzClient: HazelcastInstance

    private fun composeKey(userKey: String, dataKey: String): String = "${userKey}|${dataKey}"

    override fun <K : Serializable, V : Serializable> getMap(name: String): IMap<K, V> = hzClient.getMap(name)

    override fun getSessionMap(userKey: String): Map<String, Serializable> {
        val result = mutableMapOf<String, Serializable>()
        val map = getMap<String, Serializable>(CacheService.K_SESSION_MAP)
        for (entry in map) {
            val tmpKey = "${userKey}#"
            if (entry.key.startsWith(tmpKey)) {
                result[entry.key.substringAfter(tmpKey)] = entry.value
            }
        }
        return result.toMap()
    }

    override fun getSessionValue(userKey: String, dataKey: String): Serializable? {
        return getMap<String, Serializable>(CacheService.K_SESSION_MAP)[composeKey(userKey, dataKey)]
    }

    override fun putSessionValue(userKey: String, dataKey: String, value: Serializable) {
        getMap<String, Serializable>(CacheService.K_SESSION_MAP)[composeKey(userKey, dataKey)] = value
    }

    override fun invalidateSession(userKey: String) {
        val map = getMap<String, Serializable>(CacheService.K_SESSION_MAP)
        val tmpKey = "${userKey}#"
        val dataKeys = map.filterKeys { key -> key.startsWith(tmpKey) }.keys
        removeSessionValues(userKey, *dataKeys.toTypedArray())
    }

    override fun removeSessionValues(userKey: String, vararg dataKeys: String) {
        val map = getMap<String, Serializable>(CacheService.K_SESSION_MAP)
        dataKeys.forEach { dataKey -> map.remove(composeKey(userKey, dataKey)) }
    }
}