package javaprogram;

public class Abstraction {
	public static void main(String[] args) {
		
	
	Sample1 sa=new Sample1();
	sa.disp();
	sa.test();
	}
}

abstract class Tester1
{
	abstract void disp();
	abstract void test();
}
 class Sample1 extends Tester1
{
	void disp()
	{
		System.out.println("Hii");
	}
	void test()
	{
		System.out.println("Hello");
	}
}