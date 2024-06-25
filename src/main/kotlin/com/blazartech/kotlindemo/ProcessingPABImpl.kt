/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Kotlin.kt to edit this template
 */

package com.blazartech.kotlindemo

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class ProcessingPABImpl : ProcessingPAB {

    private val log = LoggerFactory.getLogger(ProcessingPABImpl::class.java)

    override fun processValue(value: Int) : Int {
        log.info("got value {}", value)
        return value * 2
    }
}
