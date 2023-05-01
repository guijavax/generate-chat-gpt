package com.api.generatechatgpt.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.HttpMethod
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(url = "https://api.openai.com/v1/chat/completions")
class ChatGptClient {

//    @RequestMapping(method = [RequestMethod.GET])
//    fun callChatGpt(@RequestBody )

}