package com.atuldwivedi.carcentre.learn.spring.carapp.v2;

public class HondaJazz implements Car{

	public HondaJazz() {
		System.out.println(this.getClass().getSimpleName() + " car is being constructed.");
	}

	@Override
	public void driveTheCar() {
		System.out.println(this.getClass().getSimpleName() + " is moving.");
	}

}
