package Firstproject;

public class Constructor_Realtime {
	int emp_id;
	String emp_name;
	double emp_sal;
	Constructor_Realtime(int a, String b, double c)
	{
		emp_id=a;
		emp_name=b;
		emp_sal=c;
	}
	public static void main(String[] args) {
		System.out.println("*******Main Starts*********");
		Constructor_Realtime Employee=new Constructor_Realtime(100, "Teja R", 28705.65);
		System.out.println(Employee.emp_id);
		System.out.println(Employee.emp_name);
		System.out.println(Employee.emp_sal);
		System.out.println("*******Main Ends********");
	}

}
