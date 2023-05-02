package com.api.generatechatgpt.client

data class Model(
    var model : String = "",
    var messages : MutableList<Message>,
    var temperature : Double
) {
}