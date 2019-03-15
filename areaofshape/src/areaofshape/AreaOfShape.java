package areaofshape;

import javax.swing.JOptionPane;

public class AreaOfShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array for possible units
		Object[] possibleValues = { "Inches", "Centimeters" };
		
		Object Units = JOptionPane.showInputDialog(null, "Choose one", "Input", 
				JOptionPane.INFORMATION_MESSAGE, null, possibleValues, possibleValues[0]);
		
		String inputLength = JOptionPane.showInputDialog(null, "What is the length of the Square/Rectangle?");
		String inputHeight = JOptionPane.showInputDialog(null, "What is the height of the Square/Rectangle?");
		double Length = Double.parseDouble(inputLength);
		double Height = Double.parseDouble(inputHeight);
		
		//do the math
		double Area = Length * Height;
		JOptionPane.showMessageDialog(null, "The area of your Square/Rectangle is " + Area + " " + Units + " squared");
	}

}