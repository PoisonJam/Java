package paintcalculator.java;

import javax.swing.JOptionPane;

public class PaintCalculator {

	public static void main(String[] args) {
		
		String inLength = JOptionPane.showInputDialog(null, "Please enter the length of the room");
		String inHeight = JOptionPane.showInputDialog(null, "Please enter the height of the room");
		String inWidth = JOptionPane.showInputDialog(null, "Please enter the width of the room");
		
		int Length = Integer.parseInt(inLength);
		int Height = Integer.parseInt(inHeight);
		int Width = Integer.parseInt(inWidth);
		
		CalcRoomSize(Length, Height, Width);

	}

	private static void HowMuchPaint(int roomSize) {
		double totalPaint = roomSize / 350;
		JOptionPane.showMessageDialog(null, "A room with a size of: "+ roomSize + " sqft \nwill need " + totalPaint + " gallons of paint to be covered completely");
	}

	private static void CalcRoomSize(int length, int height, int width) {
		int theRoom = length * height * width;
		HowMuchPaint(theRoom);
	}

}
