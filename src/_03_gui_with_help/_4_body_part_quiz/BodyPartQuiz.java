package _03_gui_with_help._4_body_part_quiz;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	String biscuitGuy = "images/Biscuit Guy.png";
	String catInShoes = "images/Cat in Shoes.png";
	String shrek = "images/Shrek.png";
	String unpleasantMule = "images/Unpleasant Mule.png";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setSize(500, 500);

		showNextImage();

	}

	private void startQuiz() {

		int score = 0;
		String guess = JOptionPane.showInputDialog("who is this?");
		if (guess.equals("biscuit guy")) {
			System.out.println("wawwwwww ur awesome it IS biscuit guy :D");
			score +=1;
		}
		else {
			System.out.println("ur a failure this is why your father never returned with the milk its biscuit guy you idiot");
		}
		
		showNextImage();
		
		guess = JOptionPane.showInputDialog("who is this?");
		if (guess.equals("cat in shoes")) {
			System.out.println("wawwwwww ur awesome it IS cat in shoes :D");
			score +=1;
		}
		else {
			System.out.println("ur a failure this is why your father never returned with the milk its cat in shoes you idiot");
		}
		
		showNextImage();
		
		guess = JOptionPane.showInputDialog("who is this?");
		if (guess.equals("shrek")) {
			System.out.println("wawwwwww ur awesome it IS shrek :D");
			score +=1;
		}
		else {
			System.out.println("ur a failure this is why your father never returned with the milk its shrek you idiot");
		}

		showNextImage();
		
		guess = JOptionPane.showInputDialog("who is this?");
		if (guess.equals("unpleasant mule")) {
			System.out.println("wawwwwww ur awesome it IS unpleasant mule :D");
			score +=1;
		}
		else {
			System.out.println("ur a failure this is why your father never returned with the milk its unpleasant mule you idiot");
		}
		
		JOptionPane.showMessageDialog(null, score);

	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(biscuitGuy);
		imageList.add(imageLabel);
		imageLabel = loadImage(catInShoes);
		imageList.add(imageLabel);
		imageLabel = loadImage(shrek);
		imageList.add(imageLabel);
		imageLabel = loadImage(unpleasantMule);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();

		return new JLabel("No more images");
	}
}