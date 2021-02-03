package com.tactfactory.designpatternniveau1.adapter.tp1;

public class MediaAdapter implements MediaPlayer{
	
	private MediaPlayer player;

	public MediaAdapter  (String type) {
		// TODO Auto-generated constructor stub
		switch (type) {
		case "mp3": {
			player = new Mp3();
			break;
		}
		case "mp4": {
			player = new Mp4();
			break;
		}
		case "vlc": {
			player = new Vlc();
			break;
		}
		default:
			System.out.println("Invalid media. avi format not supported");
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		this.player.play(audioType, fileName);
	}
}
