package org.harryng.communication.counter.service

import org.harryng.communication.counter.entity.CounterImpl
import org.harryng.communication.kernel.counter.CounterPersistence
import kotlin.jvm.Throws

interface CounterService{
    @Throws(RuntimeException::class)
    fun insert(id: String, initValue: Long = CounterPersistence.DEFAULT_INIT_VALUE) : CounterImpl

    @Throws(RuntimeException::class)
    fun increment(id:String, step: Int = CounterPersistence.DEFAULT_STEP) : Long

    @Throws(RuntimeException::class)
    fun currentValue(id:String): Long
}