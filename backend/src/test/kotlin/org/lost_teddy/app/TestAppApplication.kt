package org.lost_teddy.app

import org.lost_teddy.api.AppApplication
import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<AppApplication>().with(TestcontainersConfiguration::class).run(*args)
}
