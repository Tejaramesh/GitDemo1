package Firstproject;

class exam1
{
	int x=10;
}
class exam2 extends exam1
{
	void disp() {
		System.out.println("hii");
	}
}
class exam3 extends exam1
{
	void disp1()
	{
		System.out.println("hello");
	}
	
}
public class Hi_Inheritance {
	public static void main(String[] args) {
		exam2 e2=new exam2();
		System.out.println(e2.x);
		e2.disp();
		exam3 e3=new exam3();
		e3.disp1();
		System.out.println(e3.x);
	}

}
