package org.harryng.communication.base.persistence

import org.harryng.communication.base.entity.BaseEntity
import java.io.Serializable
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

abstract class AbstractPersistence<Id : Serializable, T : BaseEntity<Id>>(override val entityClass: Class<T>) :
    BasePersistence<Id, T> {
    @PersistenceContext(name = "primary")
    private lateinit var defaultEntityManager: EntityManager
    override val entityManager: EntityManager = defaultEntityManager

    fun getEntityManager(entityManagerName: String?): EntityManager? {
        return null
    }

    @Throws(RuntimeException::class, Exception::class)
    override fun selectById(id: Id): T? {
        return entityManager.find(entityClass, id)
    }

    @Throws(RuntimeException::class, Exception::class)
    override fun insert(obj: T): Int {
        entityManager.persist(obj)
        return 1
    }

    @Throws(RuntimeException::class, Exception::class)
    override fun update(obj: T): Int {
        entityManager.merge(obj)
        return 1
    }

    @Throws(RuntimeException::class, Exception::class)
    override fun delete(id: Id): Int {
        val cb = entityManager.criteriaBuilder
        val criteriaDelete = cb.createCriteriaDelete(entityClass)
        val root = criteriaDelete.from(entityClass)
        criteriaDelete.where(cb.equal(root.get<Any>("id"), id))
        val query = entityManager.createQuery(criteriaDelete)
        return query.executeUpdate()
    }
}
