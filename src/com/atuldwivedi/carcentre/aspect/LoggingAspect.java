package com.atuldwivedi.carcentre.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Pointcut("execution(* com.atuldwivedi.carcentre.*.*.*(..))")
	public void allMethods() {}
	
	@Pointcut("execution(* com.atuldwivedi.carcentre.controller.*.*(..))")
	public void allControllerMethods() {}
	
	@Pointcut("execution(* com.atuldwivedi.carcentre.service.*.*(..))")
	public void allServiceMethods() {}

	@Before("allMethods()")
	public void methodEntryLog(JoinPoint joinpoint) {
		System.out.println(">> "+joinpoint.getSignature()+" started");
	}
	
	@AfterReturning(pointcut="execution(* com.atuldwivedi.carcentre.*.*.*(..)) && !execution(* com.atuldwivedi.carcentre.controller.*.*(..))", returning="result")
	public void emthodExit(JoinPoint joinpoint, Object result) {
		System.out.println(result);
		System.out.println("<< "+joinpoint.getSignature()+" finished");
	}
	
	@Around("execution(* com.atuldwivedi.carcentre.dao.CustomerDao.getCustomers(..))")
	public Object aroundGetCustomers(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		long begin = System.currentTimeMillis();
		Object retVal = proceedingJoinPoint.proceed();
		long end = System.currentTimeMillis();
		System.out.println("Total execution time: "+(end-begin));
		return retVal;
	}
	
	@Around("execution(* com.atuldwivedi.carcentre.dao.CustomerDao.addOrupdateCustomer(..))")
	public Object aroundaddOrupdateCustomer(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		long begin = System.currentTimeMillis();
		Object[] args = proceedingJoinPoint.getArgs();
		for (int i = 0; i < args.length; i++) {
			System.out.println("Arg["+i+"] "+args[i]);
		}
		Object retVal = proceedingJoinPoint.proceed();
		long end = System.currentTimeMillis();
		System.out.println("Total execution time: "+(end-begin));
		return retVal;
	}
}
