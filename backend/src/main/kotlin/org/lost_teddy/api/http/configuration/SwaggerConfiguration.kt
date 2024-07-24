package org.lost_teddy.api.http.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfiguration {
    @Bean
    fun openApi(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Kotlin Spring Clean Architecture Microservice")
                    .version("1.0.0")
            )
            .addServersItem(Server().url("http://localhost:8080/").description("dev"))
    }
}