import java.util.Scanner;

public class Departments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
	      String[][] depts = new String[5][3]; 
	      depts[0][0] = "Marketing";
	      depts[0][1] = "Marco";
	      depts[0][2] = "El Pollo Loco";
	      depts[1][0] = "Accounting";
	      depts[1][1] = "Patel";
	      depts[1][2] = "Angry Jesus";
	      depts[2][0] = "Human Resources";
	      depts[2][1] = "Wong";
	      depts[2][2] = "Genghis";
	      depts[3][0] = "Information Services";
	      depts[3][1] = "Deitrich";
	      depts[3][2] = "Black Jesus";
	      depts[4][0] = "Sales";
	      depts[4][1] = "Lennon";
	      depts[4][2] = "Not Black Jesus";
	      
	      String entry,  message ="Enter a department: ";
	      int x;
	      boolean isFound = false;
	      while (!isFound)
	      {
	         System.out.print(message);
	         entry = input.nextLine();
	         for(x = 0; x < depts.length; ++ x)
	            if(entry.equals(depts[x][0]))
	            {
	               isFound = true;
	               System.out.print("Dept: " + entry + " \nSupervisor: " + depts[x][1] + " \nFirst name: " + depts[x][2]);
	             x = depts.length;
	            }
	         if(!isFound)
	            System.out.print("Sorry - no such department");
	      }
	      input.close();
	}
}

