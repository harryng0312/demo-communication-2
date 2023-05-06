package org.harryng.communication.counter.entity

import org.harryng.communication.base.entity.AbstractEntity
import org.harryng.communication.base.entity.BaseEntity
import org.harryng.communication.kernel.counter.CounterPersistence
import java.util.concurrent.atomic.AtomicLong

open class CounterModel(
    override var id: String,
    open var value: AtomicLong,
    open var maxValue: Long = value.get() + CounterPersistence.DEFAULT_STEP + CounterPersistence.DEFAULT_CACHE_STEP
) : AbstractEntity<String>(id = id),
    BaseEntity<String>