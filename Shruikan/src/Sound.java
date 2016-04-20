import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

/**
 * Клас за генериране на звуци
 */
public class Sound {
    public static void Road(int livesLeft) {

        try {
            File file = new File("");
            if (livesLeft <= 0) {
                 file = new File("Resource/final moster boar1.wav");
            } else if (livesLeft == 1) {
                 file = new File("Resource/Win.wav");
            } else {
                 file = new File("Resource/Start.wav");
            }
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.start();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }


}
