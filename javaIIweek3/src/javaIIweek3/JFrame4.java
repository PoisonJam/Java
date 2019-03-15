package javaIIweek3;

import javax.swing.*;
import java.awt.*;

public class JFrame4 {

	public static void main(String[] args) {
		final int FRAME_WIDTH = 475;
		final int FRAME_HEIGHT = 200;
		Font headlineFont = new Font("Calibri", Font.BOLD, 50);
		JFrame aFrame = new JFrame("I LOVE CHEEEEEEEESE");
		aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel greeting = new JLabel("WHAT IT DO HOMIE?");
		greeting.setFont(headlineFont);
		aFrame.add(greeting);
	}

}
