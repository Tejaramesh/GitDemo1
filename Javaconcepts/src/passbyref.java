
public class passbyref {

	int a=10;
	static void disp(passbyref ref2)
	{
		System.out.println(ref2.a);
	}
	
	public static void main(String[] args) {
		passbyref ref=new passbyref();
		disp(ref);
	}
}
