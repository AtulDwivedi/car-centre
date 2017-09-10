package com.atuldwivedi.carcentre.learn.spring.core.z;

public class SonyMusicSystem implements MusicSystem {

	public SonyMusicSystem(){
		playMusic();
	}
	
	@Override
	public void playMusic() {
		System.out.println(this.getClass().getSimpleName() + " is on.");
	}

}
