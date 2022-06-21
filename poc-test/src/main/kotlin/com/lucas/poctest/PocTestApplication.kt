package com.lucas.poctest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PocTestApplication

fun main(args: Array<String>) {
	runApplication<PocTestApplication>(*args)
}
