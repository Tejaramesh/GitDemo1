
public class passbyvalue {

	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		int c=10;
		int d=20;
		add(c,d);
	}
}
