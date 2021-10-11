package org.harryng.communication.base.persistence

import org.harryng.communication.base.entity.BaseEntity
import org.harryng.communication.util.persistence.PersistenceUtil
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.io.Serializable

abstract class AbstractSearchablePersistence<Id : Serializable, T : BaseEntity<Id>>(entityClass: Class<T>) :
    AbstractPersistence<Id, T>(entityClass), BaseSearchablePersistence<Id, T> {

    @Throws(RuntimeException::class, Exception::class)
    override fun selectByConditions(
        queryStr: String,
        pageInfo: Pageable,
        total: Long,
        params: Map<String, Serializable>
    ): Page<T> {
        return PersistenceUtil.selectObjectByQuery(
            entityManager = entityManager,
            pageInfo = pageInfo,
            total = total,
            typeClass = entityClass,
            queryStr = queryStr
        )
    }
}