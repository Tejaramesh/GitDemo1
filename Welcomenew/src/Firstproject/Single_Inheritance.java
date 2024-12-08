package Firstproject;

class sample3
{
	int a=10;
}
class sample4 extends sample3
{
	void disp() {
		System.out.println("Hii");
	}
}
public class Single_Inheritance {
	public static void main(String[] args) {
		sample4 s=new sample4();
		s.disp();
		System.out.println(s.a);
	}

}
