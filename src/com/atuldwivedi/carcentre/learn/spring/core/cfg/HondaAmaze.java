package com.atuldwivedi.carcentre.learn.spring.core.cfg;

public class HondaAmaze implements Car {
	
	private MusicSystem musicSystem;
	
	public HondaAmaze(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
		musicSystem.playMusic();
	}
	
	@Override
	public String driveTheCar() {
		return "Driving " + this.getClass().getSimpleName() + " at speed of 100KMPH";
	}
}
