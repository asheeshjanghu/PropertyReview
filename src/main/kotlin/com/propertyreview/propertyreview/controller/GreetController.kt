package com.propertyreview.propertyreview.controller

import com.propertyreview.propertyreview.service.GreetService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetController {

    @Autowired
    lateinit var greetService: GreetService

    @GetMapping("/")
    fun homePageGreet(): String {
        return greetService.getGreetMessage()
    }
}