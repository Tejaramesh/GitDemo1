package javaprogram;

import java.io.File;

public class Filehandle {
	public static void main(String[] args) {
		File f1=new File("E://bhadrinathi");
		if(f1.mkdirs())
		{
			System.out.println("folder is created");
		}
		
		else
		{
			System.out.println("folder is not created");
		}
		if(f1.exists())
		{
			System.out.println("folder exists......");
		}
		
		else
		{
			System.out.println("Doesn't exist");
		}
		
		if(f1.delete())
		{
			System.out.println("folder is deleted");
		}
		else
		{
			System.out.println("folder is not deleted");
		}
	}

}
