package _01_methods._5_FlappyBird;

import processing.core.PApplet;
import processing.core.PImage;

public class FlappyBird extends PApplet {
    static final int WIDTH = 556;
    static final int HEIGHT = 446;
    PImage bowbg;
    PImage kitty;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	bowbg = loadImage("FlappyKittyGameBg.png");
        bowbg.resize(WIDTH, HEIGHT);
        kitty = loadImage("FlappyKittyGameKitty.png");
        
    }

    @Override
    public void draw() {
    	background(bowbg);
    	image(kitty, 0, 0);
  
        
    }

    static public void main(String[] args) {
        PApplet.main(FlappyBird.class.getName());
    }
}
