package javaprogram;

 class Testing {
	private String pwd="dinga90";

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}

public class Encapsulation
{
	public static void main(String[] args) {
		
		Testing t=new Testing();
		System.out.println(t.getPwd());
		t.setPwd("Donkey");
		System.out.println(t.getPwd());
	}
}