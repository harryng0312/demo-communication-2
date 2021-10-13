package org.harryng.communication.counter.entity

import java.util.concurrent.atomic.AtomicLong

data class CounterImpl(
    override var id: String,
    override var value: AtomicLong
) : CounterModel(id, value) {
    constructor() : this(
        id = "",
        value = AtomicLong(0L)
    )
}