package section2;

import org.jointheleague.graphical.robot.Robot;

public class FirstRobotProgram {

	public static void main(String[] args) throws InterruptedException {
		Robot RAI = new Robot();
		RAI.miniaturize();
		RAI.setSpeed(1000);
		RAI.penDown();
		RAI.setRandomPenColor();
		RAI.move(100);
		RAI.turn(90);
		RAI.move(100);
		RAI.turn(90);
		RAI.move(100);
		RAI.turn(90);
		RAI.move(100);
	}
}
