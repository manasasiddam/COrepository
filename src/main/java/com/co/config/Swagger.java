package com.co.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;

public class Swagger {

	@Bean
	GroupedOpenApi handleApi() {
		return GroupedOpenApi.builder().group("CO-API").packagesToScan("com.co.controller").build();
	}

}
