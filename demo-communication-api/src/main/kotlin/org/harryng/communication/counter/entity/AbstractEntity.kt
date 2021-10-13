package org.harryng.communication.counter.entity

import java.io.Serializable

abstract class AbstractEntity<Id : Serializable> : Entity<Id> {
    override var id: Id
        get() = id
        set(id) {
            this.id = id
        }
}