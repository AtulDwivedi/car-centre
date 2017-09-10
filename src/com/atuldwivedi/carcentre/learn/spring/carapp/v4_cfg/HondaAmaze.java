package com.atuldwivedi.carcentre.learn.spring.carapp.v4_cfg;

public class HondaAmaze implements Car {

	private MusicSystem musicSystem;

	private double mileage;

	private String color;

	public HondaAmaze(MusicSystem musicSystem) {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
		this.musicSystem = musicSystem;
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving " + color + " " + this.getClass().getSimpleName()
				+ " at speed of 80KMPH. It gives mileage of " + mileage);
		musicSystem.playMusic();
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
