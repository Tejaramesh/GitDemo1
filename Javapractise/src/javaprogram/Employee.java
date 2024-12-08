package javaprogram;

public class Employee {
	String ename;
	int empid;
	double esal;
	Employee(String ename, int empid, double esal)
	{
		this.ename=ename;
		this.empid=empid;
		this.esal =esal;
	}

	public static void main(String[] args) {
		
		System.out.println("*********Main Starts**************");
		Employee details = new Employee("Teja",22612,31975.9);
		System.out.println("********Main Ends***************");
		System.out.println(details.empid);
		System.out.println(details.ename);
		System.out.println(details.esal   );
	}
}
