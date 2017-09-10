package com.atuldwivedi.carcentre.learn.spring.core.z;

public class HondaAmaze implements Car {

	@Override
	public String driveTheCar() {
		return this.getClass().getSimpleName() + " is running...";
	}

}
