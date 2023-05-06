package org.harryng.communication.base.entity;

import java.io.Serializable;

interface BaseEntity<Id : Serializable> : Serializable {
    var id: Id
}
