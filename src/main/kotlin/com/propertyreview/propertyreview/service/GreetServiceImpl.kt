package com.propertyreview.propertyreview.service

import org.springframework.stereotype.Service

@Service
class GreetServiceImpl : GreetService {
    override fun getGreetMessage(): String {
        return "Welcome!"
    }
}