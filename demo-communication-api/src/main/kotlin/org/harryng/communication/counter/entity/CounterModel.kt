package org.harryng.communication.counter.entity

import org.harryng.communication.kernel.CounterPersistence
import java.util.concurrent.atomic.AtomicLong

open class CounterModel(
    override var id: String,
    open var value: AtomicLong,
    open var maxValue: Long = value.get() + CounterPersistence.DEFAULT_STEP + CounterPersistence.DEFAULT_CACHE_STEP
) : AbstractEntity<String>(), Entity<String>