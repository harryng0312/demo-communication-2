package org.harryng.communication.user.entity

import java.util.*

data class UserImpl(
    override var id: Long = 0L,
    override var createdDate: Date = Calendar.getInstance().time,
    override var modifiedDate: Date = createdDate,
    override var status: String = "",

    override var username: String = "",
    override var passwd: String = "",
    override var screenName: String = "",
    override var dob: Date = Calendar.getInstance().time,
    override var passwdEncryptedMethod: String = ""

) : UserModel(
    id = id,
    createdDate = createdDate,
    modifiedDate = modifiedDate,
    status = status,

    username = username,
    passwd = passwd,
    screenName = screenName,
    dob = dob,
    passwdEncryptedMethod = passwdEncryptedMethod
)