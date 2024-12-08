
public class Employee {

	int job_vac;
	String job_des;
	double job_sal;
	
	Employee(int job_vac,String job_des,double job_sal)
	{
		
		this.job_vac=job_vac;
		this.job_des=job_des;
		this.job_sal=job_sal;
	}
	public static void main(String[] args) {
		Employee emp=new Employee(2,"Test Engineer",15000.0);
  System.out.println(emp.job_vac);
  System.out.println(emp.job_des);
  System.out.println(emp.job_sal);	   
		
	}
	
	
	
	
	
	
	
	
	
}
