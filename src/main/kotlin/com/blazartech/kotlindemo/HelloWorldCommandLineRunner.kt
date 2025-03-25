/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Kotlin.kt to edit this template
 */

package com.blazartech.kotlindemo

import org.springframework.boot.CommandLineRunner
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Value

@Component
class HelloWorldCommandLineRunner : CommandLineRunner {

    private val log = LoggerFactory.getLogger(HelloWorldCommandLineRunner::class.java)

    @Value("\${demo.msg}") 
    private val message : String = ""

    override fun run(vararg args: String?) {
        args.forEach { log.info("Application args: $it") }
        log.info("Hello world!")
        log.info("message property = {}", message)

        val user = UserData(name = "scott", age = 25)
        log.info("user = {}", user)
    }
}

