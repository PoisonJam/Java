package inchestofeet;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inches = 550; 
		final int Box = 12 ;
		int feet, inch ; 
		feet = inches / Box ;
		inch = inches % Box ;
			
	System.out.println(inches + " inches becomes " + feet + " feet and " + inch + " inches.");

	}

}
