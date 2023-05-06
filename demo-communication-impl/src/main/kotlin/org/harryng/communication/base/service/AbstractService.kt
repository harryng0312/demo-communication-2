package org.harryng.communication.base.service

import org.harryng.communication.base.entity.BaseEntity
import org.harryng.communication.base.persistence.BasePersistence
import org.harryng.communication.util.SessionHolder
import java.io.Serializable


abstract class AbstractService<Id : Serializable, T : BaseEntity<Id>> : BaseService<Id, T> {
    abstract override val persistence: BasePersistence<Id, T>

    @Throws(RuntimeException::class, Exception::class)
    override fun getById(session: SessionHolder, id: Id, extras: Map<String, Serializable>): T? {
        return persistence.selectById(id)
    }

    @Throws(RuntimeException::class, Exception::class)
    override fun add(session: SessionHolder, obj: T, extras: Map<String, Serializable>): Int {
        return persistence.insert(obj)
    }

    @Throws(RuntimeException::class, Exception::class)
    override fun edit(session: SessionHolder, obj: T, extras: Map<String, Serializable>): Int {
        return persistence.update(obj)
    }

    @Throws(RuntimeException::class, Exception::class)
    override fun remove(session: SessionHolder, id: Id, extras: Map<String, Serializable>): Int {
        return persistence.delete(id)
    }
}
