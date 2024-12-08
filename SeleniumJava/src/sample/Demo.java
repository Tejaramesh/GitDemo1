package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(" webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromerdriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).click();
		//driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).getText());
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
			
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).getText());
	}}