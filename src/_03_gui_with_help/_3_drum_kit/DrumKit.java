package _03_gui_with_help._3_drum_kit;

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;

import game_tools.Sound;

public class DrumKit implements MouseListener {
    static boolean canPlaySounds = true;
    JLabel drumLabel;
    JLabel drumLabel2;
    JFrame jf1 = new JFrame();
    public void run() {
    	
    	jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	jf1.setTitle("title 1");
    	JPanel jp1 = new JPanel();
    	jf1.add(jp1);
    	
    	String snare = "snare.jpg";
        drumLabel = createLabelImage(snare);

        jp1.add(drumLabel);
        drumLabel.addMouseListener(this);
        
        GridLayout gl = new GridLayout();
        jp1.setLayout(gl);
        
        String cymbal = "cymbal.jpg";
        drumLabel2 = createLabelImage(cymbal);
        jp1.add(drumLabel2);
        drumLabel2.addMouseListener(this);
        jf1.pack();
        jf1.setVisible(true);
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
            JLabel labelClicked = (JLabel)e.getSource();

            if (labelClicked == drumLabel) {
            	playSound("drum.wav");
            	
            }
            
            if (labelClicked == drumLabel2) {
            	playSound("cymbal.wav");
            	
            }
    }

    private JLabel createLabelImage(String fileName) {
        JLabel imageLabel = new JLabel();
        URL imageURL = getClass().getResource(fileName);
        if (imageURL == null) {
            imageLabel.setText("Could not find image " + fileName);
        } else {
            Icon icon = new ImageIcon(imageURL);
            imageLabel.setIcon(icon);
        }
        return imageLabel;
    }


    public static synchronized void playSound(String fileName) {
        if (canPlaySounds) {
            Sound s = new Sound("_03_gui_with_help/_3_drum_kit/" + fileName);
            s.play();
        } else {
            JOptionPane.showMessageDialog(null, "Cannot play "+fileName, "No Sound", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
