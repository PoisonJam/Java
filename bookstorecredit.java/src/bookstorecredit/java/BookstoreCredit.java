package bookstorecredit.java;

import javax.swing.JOptionPane;

public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variables for name and gpa
		String name = JOptionPane.showInputDialog(null, "Please type your name");
		String inputGpa = JOptionPane.showInputDialog(null, "Please type your grade point average.");
		
		//convert gpa so it's usable
		double gpa = Double.parseDouble(inputGpa);
		
		//run the method
		BookCredit(name, gpa);
	}

		public static void BookCredit(String name, double gpa){
			
			//do the maths for the gpa
			double bookStoreCredit = gpa * 10;
			
			//now show it to the user in a purty wittle package.
			JOptionPane.showMessageDialog(null, "Hello " + name + 
				" \nyou said your gpa is " + gpa +
				".\nThat gives you a book store credit of $" + bookStoreCredit);
		}

}
