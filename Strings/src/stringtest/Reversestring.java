package stringtest;

public class Reversestring {
	public static void main(String[] args) {
		String s="madam";
		String j="";
		
		for(int i=s.length()-1; i>=0;i--)
		{
			j=j+s.charAt(i);
		}
		System.out.println(j);
		System.out.println(s);
		
		if(j.equalsIgnoreCase(s))
		{
			System.out.println("the given string is a palindrome");
		}
		else
		{
			System.out.println("the given String is not a palindrome");
		}
	}

}
