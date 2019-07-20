package com.ayush.todolistmvc

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodolistMvcApplication

fun main(args: Array<String>) {
	runApplication<TodolistMvcApplication>(*args)
}
