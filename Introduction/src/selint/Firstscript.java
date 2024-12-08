package selint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Firstscript {
	
	public static void main(String[] args) {
		
		/*System.setProperty(" webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromerdriver.exe");
		
		WebDriver driver=new ChromeDriver();
	   driver.get("https://rahulshettyacademy.com");
	   System.out.println(driver.getTitle());
	   System.out.println(driver.getCurrentUrl());
	   driver.close();*/
	   
	   
	   //Launching firefox driver
	   
	  /* System.setProperty(" webdriver.gecko.driver", "C:\\Driver\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");
		
		WebDriver driver2=new FirefoxDriver();
		 driver2.get("https://rahulshettyacademy.com");
		   System.out.println(driver2.getTitle());
		   System.out.println(driver2.getCurrentUrl());
		   driver2.close();*/
		   
		   
		   System.setProperty(" webdriver.edge.driver", "C:\\Driver\\edgedriver_win64\\msedgedriver.exe");
			
			WebDriver driver2=new EdgeDriver();
			 driver2.get("https://rahulshettyacademy.com");
			   System.out.println(driver2.getTitle());
			   System.out.println(driver2.getCurrentUrl());
			  driver2.close();
		
	}

}
