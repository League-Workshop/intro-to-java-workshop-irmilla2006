package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot RAIv3 = new Robot();
		RAIv3.miniaturize();
		// 5. Set your robot's pen down 
		RAIv3.penDown();
		// 3. Set the robot to go at max speed (100)
		RAIv3.setSpeed(500);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for (int i = 0; i < 100; i++) {
			RAIv3.setRandomPenColor();
			RAIv3.setPenWidth(i);
			RAIv3.move(5*i);
			RAIv3.turn(360/7);
			// 7. Change the pen color to random
		
			// 6. Move the robot 5 times the loop counter (5*i)
			
			// 2. Turn the robot 360/7 degrees to the right
		
			// 8. Set the pen width to i
		}	
	}
}
