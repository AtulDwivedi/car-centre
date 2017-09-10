package com.atuldwivedi.carcentre.learn.spring.carapp.v5_ann;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyCar {

	public static void main(String[] args) {

		// just created the spring container
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/atuldwivedi/carcentre/learn/spring/carapp/v5_ann/spring-annotation-based-config.xml");

		// retrieving the bean from Spring Container
		Car car = (Car) ctx.getBean("hondaCity");

		car.driveTheCar();

		ctx.close();
	}

}
