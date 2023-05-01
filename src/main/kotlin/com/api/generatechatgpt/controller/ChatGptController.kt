package com.api.generatechatgpt.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/chatgpt")
class ChapGptController {

    @GetMapping
    fun callChatGpt(text: String) {
        println("teste")
    }
}