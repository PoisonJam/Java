package perfectsquares.java;

import javax.swing.JOptionPane;

public class PerfectSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog(null, "How many perfect squares do you want to display?");
		int n = Integer.parseInt(input);
		MakePerfectSquares(n);
	}

	private static void MakePerfectSquares(int n) {
		for (int i = 1; i <= n; ++i){
			int num = i * i;
			System.out.print(num + " ");
		}
		
	}

}
