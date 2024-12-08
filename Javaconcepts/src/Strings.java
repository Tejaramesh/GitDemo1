
public class Strings {

	public static void main(String[] args) {
		
		//String is an object //String literals
		
		String s1="hello";
		String s2="Mohan";
		String s3="Mohan";
		
		String s4=new String("MOhan");
		String s5=new String("MOhan");
		
		String s6="Rahul Shetty Academy";
		
		String[] sparr = s6.split("Shetty");
		System.out.println(sparr[0]);
		System.out.println(sparr[1].trim());
		
	}
}
