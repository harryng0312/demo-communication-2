package org.harryng.communication.base.persistence

import org.harryng.communication.base.entity.BaseEntity
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import java.io.Serializable

interface BaseSearchablePersistence<Id : Serializable, T : BaseEntity<Id>> : BasePersistence<Id, T> {

    @Throws(RuntimeException::class)
    fun selectByConditions(
        queryStr: String,
        pageInfo: Pageable,
        total: Long,
        params: Map<String, Serializable>
    ): Page<T>
}