package displayoddeven.java;

import java.util.*;

public class DisplayOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter many numbers we should count to? -->");
		Scanner in = new Scanner(System.in);
		int loopBreak = in.nextInt();
		
		IsItEvenOrOdd(loopBreak);
		in.close();
	}

	private static void IsItEvenOrOdd(int loopControl) 
	{
		int i;
		for (i = 1; i <= loopControl; ++i)
		{
			if (i % 2 == 0)	
				System.out.println(i + " is even ");
			else
				System.out.println(i + " is odd ");
		}
	}		
}
