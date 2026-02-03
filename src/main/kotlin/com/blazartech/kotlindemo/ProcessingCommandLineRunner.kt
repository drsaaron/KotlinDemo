/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Kotlin.kt to edit this template
 */

package com.blazartech.kotlindemo

import org.springframework.boot.CommandLineRunner
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Autowired

@Component
//class ProcessingCommandLineRunner(val pab : ProcessingPAB) : CommandLineRunner {
class ProcessingCommandLineRunner : CommandLineRunner {

    @set: Autowired
    lateinit var pab : ProcessingPAB 

    private val log = LoggerFactory.getLogger(ProcessingCommandLineRunner::class.java)

    override fun run(vararg args: String) {
        val value = 10
        log.info("processing value {} to get output {}", value, pab.processValue(value))
    }
}

