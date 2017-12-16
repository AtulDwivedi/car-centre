package com.atuldwivedi.carcentre.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Pointcut("execution(* com.atuldwivedi.carcentre.*.*.*(..))")
	public void allMethods() {}

	@Before("allMethods()")
	public void methodEntryLog() {
		System.out.println("==> Method started");
	}
	
	@AfterReturning("execution(* com.atuldwivedi.carcentre.*.*.*(..))")
	public void emthodExit() {
		System.out.println("<== Method finished");
	}
}
