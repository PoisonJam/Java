package midterm;

import javax.swing.JOptionPane;

public class Geometrymidterm {

	public static void main(String[] args) {
		
		final double pi = 3.14;
		
		Object[] possibleValues = { "Circle", "Rectangle", "Cylinder" };
		
		Object Units = JOptionPane.showInputDialog(null, "Which shape would you like to calculate the area for?", "Input", 
				JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
		
		if (Units == "Circle"){
		
			String aRad1 = JOptionPane.showInputDialog(null, "please enter the radius of your circle");
			int theRad1 = Integer.parseInt(aRad1);
			Shapes(pi, theRad1);
		}
		
		if (Units == "Rectangle"){
			
			String aWidth = JOptionPane.showInputDialog(null, "please enter the Width of your rectangle");
			int theWidth = Integer.parseInt(aWidth);
			String aHeight = JOptionPane.showInputDialog(null, "please enter the height of your rectangle");
			int theHeight = Integer.parseInt(aHeight);
			int recArea = Shapes(theWidth, theHeight);
			JOptionPane.showMessageDialog(null, "The area of your rectangle is: " + recArea);
		}
		else{
			String aRad2 = JOptionPane.showInputDialog(null, "please enter the radius of your cylinder ");
			int theRad2 = Integer.parseInt(aRad2);
			String aHeight2 = JOptionPane.showInputDialog(null, "please enter the height of your cylinder");
			int theHeight2 = Integer.parseInt(aHeight2);
			Shapes(pi, theRad2, theHeight2);
		}	
	}

	private static void Shapes(double pi, int rad){
		double theAnswer = 3.24 * rad * rad;
		JOptionPane.showMessageDialog(null, "The area of your circle is: " + theAnswer);
	}

	private static int Shapes(int theWidth, int theHeight){
		int theAnswer = theWidth * theHeight;
		return theAnswer;
	}

	private static void Shapes(double pi, int rad1, int theHeight){
		double theAnswer = pi * (rad1 * rad1) * theHeight;
		JOptionPane.showMessageDialog(null, "The area of your cylinder is: " + theAnswer);
	}

}
