package javaprogram;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	
	public static void main(String[] args) throws IOException {
		
		File f1=new File("E:\\dinga.xlsx/   ");
		
		if(f1.createNewFile())
		{
			System.out.println("file is created");
		}
		else
		{
			System.out.println("file is not created");
		}
		
		
	}

}
