package com.atuldwivedi.carcentre.learn.spring.cfg;

public class HondaCity implements Car {

	private MusicSystem musicSystem;

	public HondaCity(MusicSystem musicSystem) {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
		this.musicSystem = musicSystem;
	}

	@Override
	public void driveTheCar() {
		System.out.println(this.getClass().getSimpleName() + " is moving.");
		musicSystem.playMusic();
	}
}
