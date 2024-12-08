package Firstproject;

public class Constructor_Realtime_Student {
	int std_id;
	String std_name;
	String std_sec;
	Constructor_Realtime_Student( int std_id, String std_name, String std_sec)//parameters
	{
		this.std_id=std_id;
		this.std_name=std_name;
		this.std_sec=std_sec;
	}
	public static void main(String[] args) {
	Constructor_Realtime_Student student= new Constructor_Realtime_Student(420, "Teja R", "B Section");//Arguments;
	System.out.println(student.std_id);
	System.out.println(student.std_name);
	System.out.println(student.std_sec);
	}
}
