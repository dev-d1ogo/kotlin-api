package br.diogo.forum.application.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {
    @GetMapping()
    fun hello(): String {

        return "Mudei tudo nisso aqui cabrunco doidop dadssa asaasdas s asda"
    }
}

