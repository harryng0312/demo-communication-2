package org.harryng.communication.auth.service

import org.harryng.communication.user.entity.UserImpl
import org.harryng.communication.util.SessionHolder
import java.io.Serializable


interface AuthService {
    @Throws(RuntimeException::class, Exception::class)
    fun loginByUsernamePassword(username: String, password: String): UserImpl
    @Throws(RuntimeException::class, Exception::class)
    fun logout(userId: Long)
}