package com.atuldwivedi.carcentre.learn.spring.cfg;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//@Component("theHondaCity")
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

	@Override
	public void driveTheCar() {
		// TODO Auto-generated method stub
		
	}
}
