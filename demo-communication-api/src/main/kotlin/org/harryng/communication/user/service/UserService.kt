package org.harryng.communication.user.service

import org.harryng.communication.base.service.BaseSearchableService
import org.harryng.communication.user.entity.UserImpl
import org.harryng.communication.util.SessionHolder
import java.io.Serializable

interface UserService : BaseSearchableService<Long, UserImpl> {
    @Throws(RuntimeException::class, Exception::class)
    fun getByUsername(session: SessionHolder, username: String, extras: Map<String, Serializable> = mapOf()): UserImpl?
}
