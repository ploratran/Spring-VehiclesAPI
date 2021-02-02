package com.udacity.vehicles.config;

import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.Collections;

@Configuration
@EnableSwagger2 // enable Swagger 2 dependency
public class SwaggerConfig {
    // integrate Swagger into existing spring boot project using Docket bean:
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select() // returns the API selector builder which controls the endpoints exposed by Swagger
                .apis(RequestHandlerSelectors.any()) // makes documentation available for entire API
                .paths(PathSelectors.any()) // makes documentation available for entire API
                .build()
                .useDefaultResponseMessages(false); // customize response by turn off default responses
    }

    // ApiInfo contains custom information about API:
    // REFERENCE: https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Vehicles API",
                "This API contains information about vehicles with price and location.",
                "1.0",
                "http://localhost/8080/cars",
                new Contact("Phuong Tran", "www.example.com", "myeaddress@company.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
}