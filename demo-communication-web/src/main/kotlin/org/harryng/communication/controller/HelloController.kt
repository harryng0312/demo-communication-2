package org.harryng.communication.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
open class HelloController {
    @RequestMapping(value = ["/hello"], method = [RequestMethod.GET])
    fun hello(@RequestParam(name = "name", required = false, defaultValue = "World") name: String): String {
        return "Hello $name"
    }
}
