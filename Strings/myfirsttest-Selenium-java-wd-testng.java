package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Myfirsttest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testMyfirst() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1536,695 | ]]
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://hubdriveonlinetest.eoxvantage.com/");
    driver.get("https://keycloak.eoxvantage.com/auth/realms/HUBDriveOnline/protocol/openid-connect/auth?client_id=hubdriveonlineTest&redirect_uri=https%3A%2F%2Fhubdriveonlinetest.eoxvantage.com%2F&state=42bdc980-e714-43e8-89af-ee37b9858bcb&response_mode=fragment&response_type=code&scope=openid&nonce=0d2b1429-1629-494e-a90e-50b674c8422b");
    // ERROR: Caught exception [unknown command [typeSecret]]
    driver.findElement(By.xpath("//*[contains(text(), \"Username or email \")]")).click();
    // ERROR: Caught exception [unknown command [typeSecret]]
    driver.findElement(By.xpath("//input[@value = \"Sign In\"]")).click();
    driver.get("https://hubdriveonlinetest.eoxvantage.com/#state=42bdc980-e714-43e8-89af-ee37b9858bcb&session_state=0b3b0336-0661-498c-8053-88c9b5496e4d&code=b36e8d50-b3e7-475c-93b0-999b2db70db3.0b3b0336-0661-498c-8053-88c9b5496e4d.4d1e6612-4a22-42d2-8946-7c65c48bfedd");
    driver.findElement(By.xpath("//*[text() = \"HUB Drive Online\"]")).click();
    driver.findElement(By.xpath("//a[@title = \"Contractor Benefits\"]")).click();
    // ERROR: Caught exception [ERROR: Unsupported command [contextMenuAt | //*[text() = "apple one's comapny"] | 148,19]]
    // ERROR: Caught exception [ERROR: Unsupported command [contextMenuAt | //*[text() = "Motorol's"] | 76,21]]
    driver.findElement(By.cssSelector("i.fa.fa-eye.manageIcons")).click();
    driver.findElement(By.cssSelector("i.fa.fa-arrow-left")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
