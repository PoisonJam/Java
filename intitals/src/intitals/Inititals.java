package intitals;

import java.util.*;

public class Inititals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner init = new Scanner(System.in) ;
		
		System.out.print("Enter first initial.");
		String init1 = init.next() ;
		System.out.print("Enter middle initial.");
		String init2 = init.next() ;
		System.out.print("Enter last initial.");
		String init3 = init.next() ;
		
		System.out.println("Your initials are " + init1.toUpperCase() + '.' + init2.toUpperCase() + '.' + init3.toUpperCase() + '.');
		init.close();
	}

}
