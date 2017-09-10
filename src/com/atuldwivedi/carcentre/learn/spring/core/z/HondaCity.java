package com.atuldwivedi.carcentre.learn.spring.core.z;

public class HondaCity implements Car{
	
	private MusicSystem musicSystem;
	
	public HondaCity(MusicSystem musicSystem){
		this.musicSystem = musicSystem;
	}
	
	@Override
	public String driveTheCar() {
		return this.getClass().getSimpleName() + " is running...";
	}
}
