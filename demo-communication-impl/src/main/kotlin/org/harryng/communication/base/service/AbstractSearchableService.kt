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
        pageInfo: Pageable,
        entityClass: Class<T>,
        queryStr: String,
        total: Long,
        params: Map<String, Serializable>
    ): Page<T> {
        return persistence.selectByConditions(queryStr, pageInfo, 0, params )
    }
}
