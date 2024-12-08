package Firstproject;

class Whatsapp_V1
{
	void status() {
		System.out.println("status with text");
	}
}
class Whatsapp_V2 extends Whatsapp_V1
{
	void status() {
System.out.println("status with text,images and videos");
super.status();
}
}

public class Method_Overriding {
public static void main(String[] args) {
	Whatsapp_V2 ve=new Whatsapp_V2();
	ve.status();
}
}
