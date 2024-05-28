package com.kdk.wake_up

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WakeUpApplication

fun main(args: Array<String>) {
	runApplication<WakeUpApplication>(*args)
}
