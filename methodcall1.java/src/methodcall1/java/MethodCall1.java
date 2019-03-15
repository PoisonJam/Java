package methodcall1.java;

public class MethodCall1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The maximum number between 4 and 6 is " + max(4,6));
		System.out.println("The maximum number between 14 and 6 is " + max(14,6));
		System.out.println("The maximum number between 6 and 8 is " + max(6,8));
		
	}
	public static int max(int num1, int num2){
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
}
