package Firstproject;

class Aunty
{
	void testengg()
	{
		System.out.println("Testing job");
	}
}
public class PassbyReference {

	public static void main(String[] args) {
	Aunty A=new Aunty();
	Dingas.needjob(A);
	Dingi.needjob(A);
}
}

class Dingas
{
	static void needjob(Aunty A1)
	{
		A1.testengg();
	}
}
class Dingi
{
	static void needjob(Aunty A2)
	{
		A2.testengg();
	}
}
