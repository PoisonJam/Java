
import java.util.*;

public class TestGrade{
	
	public static void main(String args[]) throws Exception
	{
		
		Scanner input = new Scanner(System.in);
		
		int[] id = {1234, 1245, 1267, 1278, 2345,
				1256, 3456, 3478, 4567, 5678};
		
		char[] validGrades = GradeException.VALID_GRADES;
		
		char[] grade = new char[10];
		String gradeString = new String();

		String inString, outString = "";
		
		int flag;
		
		for(int x = 0; x < id.length; ++x)
		{
			System.out.print("Enter letter grade for student id number: " +
					id[x] + "\n");
			inString = input.nextLine(); 
			grade[x] = inString.charAt(0);
			
			flag = 0;
         
			for(int y = 0; y < validGrades.length; ++y)
			{
				if(validGrades.equals(grade[x]));
         			flag = 1;
			}
         	
			if(flag == 0)
			{
				gradeString = "Invalid grade";
				throw(new GradeException(gradeString)); 
			}
		}    
			
		catch(GradeException e)
		{
			System.out.print(e.getMessage());  
			grade[x] = 'I';
		}
	}
		
	for(int x = 0; x < id.length; ++x)
	{	
		outString = outString + "ID #" + id[x] + "  Grade " +
		grade[x] + "\n";
       	System.out.print(outString); 
	}
	
	input.close();
	}
}
