package numbersdemo;

import java.util.Scanner;

public class NmbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers to double --> ");
		int input1 = input.nextInt();
		int input2 = input.nextInt();
		
		System.out.println("Enter two numbers to add 5 to --> ");
		int input3 = input.nextInt();
		int input4 = input.nextInt();
		
		System.out.println("Enter two numbers to square --> ");
		int input5 = input.nextInt();
		int input6 = input.nextInt();
		
		TwiceTheNumber(input1, input2);
		AddFive(input3, input4);
		Square(input5, input6);
		
		input.close();
		
	}
	public static void TwiceTheNumber(int x, int y){
		int product1 = x * 2;
		int product2 = y * 2;
		System.out.println("Twice " + x + " is " + product1);
		System.out.println("Twice " + y + " is " + product2);
	}

	public static void AddFive(int x, int y){
		int sum1 = x + 5;
		int sum2 = y + 5;
		System.out.println(x + " plus 5 is " + sum1);
		System.out.println(y + " plus 5 is " + sum2);
	}
	
	public static void Square(int x, int y){
		int squared1 = x * x;
		int squared2 = y * y;
		System.out.println("The square of " + x + " is " + squared1);
		System.out.println("Twice square of " + y + " is " + squared2);
	}
}
