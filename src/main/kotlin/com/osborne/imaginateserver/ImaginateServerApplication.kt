package com.osborne.imaginateserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ImaginateServerApplication

fun main(args: Array<String>) {
	runApplication<ImaginateServerApplication>(*args)
}
