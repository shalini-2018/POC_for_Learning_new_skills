package com.aop.advices;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class DoBeforeMethod implements MethodBeforeAdvice   {

	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println("****SPRING AOP**** DoBeforeMethod : Executing before method!");
		
	}

}
