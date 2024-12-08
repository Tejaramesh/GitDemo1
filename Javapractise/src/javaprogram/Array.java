package javaprogram;

public class Array {
public static void main(String[] args) {
	char[] arr=new char[4];
	arr[0]='a';
	arr[1]='b';
	arr[2]='c';
	arr[3]='d';
	System.out.println("*********************");
	System.out.println("index \t values");
	System.out.println("*********************");
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(i+"\t"+arr[i]);
	}
}
}
