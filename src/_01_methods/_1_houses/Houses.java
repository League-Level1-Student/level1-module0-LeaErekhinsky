package _01_methods._1_houses;

import java.awt.Color;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {

	Robot rob = new Robot();
	
	Random random = new Random();
	

	public void run() {
		rob.setPenWidth(6);
		rob.setSpeed(25);
		rob.setX(75);
		rob.setY(500);
		rob.penDown();
		for (int i = 1; i <= 10; i++) {
			drawHouse(random.nextInt(350 - 100) + 100);
			
		}
		
		rob.hide();

	}

	private void drawHouse(int height) {
		rob.move(height);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(height);
		rob.setPenColor(new Color(3, 125, 6, 255));
		rob.turn(-90);
		rob.move(60);
		rob.turn(-90);
		rob.setPenColor(Color.black);

	}
}
