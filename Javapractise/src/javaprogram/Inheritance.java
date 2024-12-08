package javaprogram;

public class Inheritance {
	
	public static void main(String[] args) {
	test d=new test();
	System.out.println(d.a);
d.disp();	
System.out.println(d.c);
	}

}

class sample{
	
 int a =10;
	
}
class Demo extends sample
{
 void disp()
 {
	 System.out.println("Hii");
 }
	
}
class test extends Demo
{
	int c=90;
}
