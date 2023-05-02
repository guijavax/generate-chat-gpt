package com.api.generatechatgpt.client.response

data class Usage (
    var prompt_tokens : Int = 0,
    var completion_tokens : Int = 0,
    var total_tokens : Int = 0
)
