package org.harryng.communication.base.entity;

import java.io.Serializable
import java.util.Date;

abstract class AbstractStatedEntity<Id : Serializable> (
    override var id: Id,
    override var createdDate: Date,
    override var modifiedDate: Date,
    override var status: String
): AbstractEntity<Id>(id = id), BaseStatedEntity
