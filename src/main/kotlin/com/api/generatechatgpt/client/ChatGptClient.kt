package com.api.generatechatgpt.client

import com.api.generatechatgpt.client.response.Response
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(name = "chat-gpt", url = "https://api.openai.com/v1/chat/completions")
interface ChatGptClient {
    @RequestMapping(method = [RequestMethod.POST], headers = ["content-type=application/json", "Authorization= Bearer seu token"])
     fun callChatGpt(@RequestBody model : Model) : Response


}