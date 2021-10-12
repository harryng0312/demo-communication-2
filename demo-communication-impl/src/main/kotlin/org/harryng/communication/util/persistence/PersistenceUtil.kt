package org.harryng.communication.util.persistence

import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import java.io.Serializable
import javax.persistence.EntityManager
import javax.persistence.LockModeType
import javax.persistence.TypedQuery
import javax.persistence.criteria.CriteriaQuery

object PersistenceUtil {
    @Throws(RuntimeException::class, Exception::class)
    fun countObjectByQuery(
        entityManager: EntityManager,
        countJpql: String,
        params: Map<String, Serializable>
    ): Long {
        val typedQuery: TypedQuery<Long> = entityManager.createQuery(countJpql, Long::class.java)
        params.forEach { item ->
            typedQuery.setParameter(item.key, item.value)
        }
        return if (typedQuery.resultList.size > 0) typedQuery.resultList.first() else 0L
    }

    @Throws(RuntimeException::class, Exception::class)
    fun <T : Any> selectObjectByQuery(
        entityManager: EntityManager,
        returnType: Class<T>,
        queryJpql: String,
        params: Map<String, Serializable>,
        pageInfo: Pageable,
        total: Long = -1,
        lockModeType: LockModeType = LockModeType.NONE
    ): Page<T> {
        val typedQuery: TypedQuery<T> = entityManager.createQuery(queryJpql, returnType)
        typedQuery.lockMode = lockModeType
        typedQuery.firstResult = pageInfo.pageNumber * pageInfo.pageSize
        typedQuery.maxResults = pageInfo.pageNumber
        params.forEach { item ->
            typedQuery.setParameter(item.key, item.value)
        }
        val resultList = typedQuery.resultList
        val size = if (total >= 0) total else resultList.size.toLong()
        return PageImpl(resultList, pageInfo, size)
    }
}