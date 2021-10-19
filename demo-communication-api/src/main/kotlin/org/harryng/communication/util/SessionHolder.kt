package org.harryng.communication.util

import org.harryng.communication.user.entity.UserImpl
import java.io.Serializable
import java.util.*

data class SessionHolder private constructor(var user: UserImpl): Serializable {
    companion object{
        const val K_USER_ID = "userId"
        const val K_TOKEN_ID = "tokenId"
        const val K_SESSION_HOLDER = "sessionHolder"
        const val K_LANG="lang"

        const val ANONYMOUS_ID = 0L
        const val ANONYMOUS_USERNAME = "anonymous"

        private val anonymousUser: UserImpl
        init {
            val dateNow = Calendar.getInstance().time
            anonymousUser = UserImpl(
                id = ANONYMOUS_ID,
                createdDate = dateNow,
                modifiedDate = dateNow,
                status = "",
                username = ANONYMOUS_USERNAME,
                passwd = "",
                screenName = "",
                dob = dateNow,
                passwdEncryptedMethod = ""
            )
        }

        fun createAnonymousSession(): SessionHolder {
            return SessionHolder(anonymousUser)
        }
        fun createInstance(user: UserImpl): SessionHolder {
            return SessionHolder(user)
        }
    }

}