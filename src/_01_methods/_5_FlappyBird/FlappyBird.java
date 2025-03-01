package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
	static final int WIDTH = 1112;
	static final int HEIGHT = 892;
	PImage bowbg;
	PImage kitty;
	PImage temufactory;
	PImage temuworker1;
	PImage temuworkers2and3;
	PImage temuworker4;
	PImage temuworker5;
	PImage temuworker6;
	int kittyy = 0;
	int gravity = 1;
	int kittyYVelocity = 0;

	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	}

	@Override
	public void setup() {
		bowbg = loadImage("FlappyKittyGameBg.png");
		bowbg.resize(WIDTH, HEIGHT);
		kitty = loadImage("FlappyKittyGameKitty.png");
		temufactory = loadImage("temu-removebg-preview.png");
		temufactory.resize(1112, 600);
		temuworker1 = loadImage("TemuWorker1.png");
		temuworkers2and3 = loadImage("TemuWorkers2&3.png");
		temuworker4 = loadImage("TemuWorker4.png");
		temuworker5 = loadImage("TemuWorker5.png");
		temuworker6 = loadImage("TemuWorker6.png");
		

	}

	@Override
	public void draw() {
		background(bowbg);
		image(temufactory, 0, HEIGHT - 485);
		image(kitty, 0, kittyy);
		kittyy += kittyYVelocity;
		kittyYVelocity += gravity;
		image(temuworker1, 0, 0);

	}

	public void mousePressed() {
		kittyYVelocity = -15;

	}

	static public void main(String[] args) {
		PApplet.main(FlappyBird.class.getName());
	}
}
