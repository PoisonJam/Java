package insurance;

import javax.swing.JOptionPane;

public class Insurance {

	public static void main(String[] args) {
		String custName = JOptionPane.showInputDialog(null, "Enter the customers name");
		String curYear = JOptionPane.showInputDialog(null, "Enter the current year");
		String custAge = JOptionPane.showInputDialog(null, "Enter the customers birthyear");
		int Year = Integer.parseInt(curYear);
		int Age = Integer.parseInt(custAge);
		
		int thePremium = Calculate(Year, Age);
		JOptionPane.showMessageDialog(null, "The Customer: " + custName + " has a Premium of $" + thePremium);
	}

	private static int Calculate(int theYear, int Age) {
		int customerAge = theYear - Age;
		int decade = customerAge / 10;
		int customerPremium = ((decade + 15) * 20);
		return customerPremium;
	}

}
