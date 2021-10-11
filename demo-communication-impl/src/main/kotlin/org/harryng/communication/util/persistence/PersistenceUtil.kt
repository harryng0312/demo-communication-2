package org.harryng.communication.util.persistence

import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.Pageable
import javax.persistence.EntityManager
import javax.persistence.TypedQuery
import javax.persistence.criteria.CriteriaQuery

object PersistenceUtil {
    @Throws(RuntimeException::class, Exception::class)
    fun <T : Any?> selectObjectByCriteria(
        entityManager: EntityManager,
        pageInfo: Pageable,
        total: Long,
        criteriaQuery: CriteriaQuery<T>
    ): Page<T> {
        val typedQuery: TypedQuery<T> = entityManager.createQuery(criteriaQuery)
        typedQuery.firstResult = pageInfo.pageNumber * pageInfo.pageSize
        typedQuery.maxResults = pageInfo.pageNumber
        return PageImpl(typedQuery.resultList, pageInfo, total)
    }

    @Throws(RuntimeException::class, Exception::class)
    fun <T : Any?> selectObjectByQuery(
        entityManager: EntityManager,
        pageInfo: Pageable,
        total: Long,
        typeClass: Class<T>,
        queryStr: String
    ): Page<T> {
        val typedQuery: TypedQuery<T> = entityManager.createQuery(queryStr, typeClass)
        typedQuery.firstResult = pageInfo.pageNumber * pageInfo.pageSize
        typedQuery.maxResults = pageInfo.pageNumber
        return PageImpl(typedQuery.resultList, pageInfo, total)
    }
}