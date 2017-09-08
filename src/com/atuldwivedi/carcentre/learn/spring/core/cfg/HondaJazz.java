package com.atuldwivedi.carcentre.learn.spring.core.cfg;

public class HondaJazz implements Car {
	
	@Override
	public String driveTheCar() {
		return "Driving " + this.getClass().getSimpleName() + " at speed of 90KMPH";
	}
}
