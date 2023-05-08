import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        Scanner scanner = new Scanner(System.in);
        File file = new File("forest.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";
        while(!response.equals("Q")) {
            System.out.println("P = play, S = stop, R = reset, Q = quit");
            System.out.println("Enter your choice: ");

            String response = scanner.next();
            response = response.toUpperCase();
            switch(response) {
                case ("P"):
            }
            clip.start();
        }

    }
}