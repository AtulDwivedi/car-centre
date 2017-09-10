package com.atuldwivedi.carcentre.learn.spring.core.cfg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCar {

	public static void main(String[] args) {
//		Car car = new HondaCity();
//		Car car = new HondaAmaze();
		
		// just creatred the spring container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-core.xml");
		
		Car car  = (Car)ctx.getBean("theHondaCity");
		
		//singleton
//		Car car1  = (Car)ctx.getBean("car");
//		Car car2  = (Car)ctx.getBean("car");
//		System.out.println(car1.hashCode()+"  "+car2.hashCode());
		
//		Car car = CarFactory.getCar("amaze");
		System.out.println(car.driveTheCar());
		
		ctx.close();
	}

}
