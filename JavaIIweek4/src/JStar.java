import javax.swing.*;
import java.awt.*;

public class JStar extends JPanel{

	private static final long serialVersionUID = 1L;
	
	int xPoints[] = {42, 52 , 72, 52, 60, 40, 15, 28, 9, 32, 42};
	int yPoints[] = {38, 62, 68, 80, 105, 85, 102, 75, 58, 60, 38};
	int smallx[] = {82, 87, 97, 87, 91, 81, 69, 75, 66, 77, 82};
	int smally[] = {78, 90, 93, 99, 111, 101, 109, 96, 88, 89, 78};	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawPolygon(xPoints, yPoints, xPoints.length);
		g.drawPolygon(smallx, smally, smallx.length);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(new JStar());
		frame.setSize(120, 160);
		frame.setVisible(true);
	}
}
