import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		Scanner scan = new Scanner(System.in);
		
		String response = "";
		String[] audiosName = { "chipquest.wav", "glassbell.wav", "orchestra.wav", "piano.wav", "preview.wav", "snare.wav" };
		int choosedAudiosName = 0;
		
		System.out.println("Choose an audio to play (Enter a number between " + 1 + " and " + audiosName.length + " ):");
		int i;
		for (i = 0; i < audiosName.length; i++) {
			System.out.print(i + 1 + " = " + audiosName[i]);
			if (i + 1 != audiosName.length) System.out.print(", ");
			else System.out.println("");
		}
		
		do {
			if (choosedAudiosName <= 0 || choosedAudiosName > audiosName.length) System.out.println("if number is out of boundries please try again.");
			choosedAudiosName = scan.nextInt();
		} while(choosedAudiosName <= 0 || choosedAudiosName > audiosName.length);
		
		File file1 = new File(audiosName[choosedAudiosName - 1]);
		
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file1);
		Clip clip1 = AudioSystem.getClip();
		clip1.open(audioStream);
		
		while(!response.equals("Q")) {
			System.out.println("Controls:\n P = play, S = Stop, R = reset, Q = quit");
			System.out.print("Enter your choice: ");
			response = scan.next().toUpperCase();
			
			switch (response) {

				case "P": {
					clip1.start();
					break;
				}
				
				case "S": {
					clip1.stop();
					break;
				}
				
				case "R": {
					clip1.setMicrosecondPosition(0);
					break;
				}
				
				case "Q": {
					clip1.close();
					break;
				}
				
				default: System.out.println("Not a valid response.");
			}
		}
		
		scan.close();
		System.out.println("See you later :)");
	}

}
