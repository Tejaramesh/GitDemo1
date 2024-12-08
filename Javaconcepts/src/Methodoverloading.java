
public class Methodoverloading {
	
 void send(int no)
 {
	 System.out.println("Sending number"+no);
 }
	
 void send(String txtmsg)
 {
	 System.out.println("sending text message"+txtmsg);
 }
void send(String txtmsg,int no)
{
	System.out.println("Test message is"+txtmsg+" Number is"+no);
}
	
void send(int no, String txtmsg)
{
	System.out.println("The textmessage is"+txtmsg+" The number is"+no);
}
	
public static void main(String[] args) {
	Methodoverloading mo=new Methodoverloading();
	mo.send(978);
	mo.send("Test");
	mo.send(29, "test");
	mo.send("test", 345  ); 
}
}
