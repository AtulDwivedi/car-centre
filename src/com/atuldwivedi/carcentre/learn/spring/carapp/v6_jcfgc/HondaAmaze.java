package com.atuldwivedi.carcentre.learn.spring.carapp.v6_jcfgc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HondaAmaze implements Car {

	@Autowired
	@Qualifier("philipsMusicSystem")
	private MusicSystem musicSystem;

	@Value("20.5")
	private double mileage;

	@Value("Grey")
	private String color;
	
	public HondaAmaze() {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving " + color + " " + this.getClass().getSimpleName()
				+ " at speed of 80KMPH. It gives mileage of " + mileage);
		musicSystem.playMusic();
	}
}
