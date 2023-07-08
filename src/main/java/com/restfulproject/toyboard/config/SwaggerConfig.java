package com.restfulproject.toyboard.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

   @Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("스프링부트  API 문서")
						.version("1.0.0")
						.description("API 문서입니다.")
						.termsOfService("http://localhost/terms-of-service")
						.contact(new Contact().email("admin@example.com").name("API 관리팀"))
						.license(new License().name("Apache 2.0").url("http://localhost/license")));
	}

}
