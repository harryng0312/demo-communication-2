package org.harryng.communication.auth.service

import org.harryng.communication.user.entity.UserImpl
import org.harryng.communication.user.service.UserService
import org.harryng.communication.util.SecurityUtil
import org.springframework.beans.factory.annotation.Autowired

open class AuthServiceImpl : AuthService {
    @Autowired
    private lateinit var userService: UserService

    @Throws(RuntimeException::class, Exception::class)
    override fun loginByUsernamePassword(username: String, password: String): UserImpl {
        val user: UserImpl? = userService.getByUsername(username)
        if ("" == password) {
            throw Exception("Password is not valid")
        }
        if (user != null) {
            if ("plain".equals(user.passwdEncryptedMethod, ignoreCase = true)) {
                if (password != user.passwd) {
                    throw Exception("Username or Password is not matched")
                }
            } else {
                val inputPasswdBin = password.toByteArray(charset("UTF-8"))
                val inputHashedPasswdBin: ByteArray =
                    SecurityUtil.hashMessage(user.passwdEncryptedMethod, inputPasswdBin)
                val inputHashedPasswd = String(inputHashedPasswdBin)
                if (inputHashedPasswd != user.passwd) {
                    throw Exception("Password is not matched")
                }
            }
        } else {
            throw Exception("User is not found")
        }
        return user
    }
}
