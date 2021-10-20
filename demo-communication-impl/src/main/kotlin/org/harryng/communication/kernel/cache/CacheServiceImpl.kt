package org.harryng.communication.kernel.cache

import com.hazelcast.core.HazelcastInstance
import com.hazelcast.map.IMap
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import java.io.Serializable

open class CacheServiceImpl : CacheService {
    @Autowired
    @Qualifier("cacheInstance")
    private lateinit var hzClient: HazelcastInstance

    override fun <K : Serializable, V : Any> getMap(name: String): IMap<K, V> = hzClient.getMap(name)

    override fun getSession(): IMap<Serializable, MutableMap<Serializable, Serializable>> =
        getMap(CacheService.K_SESSION_MAP)

}