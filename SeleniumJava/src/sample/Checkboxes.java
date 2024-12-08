package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty(" webdriver.chrome.driver", "C:\\Driver\\chromedriver-win64\\chromerdriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		//Thread.sleep(10000);
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		//Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		//count the number of checkboxes
		Assert.assertEquals(driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa']")).size(), 6);
		System.out.println(driver.findElements(By.xpath("//div[@class='css-76zvg2 r-cqee49 r-1enofrn r-1ozqkpa']")).size());
		
		
	}
}
