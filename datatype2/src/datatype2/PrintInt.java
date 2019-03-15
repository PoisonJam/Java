package datatype2;

import java.util.*;

public class DataType2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in) ;
		
		System.out.print("Enter first integer.");
		int num1 = console.nextInt();
		System.out.print("Enter second integer.");
		int num2 = console.nextInt();
		int answer = num1 + num2 ; 
		
		System.out.println(num1 + " plus " + num2 + " equals " + answer + '.');
		
		console.close();

	}

}
