package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 1112;
    static final int HEIGHT = 892;
    PImage bowbg;
    PImage kitty;
    PImage temufactory;
    int kittyy = 0;
    int gravity = 1;
    int kittyYVelocity = -50;

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
        
    }

    @Override
    public void draw() {
    	background(bowbg);
    	image(temufactory, 0, HEIGHT - 485);
    		image(kitty, 0, kittyy);
    		kittyy += kittyYVelocity ;
    		kittyYVelocity += gravity;
        
    }

    public void mousePressed() {
    	kittyYVelocity = -10;
    	
    }
    
    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
