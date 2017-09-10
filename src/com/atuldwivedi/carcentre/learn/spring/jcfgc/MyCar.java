package com.atuldwivedi.carcentre.learn.spring.jcfgc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
