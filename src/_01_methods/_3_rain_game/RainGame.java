package _01_methods._3_rain_game;

import processing.core.PApplet;
import processing.core.PImage;

/*
 * Goal: Make a game where the user has to catch rain drops in a bucket!
 * 
 * In the setup() method:
 * 1. If you are using an image for the bucket, load it and resize it here.
 *    A bucket image, bucket.png, has been provided if you want to use it.
 *    bucket = loadImage("images/bucket.png");
 *    bucket.resize(100, 100);  // you can choose values other than 100, 100
 * 
 * In the draw() method:
 * 2. Set a background color
 * 
 * 3. Draw a raindrop (ellipse) at the top of the screen
 * 
 * 4. Make the rain fall down the screen.
 *    Hint: make a variable for the raindrop's Y position and change it after
 *    you draw the raindrop.
 * 
 * 5. When the rain falls off the bottom of the canvas, start a new rain drop
 *    falling from the top.
 *    Each new drop should start at a random position (X position) at the top.
 *    Hint: This code will get a random number between 0 and the window width.
 *    int randomNumber = (int)random(width);
 * 
 * 6. Draw a bucket (rectangle or image) at the bottom of the screen.
 *    The bucket's width needs to be stored in the bucketWidth variable.
 * 
 * 7. Make the bucket move side-to-side with the mouse. Hint: use mouseX
 * 
 * 8. When the rain drop has fallen to the bucket, call the checkCatch() method
 *    to see if the rain drop is in the bucket.
 * 
 * 9. Show the current score on the screen using the code below.
 *    Change the color if it does not show up on your background.
 *    fill(0, 0, 0);
 *    textSize(16);
 *    text("Score: " + score, 20, 20);
 */
public class RainGame extends PApplet {
	static final int WIDTH = 600;
	static final int HEIGHT = 600;

	int score = 0;
	int bucketWidth = 50;
	int bucketHeight;
	PImage bucket;
	PImage failbg;
	PImage yaybg;
	int y;
	int x;

	boolean over = false;
	boolean win = true;
	// Sets the size of your canvas
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);

	}

	@Override
	public void setup() {
		x = (int) random(width);
		bucket = loadImage("TinyTurtle.png");
		bucket.resize(125, 125);
		yaybg = loadImage("notfailure.jpg");
		yaybg.resize(WIDTH, HEIGHT);
		failbg = loadImage("failure.png");
		failbg.resize(WIDTH, HEIGHT);
		
	}

	@Override
	public void draw() {
		if(!over) {
			background(249, 228, 188);
			fill(15, 82, 186);
			stroke(0, 0, 0);
			ellipse(x, y, 25, 40);
			y += 17;
			if (y > height) {
				checkCatch(x);
				y = 0;
				x = (int) random(width);


			}
			image(bucket,mouseX, height - 138);


			fill(0, 0, 0);
			textSize(16);
			text("Score: " + score, 20, 20);

			if (score == 100) {
				over = true;
				win = true;
				
			}
			else if (score == -100) {
				over = true;
				win = false;
				

			}
		}else {
			if(win) {
				fill(0, 0, 0);
				textSize(30);
				background(yaybg);
				
				text("Congrats! \nYou beat the game!", 50, 300);

			}else {
				fill(128, 3, 3);
				textSize(30);
				background(failbg);
				text("Congrats! \nYou are a failure! :)", 150, 525);
			}

		}
	}

	static public void main(String[] args) {
		PApplet.main(RainGame.class.getName());

	}

	/*********************** DO NOT MODIFY THE CODE BELOW ********************/

	void checkCatch(int x) {
		if (x > mouseX && x < mouseX + 100) {
			score++;
		} else {
			score--;
		}
		println("Your score is now: " + score);

	}
}
