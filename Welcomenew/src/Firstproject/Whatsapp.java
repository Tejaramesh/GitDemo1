package Firstproject;

public class Whatsapp {
	void send(int no)
	{
		System.out.println("sending no"+no);
	}
	void send(String txtmsg)
	{
		System.out.println("sending text message"+txtmsg);
	}
	void send(int no, String txtmsg)
	{
		System.out.println("Sending no and text message "+no+" "+txtmsg);
	}
	void send(String txtmsg, int no)
	{
		System.out.println("sending text message and no "+txtmsg+" "+no );
	}
	public static void main(String[] args) {
		Whatsapp w=new Whatsapp();
		w.send(25);
		w.send("Teja");
		w.send(25, "teja");
		w.send("teja",55);
	}

}
