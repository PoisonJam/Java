import javax.swing.*;
import java.awt.*;

public class JDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private JButton b1 = new JButton("Button 1");
	private JButton b2 = new JButton("Button 2");
	private JButton b3 = new JButton("Button 3");
	private JButton b4 = new JButton("Button 4");
	private JButton b5 = new JButton("Button 5");
	private JButton b6 = new JButton("Button 6");
	private JButton b7 = new JButton("Button 7");
	private JButton b8 = new JButton("Button 8");
	private JButton b9 = new JButton("Button 9");
	private JButton b10 = new JButton("Button 10");
	private JButton b11 = new JButton("Button 11");
	private JButton b12 = new JButton("Button 12");
	
	private GridLayout layout = new GridLayout(3, 4, 5, 5);
	
	private Container con = getContentPane();

	public JDemo(){
		
		con.setLayout(layout);
		con.add(b1);
		con.add(b2);
		con.add(b3);
		con.add(b4);
		con.add(b5);
		con.add(b6);
		con.add(b7);
		con.add(b8);
		con.add(b9);
		con.add(b10);
		con.add(b11);
		con.add(b12);
		setSize(500, 400);
	}
	public static void main(String[] args){
		
		JDemo frame = new JDemo();
		frame.setVisible(true);
	}
}
