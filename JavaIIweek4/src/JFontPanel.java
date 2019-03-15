import javax.swing.*;
import java.awt.*;

public class JFontPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	Font fancyFont = new Font("Times New Roman", Font.BOLD, 40);
	
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.setFont(fancyFont);
		g.drawString("WHAT IT DOOO?", 20, 80);
	}
}
