package javaprogram;

public class Passbyreference {
	int a=25;
	
	void disp(Passbyreference pb1)
	{
		System.out.println(pb1.a);
	}
	public static void main(String[] args) {
		
		Passbyreference pb=new Passbyreference();
		System.out.println(pb.a);
		pb.disp(pb);
		
		
	}

}
