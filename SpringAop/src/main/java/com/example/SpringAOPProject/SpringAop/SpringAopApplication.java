package com.example.SpringAOPProject.SpringAop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@SpringBootApplication
@ComponentScan (basePackages = {"com.example.SpringAOPProject.Service","com.example.CheckVariousAspects","com.example.Controller","com.example.springAOP.Model"})


@EnableAspectJAutoProxy(proxyTargetClass=true)

public class SpringAopApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

}
