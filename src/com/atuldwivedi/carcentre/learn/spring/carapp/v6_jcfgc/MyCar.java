package com.atuldwivedi.carcentre.learn.spring.carapp.v6_jcfgc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyCar {

	public static void main(String[] args) {

		// just created the spring container
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MySpringConfig.class);

		// retrieving the bean from Spring Container
		Car car = (Car) ctx.getBean("hondaAmaze");

		car.driveTheCar();

		ctx.close();
	}

}
