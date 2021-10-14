package org.harryng.communication.user.service

import org.harryng.communication.base.persistence.BaseSearchablePersistence
import org.harryng.communication.base.service.AbstractSearchableService
import org.harryng.communication.user.entity.UserImpl
import org.harryng.communication.user.persistence.UserPersistence
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Sort
import java.io.Serializable


open class UserServiceImpl : AbstractSearchableService<Long, UserImpl>(), UserService {
    @Autowired
    private lateinit var userPersistence: UserPersistence
    
    override val persistence: BaseSearchablePersistence<Long, UserImpl>
        get() = userPersistence

    @Throws(RuntimeException::class, Exception::class)
    override fun getByUsername(username: String): UserImpl? {
        var result: UserImpl? = null
        val pageInfo = PageRequest.of(0, 5, Sort.Direction.ASC, "id")
        val jpql = "select u from ${UserImpl::class.qualifiedName} u where u.username = :username"
        val params = mapOf<String, Serializable>("username" to username)
        val pageResult: Page<UserImpl> = findByConditions(jpql, params, pageInfo)
        if (!pageResult.isEmpty) {
            result = pageResult.first()
        }
        return result
    }
}
