package javaIIweek3;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

import static java.nio.file.AccessMode.*;

public class PathDemo2 {

	public static void main(String[] args) {
		String name;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a file name -->");
		name = input.nextLine();
		
		Path inputPath = Paths.get(name);
		Path fullPath = inputPath.toAbsolutePath();
		System.out.println("Full path is " + fullPath.toString());
		
		//boolean exists = Files.exists(fullPath);
		//System.out.println("The file exists? = " + exists);
		
		try{
			fullPath.getFileSystem().provider().checkAccess(fullPath, READ);
			System.out.println("The file can be read");
		}
		catch(IOException e){
			System.out.println("The file doesn't exist");
		}
		input.close();
	
	}
}
