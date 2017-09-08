package com.atuldwivedi.carcentre.learn.spring.core.cfg;

public class PhilipsMusicSystem implements MusicSystem {

	@Override
	public void playMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
