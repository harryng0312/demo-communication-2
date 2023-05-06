package org.harryng.communication.base.service

import org.harryng.communication.base.entity.BaseEntity
import org.harryng.communication.util.SessionHolder
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.io.Serializable

interface BaseSearchableService<Id : Serializable, T : BaseEntity<Id>> : BaseService<Id, T> {

    @Throws(RuntimeException::class, Exception::class)
    fun findByConditions(
        session: SessionHolder,
        countJpql: String,
        params: Map<String, Serializable>,
        extras: Map<String, Serializable> = mapOf()
    ): Long

    @Throws(RuntimeException::class, Exception::class)
    fun findByConditions(
        session: SessionHolder,
        queryJpql: String,
        params: Map<String, Serializable>,
        pageInfo: Pageable,
        total: Long = -1,
        extras: Map<String, Serializable> = mapOf()
    ): Page<T>
}
