package Firstproject;

public class Sample2 {
	int a=50;
	void add()
	{
		int b=5;
		int d=10;
		int e=b+d;
		System.out.println(e);
	}
	public static void main(String[] args) {
		Sample2 s1=new Sample2();
		System.out.println(s1.a);
		s1.add();
	}

}
