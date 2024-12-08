class whatsapp_v1
{
	void status()
	{
		System.out.println("Status with text");
	}
}

class whatsapp_v2 extends whatsapp_v1
{
	void status()
	{
		System.out.println("status with text,image,videos");
		super.status();   
	}
}
public class Methodoveriding {

	public static void main(String[] args) {
		whatsapp_v2 wp=new whatsapp_v2();
		wp.status(); 
	}
	
	
	
}
