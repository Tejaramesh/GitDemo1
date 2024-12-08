package Firstproject;

class sample04
{
	int a=15;
}
class sample5 extends sample04
{
	void disp() {
		System.out.println("1st super classs");
	}
}
class sample6 extends sample5
{
	void sum()
	{
		System.out.println("2nd super class");
	}
}

public class Multi_level_Inheritance {
	public static void main(String[] args) {
		sample6 x=new sample6();
		x.disp();
		x.sum();
		System.out.println(x.a);
		
	}
}
