package com.atuldwivedi.carcentre.learn.spring.ann;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HondaAmaze implements Car {

	@Autowired
	private MusicSystem musicSystem;
	
	@Value("${mileage}")
	private double mileage;
	
	@Value("${color}")
	private String color;

	/*
	 * @Autowired public HondaAmaze(MusicSystem musicSystem) {
	 * System.out.println(this.getClass().getSimpleName() +
	 * " is being constructed."); this.musicSystem = musicSystem;
	 * musicSystem.playMusic(); }
	 */

	public HondaAmaze() {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving " + color + " " + this.getClass().getSimpleName()
				+ " at speed of 80KMPH with mileage of " + mileage);
		musicSystem.playMusic();
	}

	/*@Autowired
	public void setsdmflEMFEWMFMusicSystem(MusicSystem musicSystem) {
		System.out.println("1");
		this.musicSystem = musicSystem;
		musicSystem.playMusic();
	}
	
	@Autowired
	public void setsdmflEMFEWMjdlkallkdlFMusicSystem(MusicSystem musicSystem) {
		System.out.println("2");
		this.musicSystem = musicSystem;
		musicSystem.playMusic();
	}*/

}
