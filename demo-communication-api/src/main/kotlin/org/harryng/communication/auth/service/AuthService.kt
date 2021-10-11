package org.harryng.communication.auth.service

import org.harryng.communication.user.entity.UserImpl


interface AuthService {
    @Throws(RuntimeException::class)
    open fun loginByUsernamePassword(username: String, password: String): UserImpl?
}