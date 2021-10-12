package org.harryng.communication.user.service

import org.harryng.communication.base.entity.BaseEntity
import org.harryng.communication.base.service.BaseService
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.io.Serializable

interface BaseSearchableService<Id : Serializable, T : BaseEntity<Id>> : BaseService<Id, T> {

    @Throws(RuntimeException::class, Exception::class)
    fun findByConditions(
        countJpql: String,
        params: Map<String, Serializable>
    ): Long

    @Throws(RuntimeException::class, Exception::class)
    fun findByConditions(
        queryJpql: String,
        params: Map<String, Serializable>,
        pageInfo: Pageable,
        total: Long = -1,
    ): Page<T>
}
