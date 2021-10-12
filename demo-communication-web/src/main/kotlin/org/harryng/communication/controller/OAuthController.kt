package org.harryng.communication.controller

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import javax.annotation.PostConstruct


@CrossOrigin("*")
@RestController
@RequestMapping("/api/heroes")
open class OAuthController {
    companion object {
        val logger: Logger = LoggerFactory.getLogger(OAuthController::class.java)
    }
    private val someHeroes: MutableList<Hero> = mutableListOf()
    @PostConstruct
    protected fun init() {
        someHeroes.addAll(
            listOf(
                Hero(1, "Ken"),
                Hero(2, "Yannick"),
                Hero(3, "Pieter")
            )
        )
    }

    @GetMapping
    fun heroes(): List<Hero> {
        logger.info("=== hero list ===")
        return someHeroes
    }

    @GetMapping("/{id}")
    fun hero(@PathVariable("id") id: String): Hero {
        logger.info("Find ID:$id")
        return someHeroes.stream()
            .filter { h: Hero -> h.id.toString() == id }
            .findFirst()
            .orElse(null)
    }
}

class Hero(val id: Int, val name: String)
