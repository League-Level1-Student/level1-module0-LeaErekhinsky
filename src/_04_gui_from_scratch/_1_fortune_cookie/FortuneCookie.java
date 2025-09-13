package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class FortuneCookie implements ActionListener {

	public void showButton() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click me! Come on, we both know you have absolutely nothing better to do!!");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		System.out.println("Button clicked");
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new FortuneCookie().showButton();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		int rand = new Random().nextInt(5);

		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will get a new pair of pants.");

		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null,
					"You will commit a crime within the next year,\nbut I don't even think you need me to tell you that.");

		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You probably won't die within the next month.\nProbably.");

		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null,
					"You will get a really lame fortune next time you click the JButton\nbecause the author is running out of ideas.");

		} else if (rand == 4) {
			JOptionPane.showMessageDialog(null,
					"Your IQ will somehow manage to decrease even further by the time you are finished with this button.\nWhy are you even doing this?\nDo you really have nothing better to do?");

		}
	}
}
