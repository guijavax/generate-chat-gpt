package com.api.generatechatgpt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class GenerateTemplateApplication

fun main(args: Array<String>) {
	runApplication<GenerateTemplateApplication>(*args)
}
