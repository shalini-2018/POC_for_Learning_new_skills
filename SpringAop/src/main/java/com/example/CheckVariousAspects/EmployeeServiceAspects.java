package com.example.CheckVariousAspects;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspects {
	
	@Before(value = "execution(* com.example.SpringAOPProject.Service.EmployeeService.*(..)) and args(name,empId)")
	public void beforeAdvice(JoinPoint joinPoint, String name, String empId) {
		System.out.println("Before method:" + joinPoint.getSignature());

		System.out.println("Creating Employee with name - " + name + " and id - " + empId);
	}

	@After(value = "execution(* com.example.SpringAOPProject.Service.EmployeeService.*(..)) and args(name,empId)")
	public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
		System.out.println("After method:" + joinPoint.getSignature());

		System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
	}
	
	
	@AfterReturning(value = "execution(* com.example.SpringAOPProject.Service.EmployeeService.*(..)) and args(name,empId)") 
			
	public void afterReturning(JoinPoint joinPoint, String name, String empId) {
		System.out.println("After Returning method:" + joinPoint.getSignature());

		System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
	}
	
	
	@Around(value = "execution(* com.example.SpringAOPProject.Service.EmployeeService.*(..)) and args(name,empId)")
	public void around(JoinPoint joinPoint, String name, String empId) throws Throwable {
		System.out.println("Aroud  method:" + joinPoint.getSignature());

		System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
	}
	
}
