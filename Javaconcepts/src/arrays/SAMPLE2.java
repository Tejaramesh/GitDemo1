package arrays;

public class SAMPLE2 {
	
	public static void main(String[] args) {
		
		int[][] a= {{2,4,5},{3,0,7},{1,19,8}};
		
		int min=a[0][0];
		int mincoln = 0;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					min=a[i][j];
				mincoln=j;
				}
			}
		}
		System.out.println(min);
		System.out.println(mincoln);
	
		int maxva=a[0][mincoln];
		int k=0;
		while(k<3)
		{
			if(a[k][mincoln]>maxva)
			{
				maxva=a[k][mincoln];
			}
			k++;
		}
		System.out.println(maxva);
	
	
	}
	}


