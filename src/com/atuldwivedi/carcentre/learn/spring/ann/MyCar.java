package com.atuldwivedi.carcentre.learn.spring.ann;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCar {

	public static void main(String[] args) {

		// just created the spring container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-annotation-based-config.xml");

		// retrieving the bean from Spring Container
		Car car = (Car) ctx.getBean("hondaAmaze");

		car.driveTheCar();

		ctx.close();
	}

}
