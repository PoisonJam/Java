package javaIIweek3;

import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class fileOut {

	public static void main(String[] args){
		
		Path file = 
				Paths.get("C:\\Java\\Chapter.13\\Grades.txt");

		String s = "A B C D F";
		byte[] data = s.getBytes();
		int aNum = 12;
		
		OutputStream output = null;
		
		try{
			output = new
					BufferedOutputStream(Files.newOutputStream(file, CREATE));
			output.write(data);
			output.write(aNum);
			output.flush();
			output.close();
		}
		catch(Exception e){
			System.out.print("Message " + e);
		}
	}
}
