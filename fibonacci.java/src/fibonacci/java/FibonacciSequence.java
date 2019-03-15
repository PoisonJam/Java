package fibonacci.java;

public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibbo();
		
	}
	public static void fibbo()
	{
		int i, count = 10, n1 = 0, n2 = 1, n3;
		System.out.print(n1 + ", " + n2);
		
		for (i = 0; i < count; ++i)
		{
			n3 = n1 + n2;
			System.out.print(", " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
