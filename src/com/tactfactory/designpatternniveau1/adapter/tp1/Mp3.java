package com.tactfactory.designpatternniveau1.adapter.tp1;

public class Mp3 implements MediaPlayer{
	
	@Override
	public void play(String audioType, String fileName) {
		System.out.println("Playing " + audioType + " file. Name: " + fileName);
	  }
}
