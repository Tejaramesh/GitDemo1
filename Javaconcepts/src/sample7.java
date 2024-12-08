
abstract interface sample78 {
	void disp();
	void test();
}

 abstract class sample8 implements sample78                                                 
{
	void hi()
	{
		System.out.println("Hi");
	}
}
 
 class Tester455 extends sample8{
	 
	 public void disp()
	 {
		 System.out.println("test");
	 }
	 
	 public void test()
	 {
		 System.out.println("testing");
	 }
 }
 class sample7
 {
	 public static void main(String[] args) {
		Tester455 te=new Tester455();
		te.disp();
		te.test();
		te.hi();
	}
 }