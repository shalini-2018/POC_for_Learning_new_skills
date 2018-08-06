package com.example.SpringBootBasicApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.HelloPrintController.PrintHello;

@SpringBootApplication
@ComponentScan (basePackages = {"com.example.HelloPrintController"})
public class SpringBootBasicApplication implements CommandLineRunner{

	
	@Autowired
	
	PrintHello printHello;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		printHello.printHello();
		
	}
}
