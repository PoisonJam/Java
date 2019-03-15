import javax.swing.JFrame;

public class JDemoFontPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	
	JFontPanel p1 = new JFontPanel();
	public JDemoFontPanel(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p1);
	}
	
	public static void main(String[] args) {
		
		JDemoFontPanel frame = new JDemoFontPanel();
		frame.setSize(400, 200);
		frame.setVisible(true);

	}
}
