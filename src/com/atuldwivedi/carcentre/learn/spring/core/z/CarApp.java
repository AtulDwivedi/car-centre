package com.atuldwivedi.carcentre.learn.spring.core.z;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/atuldwivedi/carcentre/learn/spring/core/z/spring-core.xml");
		Car car = ctx.getBean("car", Car.class);
		
//		Car car = new HondaAmaze();
		System.out.println(car.driveTheCar());
		
		
	}

}
