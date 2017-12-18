package com.atuldwivedi.carcentre.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
//@Order(1)
public class MyLogginAspect2 {
	
	@Pointcut("execution(* com.atuldwivedi.carcentre.*.*.*(..))")
	public void allMethods() {}

	@Before("allMethods()")
	public void runBeforeEveryMethod(JoinPoint joinPoint) {
		System.out.println(">> "+this.getClass().getSimpleName()+" "+joinPoint.getSignature()+" started");
	}

//	@AfterReturning("allMethods()")
	public void runAftereveryMethod(JoinPoint joinPoint) {
		System.out.println(">> "+joinPoint.getSignature()+" finished");
	}
	
	//@Before("(execution(* com.atuldwivedi.carcentre.*.*.*(..))) && !(execution(* com.atuldwivedi.carcentre.controller.*.*(..)))")
	public void allButController(JoinPoint joinPoint) {
		System.out.println(">> "+joinPoint.getSignature().getName());
	}
}
