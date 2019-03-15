package craftpricing;

import javax.swing.JOptionPane;

public class CraftPricing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName = JOptionPane.showInputDialog(null, "What is the name of the product?");
		String materialPrice = JOptionPane.showInputDialog(null, "What is the price of the materials to make the product?");
		String workTime = JOptionPane.showInputDialog(null, "How long does it take to make the product (in hours)?");
		double matPrice = Double.parseDouble(materialPrice);
		double howLong = Double.parseDouble(workTime);
		
		double retailPrice = Calculate(matPrice, howLong);
		JOptionPane.showMessageDialog(null, "The product: " + productName + "\nCosts a total of: $" + retailPrice);
	}

	private static double Calculate(double Materials, double Time) 
	{
		double totalPrice = ((Materials + 12) * Time) + 7;
		return totalPrice;	
	}

}
