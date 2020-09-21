package com.example.formservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class FormServiceApplication

fun main(args: Array<String>) {
    runApplication<FormServiceApplication>(*args)
}
