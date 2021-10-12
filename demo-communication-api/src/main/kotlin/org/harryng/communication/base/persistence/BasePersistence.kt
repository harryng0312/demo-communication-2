package org.harryng.communication.base.persistence

import org.harryng.communication.base.entity.BaseEntity
import java.io.Serializable
import java.lang.RuntimeException
import javax.persistence.EntityManager
import kotlin.jvm.Throws

interface BasePersistence<Id: Serializable, T: BaseEntity<Id>> {
    val entityClass: Class<T>
    val entityManager: EntityManager

    @Throws(RuntimeException::class)
    fun selectById(id: Id): T?
    @Throws(RuntimeException::class)
    fun insert(obj: T): Int
    @Throws(RuntimeException::class)
    fun update(obj: T): Int
    @Throws(RuntimeException::class)
    fun delete(obj: Id): Int
}