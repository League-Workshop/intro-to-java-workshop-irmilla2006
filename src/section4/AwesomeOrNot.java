package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
public static void main(String[] args) {
// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int num = new Random().nextInt(4);
		// 3. Print out this variable 

	System.out.println(num);
	// 4. Get the user to enter something that they think is awesome
	String answer = JOptionPane.showInputDialog("What do you think is awesome? I think that many things are awesome!");
	if (num == 0) {
		JOptionPane.showMessageDialog(null, "You are so cool! Someday, hopefully everyone is as cool as YOU!");
	}
	if (num == 1) {
		JOptionPane.showMessageDialog(null, "Okay... Not VERY cool, but cool nonetheless.");
	}
	if(num == 2) {
		JOptionPane.showMessageDialog(null, "WHY do YOU think THAT is cool? Why do I even ask YOU?");
	}
	if(num == 3) {
		JOptionPane.showMessageDialog(null, "NO! NONONONONONONONONONONONONONONONONONONONONONONONONONONONONONONONONONO! I hate - ERROR: Kernel Panic. Rebooting all systems... Reboot unsuccessful. Factory Reset initiated.");
	}



	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer
}
}


