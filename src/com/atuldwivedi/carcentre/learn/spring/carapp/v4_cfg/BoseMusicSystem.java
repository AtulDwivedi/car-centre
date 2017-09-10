package com.atuldwivedi.carcentre.learn.spring.carapp.v4_cfg;

public class BoseMusicSystem implements MusicSystem {

	
	public BoseMusicSystem(){
		System.out.println(this.getClass().getSimpleName()+" is being constructed.");
	}
	
	@Override
	public void playMusic() {
		System.out.println("Playing music on " + this.getClass().getSimpleName());
	}

}
