package com.sylix.posttemplateweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PostTemplateWebApplication

fun main(args: Array<String>) {
	runApplication<PostTemplateWebApplication>(*args)
}
