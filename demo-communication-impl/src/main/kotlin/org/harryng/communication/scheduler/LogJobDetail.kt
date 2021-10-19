package org.harryng.communication.scheduler

import org.quartz.JobExecutionContext
import org.quartz.JobExecutionException
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.scheduling.quartz.QuartzJobBean
import java.util.*
import kotlin.jvm.Throws

class LogJobDetail : QuartzJobBean() {

    companion object{
        val logger: Logger = LoggerFactory.getLogger(LogJobDetail::class.java)
    }

//    @Throws(JobExecutionException::class)
//    fun testLogSimpleScheduler(context: JobExecutionContext) {
//
//        logger.info("Simple scheduler: now is ${now}")
//    }
//    @Throws(JobExecutionException::class)
//    fun testLogCronScheduler(context: JobExecutionContext){
//        val now = Calendar.getInstance().time
//        logger.info("Cron scheduler: now is ${now}")
//    }
    @Throws(JobExecutionException::class)
    override fun executeInternal(context: JobExecutionContext) {
        val now = Calendar.getInstance().time
        logger.info("${context.mergedJobDataMap["job-type"]} scheduler: now is ${now}")
    }
}