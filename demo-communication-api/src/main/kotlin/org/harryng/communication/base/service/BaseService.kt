package org.harryng.communication.base.service


import org.harryng.communication.base.entity.BaseEntity
import org.harryng.communication.base.persistence.BasePersistence
import java.io.Serializable

interface BaseService<Id : Serializable, T : BaseEntity<Id>> {
    val persistence: BasePersistence<Id, T>

    @Throws(RuntimeException::class, Exception::class)
    fun getById(id: Id): T?

    @Throws(RuntimeException::class, Exception::class)
    fun add(obj: T): Int

    @Throws(RuntimeException::class, Exception::class)
    fun edit(obj: T): Int

    @Throws(RuntimeException::class, Exception::class)
    fun remove(id: Id): Int
}
