package _01_methods._1_houses;

import java.awt.Color;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {

	Robot rob = new Robot();

	Random random = new Random();

	public void run() {
		Robot.setWindowColor(Color.black);
		
	
		int intheight = 0;
		rob.setPenWidth(6);
		rob.setSpeed(25);
		rob.setX(75);
		rob.setY(500);
		rob.penDown();
		
		/*
		 * public static int showOptionDialog(Component parentComponent,
                                   Object message,
                                   String title,
                                   int optionType,
                                   int messageType,
                                   Icon icon,
                                   Object[] options,
                                   Object initialValue)
                            throws HeadlessException
		 */
		for (int i = 1; i <= 10; i++) {
			int height = JOptionPane.showOptionDialog(null, "Choose a size", "", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[] { "large", "medium", "small"} , null);
System.out.println(height);
			if (height == 2) {
				intheight = 60;

			}

			if (height == 1) {
				intheight = 120;

			}

			if (height == 0) {
				intheight = 250;

			}

			int color = JOptionPane.showOptionDialog(null, "Choose a color", "", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, new String[] {"red", "orange", "yellow", "green", "blue", "purple", "pink",
					"grey", "black", "cyan"} , null);
			if (color == 0) {
				rob.setPenColor(Color.red);

			}

			if (color == 1) {
				rob.setPenColor(Color.orange);

			}

			if (color == 2) {
				rob.setPenColor(Color.yellow);

			}

			if (color == 3) {
				rob.setPenColor(Color.green);

			}

			if (color == 4) {
				rob.setPenColor(Color.blue);

			}

			if (color == 5) {
				rob.setPenColor(Color.magenta);

			}

			if (color == 6) {
				rob.setPenColor(Color.pink);

			}

			if (color == 7) {
				rob.setPenColor(Color.lightGray);

			}

			if (color == 8) {
				rob.setPenColor(Color.black);

			}

			if (color == 9) {
				rob.setPenColor(Color.cyan);

			}

			drawHouse(intheight);

		}

		rob.hide();

	}

	private void drawHouse(int intheight) {
		rob.move(intheight);
		if (intheight > 245) {
			drawFlatRoof();

		}
		else {
			drawPointyRoof();
			
		}
		rob.move(intheight);
		rob.setPenColor(new Color(3, 125, 6, 255));
		rob.turn(-90);
		rob.move(60);
		rob.turn(-90);
		rob.setPenColor(Color.black);

	}

	private void drawFlatRoof() {
		rob.turn(90);
		rob.move(20);
		rob.turn(90);

	}

	private void drawPointyRoof() {
		rob.turn(45);
		rob.move(12);
		rob.turn(90);
		rob.move(12);
		rob.turn(45);;

	}
}
