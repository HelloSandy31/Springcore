package com.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.student.dao.StudentDAO;

@ComponentScan(basePackages = "com.student")
@SpringBootApplication
public class StrudentDalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrudentDalApplication.class, args);
			}
	
	
	

}
