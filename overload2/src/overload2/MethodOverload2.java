package overload2;

import javax.swing.JOptionPane;

public class OverLoad2 {

	public static void main(String[] args) {
		// Adding two ints
		String oneInt = JOptionPane.showInputDialog(null, "Enter the First integer to be added");
		String twoInt = JOptionPane.showInputDialog(null, "Enter the Second integer to be added");
		
		int firstInt = Integer.parseInt(oneInt);
		int secInt = Integer.parseInt(twoInt);
		int intAdd = Add(firstInt, secInt);
		JOptionPane.showMessageDialog(null, "The addition of your two numbers = " + intAdd);
		
		//Adding an int and a double
		String anInt = JOptionPane.showInputDialog(null, "Enter the integer to be added");
		String aDouble = JOptionPane.showInputDialog(null, "Enter the double to be added");
		
		int theInt = Integer.parseInt(anInt);
		double theDouble = Double.parseDouble(aDouble);
		double intPlusDouble = Add(theInt, theDouble); 
		JOptionPane.showMessageDialog(null, "The addition of your two numbers = " + intPlusDouble);
		
		//adding three doubles
		String oneDouble = JOptionPane.showInputDialog(null, "Enter the first double to be added");
		String twoDouble = JOptionPane.showInputDialog(null, "Enter the second double to be added");
		String threeDouble = JOptionPane.showInputDialog(null, "Enter the third double to be added");
		
		double firstDouble = Double.parseDouble(oneDouble);
		double secondDouble = Double.parseDouble(twoDouble);
		double thirdDouble = Double.parseDouble(threeDouble);
		double theDoubles = Add(firstDouble, secondDouble, thirdDouble);
		JOptionPane.showMessageDialog(null, "The addition of your three numbers = " + theDoubles);
		
		//adding three ints
		String unoInt = JOptionPane.showInputDialog(null, "Enter the first int to be added");
		String doseInt = JOptionPane.showInputDialog(null, "Enter the second int to be added");
		String threeInt = JOptionPane.showInputDialog(null, "Enter the third int to be added");
		
		int numOneInt = Integer.parseInt(unoInt);
		int numTwoInt = Integer.parseInt(doseInt);
		int numThreeInt = Integer.parseInt(threeInt);
		int theInts = Add(numOneInt, numTwoInt, numThreeInt);
		JOptionPane.showMessageDialog(null, "The addition of your three numbers = " + theInts);
		JOptionPane.showMessageDialog(null, "Thanks for playing!");
		
	}

	private static double Add(double d, double e, double f) {
		
		double result = d + e + f;
		return result;
	}

	private static double Add(int i, double d)
	{
		double num = (double) i + d;
		return num;
	}

	private static int Add(int i, int j, int k) {
		int result = i + j + k;
		return result;
	}

	private static int Add(int i, int j) {
		int result = i + j;
		return result;
		
	}

}
