package _04_gui_from_scratch._3_sound_effects_machine;

import java.applet.AudioClip;
import java.io.*;
import javax.sound.sampled.*;

public class SoundEffectsMachine {
	
	public static void main(String[] args) {
		SoundEffectsMachine sound = new SoundEffectsMachine();
		sound.playSound("sawing-wood-daniel_simon.wav");
	}

	private void playSound(String soundFile) {
		String path = "src/_03_gui_from_scratch/_3_sound_effects_machine/";
		File sound = new File(path + soundFile);
		if (sound.exists()) {
			new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength() / 1000);
				} catch (Exception e) {
					System.out.println("Could not play this sound");
				}
			}).start();
		} else {
			System.out.println("File does not exist");
		}

	}
}