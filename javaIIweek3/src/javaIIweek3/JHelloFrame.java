package javaIIweek3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHelloFrame extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	JLabel question = new JLabel("What is your name?");
	Font bigFont = new Font("Times New Roman", Font.BOLD, 25);
	JTextField answer = new JTextField(10);
	JButton PressMe = new JButton("Press Me");
	JLabel greeting = new JLabel("");
	final int Width = 275;
	final int Height = 225;
	
	public JHelloFrame(){
		super("Hello Frame");
		setSize(Width, Height);
		setLayout(new FlowLayout());
		question.setFont(bigFont);
		greeting.setFont(bigFont);
		add(question);
		add(answer);
		add(PressMe);
		add(greeting);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PressMe.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String reverse = "";
		String name = answer.getText();
		int stringLen = name.length();
		for(int x = stringLen - 1; x >= 0; x--){
			reverse = reverse + name.charAt(x);
		}
		String greet = "Hello, " + reverse;
		greeting.setText(greet);
	}
}