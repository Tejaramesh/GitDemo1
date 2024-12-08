package Firstproject;

public class Facebook_Realtime {

	static void login()
	{
		System.out.println("Logged in successfully...........");
	}
	
	public static void main(String[] args) {
		signup();
		login();
		homePage();
		logout();
	}
static void logout()
{
	System.out.println("Logged out successfully...........");
}
static void signup()
{
	System.out.println("Signed up successfully.........");
}
static void homePage()
{
	System.out.println("Home page.......");
}
}
