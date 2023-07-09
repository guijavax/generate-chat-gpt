package com.api.generatechatgpt.controller

import com.api.generatechatgpt.client.ChatGptClient
import com.api.generatechatgpt.client.Message
import com.api.generatechatgpt.client.Model
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/chatgpt")
class ChapGptController {

    @Autowired
    lateinit var chatGptClient: ChatGptClient

    val texto : String =  "gpt-3.5-turbo"

    @Value("\${key}")
    lateinit var key : String

    @GetMapping
    fun callChatGpt(@RequestParam text : String) : String?{
        val response = chatGptClient.callChatGpt(mountBody(text), "Bearer $key")
        val content = response.choices?.let {
            it.get(0).message?.content
        }
        var newStr = content?.split("```java")

        println(newStr?.get(1))
        return content
    }

    private fun mountBody(text: String) =
        Model(texto, mutableListOf(Message (role = "user", content = text) ), temperature = 0.7)
}