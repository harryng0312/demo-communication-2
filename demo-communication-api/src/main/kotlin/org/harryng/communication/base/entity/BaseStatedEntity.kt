package org.harryng.communication.base.entity;

import java.util.Date;

interface BaseStatedEntity {
    var createdDate: Date
    var modifiedDate: Date
    var status: String
}
