
public class Arrays {
	public static void main(String[] args) {
		 
	int[] arr= {1,2,4,6,8,10,122,7,9};
	for(int i=0; i<arr.length;i++)
	{
		if(arr[i] % 2==0)
		{
			System.out.println(arr[i]);
		}
		
		else {
			
			System.out.println(arr[i]+" is not divisible by 2");
		}
	}
	}

}
