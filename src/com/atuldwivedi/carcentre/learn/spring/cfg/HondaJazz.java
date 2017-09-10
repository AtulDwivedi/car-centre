package com.atuldwivedi.carcentre.learn.spring.cfg;

public class HondaJazz implements Car {

	private MusicSystem musicSystem;

	private double mileage;
	private String color;

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public HondaJazz() {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving " + color + " " + this.getClass().getSimpleName()
				+ " at speed of 80KMPH. It gives mileage of " + mileage);
		musicSystem.playMusic();
	}
}
