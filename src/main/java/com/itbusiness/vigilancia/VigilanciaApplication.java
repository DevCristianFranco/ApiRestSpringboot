package com.itbusiness.vigilancia;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class VigilanciaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VigilanciaApplication.class, args);
	}

}
