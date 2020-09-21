package com.example.formservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController

class FormController {

    @GetMapping("/status")
    fun status() : String = "$this OK"

    @GetMapping("/admin/status")
    fun adminStatus() : String = "$this ADMIN OK"
}
