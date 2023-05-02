package com.api.generatechatgpt.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(name = "chat-gpt", url = "https://api.openai.com/v1/chat/completions")
interface ChatGptClient {
    @RequestMapping(method = [RequestMethod.POST], headers = ["content-type=application/json", "Authorization= Bearer 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"])
     fun callChatGpt(@RequestBody model : Model)


}