package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		main();		// 1. Use then speak method to say the word. "e.g. spell mandlebrot"
String name = SpeakAndSpell.speak("Oh, spell supercalifragilisticexpialidocious!");
		// 2. Catch the user's answer in a String
JOptionPane.showInputDialog("");
		// 3. If the user spelled the word correctly, speak "correct"
if(name.equals("supercalifragilisticexpialidocious")) {
	JOptionPane.showMessageDialog(null, "Good job, loser! You actually spelled the word as " + name + " and spelt it right! I have lost my voice, thanks to you!");
}	// 4. Otherwise say "wrong"

		// 5. repeat the process for other words
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}


