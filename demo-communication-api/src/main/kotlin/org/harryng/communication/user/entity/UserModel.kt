package org.harryng.communication.user.entity

import org.harryng.communication.base.entity.AbstractStatedEntity
import java.util.*

open class UserModel(
    override var id: Long,
    override var createdDate: Date,
    override var modifiedDate: Date,
    override var status: String,

    open var username: String,
    open var passwd: String,
    open var screenName: String,
    open var dob: Date,
    open var passwdEncryptedMethod: String
) : AbstractStatedEntity<Long>(
    id = id,
    createdDate = createdDate,
    modifiedDate = modifiedDate,
    status = status
)