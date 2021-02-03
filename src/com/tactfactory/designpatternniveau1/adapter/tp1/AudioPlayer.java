package com.tactfactory.designpatternniveau1.adapter.tp1;

public class AudioPlayer implements MediaPlayer {

	private Mp3 mp3 = new Mp3();
	private Mp4 mp4 = new Mp4();
	private Vlc vlc = new Vlc();

	@Override
	public void play(String audioType, String fileName) {

		switch (audioType) {
		case "mp3": {
			mp3.play(audioType, fileName);
			break;
		}
		case "mp4": {
			mp4.play(audioType, fileName);
			break;
		}
		case "vlc": {
			vlc.play(audioType, fileName);
			break;
		}
		default:
			System.out.println("Invalid media. avi format not supported");
		}
	}
}
