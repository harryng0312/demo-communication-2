package org.harryng.communication.base.entity;

import java.io.Serializable

abstract class AbstractEntity<Id : Serializable>(override var id: Id) : BaseEntity<Id>
