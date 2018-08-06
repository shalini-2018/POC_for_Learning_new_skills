package com.example.SpringBootRestExampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.EmployeeService","com.example.EmployeeServiceImpl",
"com.example.Controller"})
public class SpringBootRestExampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestExampleProjectApplication.class, args);
	}
}
