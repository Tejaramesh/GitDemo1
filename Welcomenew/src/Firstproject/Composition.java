package Firstproject;
class Samples
{
	void call()
	{
		System.out.println("I tried to call you");
	}
}
public class Composition {
public static void main(String[] args) {
	System.out.println("********Main Starts**********");
	new Samples().call();
System.out.println("********Main ends***********");
}
}
