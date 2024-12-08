package javaprogram;

public class Exception {
	public static void main(String[] args) {
		
		System.out.println("Main starts");
		try
		{
			int i=1/0;
		}
		catch(ArithmeticException s)
		{
			System.out.println("Handled");
		}
		finally
		{
			System.out.println("Hi I am finally");
		}
		System.out.println("Main ends");
	}

}
