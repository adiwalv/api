package com.adiwal.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class ApiController {

    data class Greeting(val name: String)

    @GetMapping("/hello")
    fun helloplain() : Greeting = Greeting("vikas")

    @GetMapping("/api/hello")
    fun hello(@RequestParam name: String) : Greeting = Greeting(name)
}