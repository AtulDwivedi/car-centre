package com.atuldwivedi.carcentre.learn.spring.carapp.v3;

public class MyCar {

	public static void main(String[] args) {
		Car car = CarFactory.getCar("jazz");

		car.driveTheCar();
	}
}
