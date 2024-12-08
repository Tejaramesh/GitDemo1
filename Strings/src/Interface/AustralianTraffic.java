package Interface;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {
	
	public static void main(String[] args) {
		AustralianTraffic a = new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.yellowFlash();
		a.Trainstop();
		a.walk();
	}
	
	public void walk()
	{
	 System.out.println("People should walk and cross road when signal is 'Green'");	
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green go implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop implementation");
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("Yellow flash implememtation");
	}

	@Override
	public void Trainstop() {
		// TODO Auto-generated method stub
		System.out.println("Train should stop when signal is 'RED'");
		
	}

}
