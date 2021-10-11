package org.harryng.communication.user.service

import org.harryng.communication.user.entity.UserImpl

interface UserService : BaseSearchableService<Long, UserImpl> {
    @Throws(RuntimeException::class, Exception::class)
    fun getByUsername(username: String?): UserImpl?
}
