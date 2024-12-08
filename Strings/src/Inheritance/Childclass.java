package Inheritance;

public class Childclass extends Parentclass {
	
public void engine()
{
	System.out.println("Engine is BS6");
}
public void colour()
{
	System.out.println(colour);
}
	
	public static void main(String[] args) {
		
		Childclass cc=new Childclass();
		cc.colour();
		cc.engine();
		cc.audioSystem();
		
	}
}
