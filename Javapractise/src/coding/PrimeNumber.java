package coding;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int n=23;
		boolean flag=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
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
