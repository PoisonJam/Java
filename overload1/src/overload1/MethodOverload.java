package overload1;

public class OverLoad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result;
		test();
		test(900);
		test(45, 364);
		result = test(123.2);
		System.out.println("Result of test(123.2): " + result);
			
	}

	private static double test(double d) {
		System.out.println("Double input: " + d);
		return d * d;
	}

	private static void test(int i, int j) {
		System.out.println("input 1 and input 2: " + i + ", " + j);
		
	}

	private static void test(int i) {
		System.out.println("input: " + i);
		
	}

	private static void test() {
		System.out.println("No parameters");
		
	}

	
	
}
