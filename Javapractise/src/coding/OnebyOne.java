package coding;

public class OnebyOne {

	public static void main(String[] args) {
		
		int no=1267;
		int rem;
		int sum = 0;
		while(no!=0)
		{
			rem=no%10;
			sum=sum+rem;
			System.out.println(rem);
			no=no/10;	
	}
	System.out.println(sum);	
	}
}
