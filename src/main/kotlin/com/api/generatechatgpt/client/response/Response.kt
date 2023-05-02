package com.api.generatechatgpt.client.response


data class Response(
    var id: String? = null,
    var `object`: String? = null,
    var created : Int = 0,
    var model: String? = null,
    var usage: Usage? = null,
    var choices: MutableList<Choice>? = null
)