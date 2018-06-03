package com.atuldwivedi.carcentre.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
//@Order(2)
public class MyLogginAspect {
	
	@Pointcut("execution(* com.atuldwivedi.carcentre.*.*.*(..))")
	public void allMethods() {}

	@Before("allMethods()")
	@Order(2)
	public void runBeforeEveryMethod(JoinPoint joinPoint) {
		System.out.println("1>> "+this.getClass().getSimpleName()+" "+joinPoint.getSignature()+" started");
	}
	
	/*@Before("allMethods()")
	@Order(1)
	public void runBeforeEveryMethod2(JoinPoint joinPoint) {
		System.out.println("2>> "+this.getClass().getSimpleName()+" "+joinPoint.getSignature()+" started");
	}*/

	//@AfterReturning(pointcut="allMethods()",returning="retVal")
	public void runAftereveryMethod(JoinPoint joinPoint, Object retVal) {
		System.out.println(">> "+joinPoint.getSignature()+" finished"+retVal);
	}
	
	//@Before("(execution(* com.atuldwivedi.carcentre.*.*.*(..))) && !(execution(* com.atuldwivedi.carcentre.controller.*.*(..)))")
	public void allButController(JoinPoint joinPoint) {
		System.out.println(">> "+joinPoint.getSignature().getName());
	}
	
	//@Around("execution(* com.atuldwivedi.carcentre.dao.CustomerDao.getCustomers(..))")
	public Object aroundGetcustomers(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		// call the actual method
		Object result = proceedingJoinPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken: "+(endTime-startTime));
		return result;
	}
	
	
	//@Around("execution(* com.atuldwivedi.carcentre.dao.CustomerDao.addOrupdateCustomer(..))")
	public Object aroundSaveOrUpdate(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		
		Object[] args = proceedingJoinPoint.getArgs();
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		
		// call the actual method
		Object result = proceedingJoinPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("Total time taken: "+(endTime-startTime));
		return result;
	}
	
	//@AfterThrowing(pointcut="allMethods()", throwing="ex")
	public void afterTrowing(Throwable ex) {
		System.out.println("----------------\n"+ex.getMessage());
	}
}
