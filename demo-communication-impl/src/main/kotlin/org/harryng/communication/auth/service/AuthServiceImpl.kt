package org.harryng.communication.auth.service

import org.harryng.communication.user.entity.UserImpl
import org.harryng.communication.user.service.UserService
import org.harryng.communication.util.SecurityUtil
import org.harryng.communication.util.SessionHolder
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.cache.Cache
import org.springframework.cache.CacheManager
import java.io.Serializable

open class AuthServiceImpl : AuthService {
    @Autowired
    private lateinit var userService: UserService

    @Autowired
    @Qualifier("cacheManager")
    private lateinit var cacheManager: CacheManager
    protected val cache: Cache get() = cacheManager.getCache("session")!!

    @Throws(RuntimeException::class, Exception::class)
    override fun loginByUsernamePassword(username: String, password: String): UserImpl {
        val user: UserImpl? = userService.getByUsername(SessionHolder.createAnonymousSession(), username)
        if ("" == password) {
            throw Exception("Password is not valid")
        }
        if (user != null) {
            var inputHashedPasswd = password
            if (!"plain".equals(user.passwdEncryptedMethod, ignoreCase = true)) {
                val inputPasswdBin = password.toByteArray(charset("UTF-8"))
                val inputHashedPasswdBin: ByteArray =
                    SecurityUtil.hashMessage(user.passwdEncryptedMethod, inputPasswdBin)
                inputHashedPasswd = String(inputHashedPasswdBin)
            }
            if (inputHashedPasswd == user.passwd) {
                cache.putIfAbsent(user.id, SessionHolder.createInstance(user))
            }else{
                throw Exception("Password is not matched")
            }
        } else {
            throw Exception("User is not found")
        }
        return user
    }

    override fun logout(userId: Long) {
        cache.evictIfPresent(userId)
    }
}
