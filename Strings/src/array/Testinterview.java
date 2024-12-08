package array;

public class Testinterview {
	
	public static void main(String[] args) {
		
		int n=53;
		int count=0;
		int c=0;
		for(int i=1; i<=10; i++)
		{
			int k=6;
			int l = k*i;
			
			System.out.println(k*i);
			
			if(n%l==0)
			{
				count++;
			}
			else {
				c++;
			}
		}
			System.out.println(c);
	System.out.println(count);
		}
	}


