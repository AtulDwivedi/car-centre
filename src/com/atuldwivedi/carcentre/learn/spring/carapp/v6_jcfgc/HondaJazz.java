package com.atuldwivedi.carcentre.learn.spring.carapp.v6_jcfgc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HondaJazz implements Car {

	private MusicSystem musicSystem;

	@Value("${hondaJazz.mileage}")
	private double mileage;
	
	@Value("${hondaJazz.color}")
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

	@Autowired
	@Qualifier("boseMusicSystem")
	public void setMusicSystem(MusicSystem musicSystem) {
		this.musicSystem = musicSystem;
	}

	@Override
	public void driveTheCar() {
		System.out.println("Driving " + color + " " + this.getClass().getSimpleName()
				+ " at speed of 80KMPH. It gives mileage of " + mileage);
		musicSystem.playMusic();
	}
	
	@PostConstruct
	public void putCarNumber(){
		System.out.println("Car number has been placed on "+this.getClass().getSimpleName());
	}
	
	@PreDestroy
	public void removeCarNumber(){
		System.out.println("Car number has been remved on "+this.getClass().getSimpleName());
	}
}
