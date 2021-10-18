package org.harryng.communication.base.service


import org.harryng.communication.base.entity.BaseEntity
import org.harryng.communication.base.persistence.BasePersistence
import org.harryng.communication.util.SessionHolder
import java.io.Serializable

interface BaseService<Id : Serializable, T : BaseEntity<Id>> {
    val persistence: BasePersistence<Id, T>

    @Throws(RuntimeException::class, Exception::class)
    fun getById(session: SessionHolder, id: Id, extras: Map<String, Serializable> = mapOf()): T?

    @Throws(RuntimeException::class, Exception::class)
    fun add(session: SessionHolder, obj: T, extras: Map<String, Serializable> = mapOf()): Int

    @Throws(RuntimeException::class, Exception::class)
    fun edit(session: SessionHolder, obj: T, extras: Map<String, Serializable> = mapOf()): Int

    @Throws(RuntimeException::class, Exception::class)
    fun remove(session: SessionHolder, id: Id, extras: Map<String, Serializable> = mapOf()): Int
}
