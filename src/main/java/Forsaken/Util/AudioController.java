package Forsaken.Util;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class AudioController {

    public static void playSound(SoundType sound) {
        try {
            Clip clip = AudioSystem.getClip();
            switch (sound) {
                case NONE: {
                    System.out.println("AudioController.playSound() encountered unidentified sound");
                }
                break;
                case STARTUP: {
                    clip.open(AudioSystem.getAudioInputStream(
                            new File("src/main/resources/audio/startup.wav").toURI().toURL()));
                }
                break;
            }
            clip.start();
        } catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }

    public enum SoundType {
        NONE,
        STARTUP
    }
}
