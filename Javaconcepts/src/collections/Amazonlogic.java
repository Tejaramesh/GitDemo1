package collections;

import java.util.ArrayList;

public class Amazonlogic {
	
	public static void main(String[] args) {
		
		int[] a= {4,4,5,5,6,6,5,4,9};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				k++;
				al.add(a[i]);
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						
						k++;
					}
				}
				System.out.print(a[i]+"  ");
				System.out.println(k);
				if(k==1)
				{
					System.out.println(a[i]+" is a unique number");
				}
			}
		}
	}

}
