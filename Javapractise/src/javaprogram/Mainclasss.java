package javaprogram;

public class Mainclasss {
	public static void main(String[] args) {
		Rajoutlet raj=new Rajoutlet();
		raj.bags();
		raj.shoes();
	}

}
interface Nike {

	void shoes();
}

interface Puma extends Nike
{
	void bags();
}

class Rajoutlet implements Puma
{

	@Override
	public void shoes() {
		// TODO Auto-generated method stub
		System.out.println("Sakathagide");
	}

	@Override
	public void bags() {
		// TODO Auto-generated method stub
		System.out.println("Chi Chanagilla");
	}
	
}