package Firstproject;

public class Nonstatic_Area_Circle {
	

	public static void main(String[] args) {
		System.out.println("*******Main starts***********");
		Subclass s=new Subclass();
		s.area(33);
		System.out.println(s.b);
		System.out.println("********Main Ends************");
		}

}
class Subclass
{ 
	int b=100;
	void area(int r)
	{
		final double pi=3.142;
		double a=pi*r*r;
		System.out.println(a);
	}
}
