package abstractionpgm;

public class Boeing extends Parentclass {
public static void main(String[] args) {
	
	Boeing b=new Boeing();
	b.engine();
	b.safetyguidelines();
	b.bodycolour();
}

@Override
public void bodycolour() {
	System.out.println("Body colour is green");
	
}



}