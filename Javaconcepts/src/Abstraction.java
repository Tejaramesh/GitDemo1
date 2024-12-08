interface Animal
{
	void noise();
}

class cat implements Animal
{
	public void noise()
	{
		System.out.println("meow meow meow");
	}
}

class Dog implements Animal
{
	public void noise()
	{
		System.out.println("Bow Bow Bow");
	}
}

class Snake implements Animal
{
	public void noise()
	{
		System.out.println("CHUSS CHUSS BUSS");
	}
}

class Stimulator{
	static void ansim(Animal a1)
	{
		a1.noise();
	}

	 
}

         
public class Abstraction {

	public static void main(String[] args) {
		cat c1=new cat();
		Dog d1=new Dog();
		Snake s1=new Snake();
		Stimulator.ansim(c1);
		Stimulator.ansim(d1);
		Stimulator.ansim(s1); 
		  
	}
	
}
