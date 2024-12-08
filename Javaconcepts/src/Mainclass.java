abstract interface test
{
	void shoes();
}

interface puma extends test
{
	void bags();
}

class Rajoutlet implements puma
{
	public void shoes()
	{
	System.out.println("Sakathagide");	
	}
	
	public void bags()
	{
		System.out.println("Chanagilla");
	}
}



public class Mainclass {

	public static void main(String[] args) {
		
	Rajoutlet r=new Rajoutlet();
	r.shoes();
	r.bags();   
	
}
}