package javaprogram;

public class Methodoverriding {

	public static void main(String[] args) {
		
	
	Whatsapp_v2 w=new Whatsapp_v2();
	w.status();
}
}
class Whatsapp_v1
{
	
	void status()
	{
		System.out.println("Status with text");
	
	}
	
}
class Whatsapp_v2 extends Whatsapp_v1
{
	void status()
	{
		System.out.println("Status with text,images,videos");
		super.status();
	}
}