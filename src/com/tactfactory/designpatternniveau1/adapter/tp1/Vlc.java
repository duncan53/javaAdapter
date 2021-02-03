package com.tactfactory.designpatternniveau1.adapter.tp1;

public class Vlc implements MediaPlayer{
	
	@Override
	public void play(String audioType, String fileName) {
		System.out.println("Playing " + audioType + " file. Name: " + fileName);
	  }
}
