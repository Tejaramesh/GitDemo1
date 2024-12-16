package miscellaneous_Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcheck {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		//options.setAcceptInsecureCerts(true);
		WebDriver driver = new ChromeDriver();
		options.setAcceptInsecureCerts(true);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
