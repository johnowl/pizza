package com.johnowl.pizza.inventory.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ItemController {

    @GetMapping("/")
    fun index(): String {
        return "Hello world"
    }

}