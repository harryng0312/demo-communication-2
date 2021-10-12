package org.harryng.communication.base.service

import org.harryng.communication.base.entity.BaseEntity
import org.harryng.communication.base.persistence.BaseSearchablePersistence
import org.harryng.communication.user.service.BaseSearchableService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.io.Serializable


abstract class AbstractSearchableService<Id : Serializable, T : BaseEntity<Id>> :
    AbstractService<Id, T>(), BaseSearchableService<Id, T> {
    abstract override val persistence: BaseSearchablePersistence<Id, T>

    @Throws(RuntimeException::class, Exception::class)
    override fun findByConditions(
        countJpql: String,
        params: Map<String, Serializable>
    ): Long {
        return persistence.countByConditions(
            countJpql,
            params
        )
    }

    @Throws(RuntimeException::class, Exception::class)
    override fun findByConditions(
        queryStr: String,
        params: Map<String, Serializable>,
        pageInfo: Pageable,
        total: Long
    ): Page<T> {
        return persistence.selectByConditions(
            queryStr,
            params,
            pageInfo,
            total
        )
    }
}
