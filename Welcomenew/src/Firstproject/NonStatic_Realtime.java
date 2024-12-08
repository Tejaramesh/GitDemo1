package Firstproject;

public class NonStatic_Realtime {
	int java_mock;
	static String in_name="Q spiders";
	public static void main(String[] args) {
		System.out.println(in_name);
		NonStatic_Realtime std_1=new NonStatic_Realtime();
		std_1.java_mock=2;
		System.out.println("Geetha's mock rating is "+std_1.java_mock);
NonStatic_Realtime std_2=new NonStatic_Realtime();
std_2.java_mock=1;
System.out.println("Teja's mock rating is "+std_2.java_mock);
	}
}
