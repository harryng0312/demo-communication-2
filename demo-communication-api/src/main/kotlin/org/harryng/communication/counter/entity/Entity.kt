package org.harryng.communication.counter.entity

import java.io.Serializable

interface Entity<Id: Serializable> {
    var id: Id
}