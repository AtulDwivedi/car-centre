package com.atuldwivedi.carcentre.learn.spring.carapp.v2;

public class HondaAmaze implements Car{

	public HondaAmaze() {
		System.out.println(this.getClass().getSimpleName() + " car is being constructed.");
	}

	@Override
	public void driveTheCar() {
		System.out.println(this.getClass().getSimpleName() + " is moving.");
	}

}
