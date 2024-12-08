class Samplet
{
	int a=10;
}

class Samplen extends Samplet
{
	int b=99;
}

class Sampleo extends Samplet
{
	int g=87;
}
public class Hirarchial {

public static void main(String[] args) {
	Samplen n=new Samplen();
	System.out.println(n.b+n.a);
   Sampleo o=new Sampleo();
   System.out.println(o.g+o.a);
   
}
}
