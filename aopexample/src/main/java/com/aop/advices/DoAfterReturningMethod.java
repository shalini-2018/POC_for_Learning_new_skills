package com.aop.advices;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class DoAfterReturningMethod implements AfterReturningAdvice {

	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println("****SPRING AOP**** DoAfterReturningMethod : Executing after method return!");
		
		    }

	

}
