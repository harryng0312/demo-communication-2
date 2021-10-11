package org.harryng.communication.base.service

import org.harryng.communication.base.entity.BaseEntity
import org.harryng.communication.base.persistence.BasePersistence
import java.io.Serializable


abstract class AbstractService<Id : Serializable, T : BaseEntity<Id>> : BaseService<Id, T> {
    abstract override val persistence: BasePersistence<Id, T>

    @Throws(RuntimeException::class, Exception::class)
    override fun getById(id: Id): T? {
        return persistence.selectById(id)
    }

    @Throws(RuntimeException::class, Exception::class)
    override fun add(obj: T): Int {
        return persistence.insert(obj)
    }

    @Throws(RuntimeException::class, Exception::class)
    override fun edit(obj: T): Int {
        return persistence.update(obj)
    }

    @Throws(RuntimeException::class, Exception::class)
    override fun remove(id: Id): Int {
        return persistence.delete(id)
    }
}
