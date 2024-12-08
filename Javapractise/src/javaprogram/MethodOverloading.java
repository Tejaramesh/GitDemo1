package javaprogram;

public class MethodOverloading {
	public static void main(String[] args) {
		Whatsapp.send(2000);
		Whatsapp.send("Teja");
		Whatsapp.send("Teja", 2000);
	}

}

class Whatsapp
{
	static void send(String msg)
	{
		System.out.println("sending message" +msg);
	}
	static void send(int no)
	{
		System.out.println("Sending number"+no);
	}
	static void send(String msg,int no)
	{
		System.out.println("sending msg and number"+ msg + no);
		
	}
}