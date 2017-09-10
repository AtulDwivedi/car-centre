package com.atuldwivedi.carcentre.learn.spring.ann;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class HondaCity implements Car {

	@Autowired
	private MusicSystem musicSystem;

	private double mileage;

	private String color;

	@Value("10.4")
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Value("${hondaCity.color}")
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving " + color + " " + this.getClass().getSimpleName()
				+ " at speed of 80KMPH with mileage of " + mileage);
		musicSystem.playMusic();
	}

	/*
	 * @Autowired public void setMusicSystem(MusicSystem musicSystem) {
	 * this.musicSystem = musicSystem; musicSystem.playMusic(); }
	 */

	/*
	 * @Autowired public HondaCity(MusicSystem musicSystem) { this.musicSystem =
	 * musicSystem; musicSystem.playMusic(); }
	 */

	@PostConstruct
	public void putTheNumner() {
		System.out.println("Number is placed.");
	}

	@PreDestroy
	public void removeTheNumber() {
		System.out.println("Number is removed.");
	}
}
