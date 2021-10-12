package org.harryng.communication.base.persistence

import org.harryng.communication.base.entity.BaseEntity
import org.harryng.communication.util.persistence.PersistenceUtil
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.io.Serializable

abstract class AbstractSearchablePersistence<Id : Serializable, T : BaseEntity<Id>>(entityClass: Class<T>) :
    AbstractPersistence<Id, T>(entityClass), BaseSearchablePersistence<Id, T> {

    @Throws(RuntimeException::class, Exception::class)
    override fun countByConditions(
        countJpql: String,
        params: Map<String, Serializable>
    ): Long {
        return PersistenceUtil.countObjectByQuery(
            entityManager = entityManager,
            countJpql = countJpql,
            params = params
        )
    }

    @Throws(RuntimeException::class, Exception::class)
    override fun selectByConditions(
        queryJpql: String,
        params: Map<String, Serializable>,
        pageInfo: Pageable,
        total: Long,
    ): Page<T> {
        return PersistenceUtil.selectObjectByQuery(
            entityManager = entityManager,
            returnType = entityClass,
            queryJpql = queryJpql,
            params = params,
            pageInfo = pageInfo,
            total = total
        )
    }
}