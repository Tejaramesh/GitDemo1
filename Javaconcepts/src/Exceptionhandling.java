
public class Exceptionhandling {
public static void main(String[] args) {
	System.out.println("******Main Starts*******");
	int[] arr= {20,10,50,60};
	try {
		System.out.println(arr[8]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("CAUGHT");
	}
System.out.println("********Main ends****");
}
	
}
