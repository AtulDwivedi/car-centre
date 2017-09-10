package com.atuldwivedi.carcentre.learn.spring.carapp.v6_jcfgc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HondaCity implements Car {

	private MusicSystem musicSystem;

	@Autowired
	public HondaCity(@Qualifier("sonyMusicSystem") MusicSystem musicSystem) {
		System.out.println(this.getClass().getSimpleName() + " is being constructed.");
		this.musicSystem = musicSystem;
	}

	@Override
	public void driveTheCar() {
		System.out.println(this.getClass().getSimpleName() + " is moving.");
		musicSystem.playMusic();
	}
}
