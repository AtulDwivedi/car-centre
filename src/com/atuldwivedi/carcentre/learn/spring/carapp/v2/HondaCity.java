package com.atuldwivedi.carcentre.learn.spring.carapp.v2;

public class HondaCity implements Car{

	public HondaCity() {
		System.out.println(this.getClass().getSimpleName() + " car is being constructed.");
	}

	@Override
	public void driveTheCar() {
		System.out.println(this.getClass().getSimpleName() + " is moving.");
	}

}
