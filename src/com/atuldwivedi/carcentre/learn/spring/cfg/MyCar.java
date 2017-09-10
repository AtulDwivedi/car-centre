package com.atuldwivedi.carcentre.learn.spring.cfg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCar {

	public static void main(String[] args) {

		// just created the spring container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/atuldwivedi/carcentre/learn/spring/cfg/spring-config.xml");

		// retrieving the bean from Spring Container
		Car car = (Car) ctx.getBean("hondaAmaze");

		car.driveTheCar();

	}

}
