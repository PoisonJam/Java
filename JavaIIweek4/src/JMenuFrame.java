import javax.swing.*;
import java.awt.*;

public class JMenuFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JMenuBar mainBar = new JMenuBar();
	
	private JMenu menu1 = new JMenu("File");
	private JMenu menu2 = new JMenu("Edit");
	
	private JButton Undo = new JButton("Undo");
	private JButton Redo = new JButton("Redo");
	private JButton Save = new JButton("Save");
	private JButton Open = new JButton("Open");
	
	private JCheckBoxMenuItem check1 = new JCheckBoxMenuItem("Check Box A");
	private JCheckBoxMenuItem check2 = new JCheckBoxMenuItem("Check Box B");
	
	private JRadioButtonMenuItem radio1 = new JRadioButtonMenuItem("Radio option 1");
	private JRadioButtonMenuItem radio2 = new JRadioButtonMenuItem("Radio option 2");
	private JRadioButtonMenuItem radio3 = new JRadioButtonMenuItem("Radio option 3");
	
	private ButtonGroup group1 = new ButtonGroup();
	
	public JMenuFrame(){
		
		setLayout(new FlowLayout());
		setJMenuBar(mainBar);
		mainBar.add(menu1);
		mainBar.add(menu2);
		
		menu1.add(check1);
		menu1.add(check2);
		menu1.addSeparator();
		menu1.add(radio1);
		menu1.add(radio2);
		menu1.add(radio3);
		menu1.addSeparator();
		menu1.add(Save);
		menu1.add(Open);
		
		
		menu2.add(Undo);
		menu2.addSeparator();
		menu2.add(Redo);
		
		group1.add(radio1);
		group1.add(radio2);
		group1.add(radio3);
	}
	
	public static void main(String[] args) {
		
		JMenuFrame frame = new JMenuFrame();
		final int WIDTH =150;
		final int HEIGHT = 200;
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}

}
