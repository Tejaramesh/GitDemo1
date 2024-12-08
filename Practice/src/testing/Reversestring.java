package testing;

public class Reversestring {
	public static void main(String[] args) {
		
		String s="Good";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
