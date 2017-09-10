package com.atuldwivedi.carcentre.learn.spring.carapp.v1;

public class HondaCity {

	public HondaCity() {
		System.out.println(this.getClass().getSimpleName() + " car is being constructed.");
	}

	public void driveTheCar() {
		System.out.println(this.getClass().getSimpleName() + " is moving.");
	}

}
