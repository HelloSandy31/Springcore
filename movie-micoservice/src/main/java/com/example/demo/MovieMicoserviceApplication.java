package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.example")
public class MovieMicoserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieMicoserviceApplication.class, args);
	}

}
