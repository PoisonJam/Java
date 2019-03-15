import javax.swing.JOptionPane;

public class quartsToGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get the number of quarts bought for the job
		String input;
		input = JOptionPane.showInputDialog(null, "How many quarts do you need for the job?");
		
		//convert input into int
		int result = Integer.parseInt(input);
	
		//named constant for num of quarts in a gallon
		final int quartsInGallon = 4;
		
		//number of quarts for a job
		int quartsForJob = result;
		
		//jam math for total gallons it into a variable
		int totalGallons = quartsForJob / quartsInGallon;
		
		//jam math for remaining quarts into a variable;
		int remainingQuarts = quartsForJob % quartsInGallon;
		
		//now print it to a dialog box
		JOptionPane.showMessageDialog(null, "The job requires " + totalGallons + " gallons and " + remainingQuarts + " quarts");
		
	}

}
