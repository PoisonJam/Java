import javax.swing.JOptionPane;

public class eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//variables for eggs
		final double dozenEggs = 3.25;
		final double oneEgg = 0.45; 
		
		//control for the for loop
		String howManyPeople = JOptionPane.showInputDialog(null, "How many people need to buy eggs?");
		
		//Convert to int
		int loopTimes = Integer.parseInt(howManyPeople);
		
		//variable to store total eggs for final maths
		int totalEggs = 0;
		
		//make for loop to do the calculation however many times
		for (int x = 1; x <= loopTimes; ++x) {
			
			//get input from user
			String input = JOptionPane.showInputDialog(null, "How many eggs do you/they need?");
		
			//convert input into int for math doing
			int result = Integer.parseInt(input);
			totalEggs = result + totalEggs;
		}
		
		//all dem dere maths that we be needin 
		int totalDozen = totalEggs / 12;
		double dozenPrice = totalDozen * dozenEggs;
		int totalLoose = totalEggs % 12;
		double loosePrice = totalLoose * oneEgg;
		double totalPrice = dozenPrice + loosePrice;
			
		JOptionPane.showMessageDialog(null, loopTimes + " people ordered " + totalEggs + 
				" eggs \nThat's " + totalDozen + 
				" dozen at " + dozenEggs + 
				" \nand " + totalLoose + " loose eggs at " + oneEgg + 
				" \nfor a grand total of $ " + totalPrice + " ! ");
			
	}

}
