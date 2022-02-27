package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/sam")
@RestController
class SamController {
    @GetMapping
    fun getSample(): String {
        return "That's right"
    }
}