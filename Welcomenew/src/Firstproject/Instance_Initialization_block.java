package Firstproject;

public class Instance_Initialization_block {
	
	{
		System.out.println("Instanct block 1");
	}
	Instance_Initialization_block()
	{
		System.out.println("Hey I am Constructor");
	}
	{
		System.out.println("Instant block 2");
	}
	public static void main(String[] args) {
		new Instance_Initialization_block();
		
	}

}
