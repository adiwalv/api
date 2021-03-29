package com.adiwal.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.mongodb.config.EnableMongoAuditing
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories

@EnableMongoAuditing
@EnableMongoRepositories
@SpringBootApplication(
	scanBasePackageClasses = [ApiApplication::class],
	scanBasePackages = ["com.adiwal.*", "com.adiwal.authclient"]
)
class ApiApplication

fun main(args: Array<String>) {
	runApplication<ApiApplication>(*args)
}
