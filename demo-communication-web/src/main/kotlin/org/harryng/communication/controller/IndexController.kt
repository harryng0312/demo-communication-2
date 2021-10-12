package org.harryng.communication.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod


@Controller
open class IndexController {
    @RequestMapping(value = ["/", "/index"], method = [RequestMethod.GET, RequestMethod.POST])
    fun index(): String {
        return "index"
    }
}
