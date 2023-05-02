package com.api.generatechatgpt.client.response

data  class Choice (
    var message: Message? = null,
    var finish_reason: String? = null,
    var index : Int  = 0)
