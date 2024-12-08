package testing;

public class Primenumber {
public static void main(String[] args) {
	int no=23;
	boolean flag=true;
for(int i=2;i<no;i++)
{
	if(no%i==0)
	{
		flag=false;
	break;
	}
	
}
if(flag==true)
{
	System.out.println("Its a prime number");
}
else
{
	System.out.println("Its not a prime number");
}

}
}