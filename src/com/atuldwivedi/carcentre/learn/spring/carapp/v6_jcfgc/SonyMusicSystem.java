package com.atuldwivedi.carcentre.learn.spring.carapp.v6_jcfgc;

import org.springframework.stereotype.Component;

@Component
public class SonyMusicSystem implements MusicSystem {
	
	public SonyMusicSystem() {
		System.out.println(this.getClass().getSimpleName()+" is being constructed.");
	}

	@Override
	public void playMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
