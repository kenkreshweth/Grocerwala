package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.app")
public class GrocerwalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrocerwalaApplication.class, args);
		System.out.println("Started Application");

	}

}
//spring.datasource.url=jdbc:mysql://localhost:3306/grocerwala?createDatabaseIfNotExist=true
