package com.atuldwivedi.carcentre.learn.spring.core.cfg;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("theHondaCity")
public class HondaCity implements Car {

	private MusicSystem musicSystem;

	private double mileage;
	private String color;

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String driveTheCar() {
		return "Driving " + color +" "+ this.getClass().getSimpleName() + " at speed of 80KMPH with mileage of " + mileage;
	}

	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
		musicSystem.playMusic();
	}

	@PostConstruct
	public void putTheNumner(){
		System.out.println("Number is placed.");
	}
	
	@PreDestroy
	public void removeTheNumber(){
		System.out.println("Number is removed.");
	}
}
