package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Youtubetest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new ChromeDriver();
    baseUrl = "https://www.blazedemo.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testYoutube() throws Exception {
    // Label: Test
    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1536,695 | ]]
    driver.get(baseUrl + "chrome://newtab/");
    driver.get("https://www.youtube.com/");
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=ytd-app, ytd-masthead, ytd-searchbox, input]]
    driver.findElement(By.xpath("//input[@placeholder = \"Search\"]")).clear();
    driver.findElement(By.xpath("//input[@placeholder = \"Search\"]")).sendKeys("pumeeth rajkumar");
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=ytd-app, ytd-masthead, ytd-searchbox, ytd-searchbox:nth-of-type(1) > button:nth-of-type(1)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=ytd-app, ytd-video-preview, ytd-video-preview:nth-of-type(1) > div:nth-of-type(1) > div:nth-of-type(2) > a:nth-of-type(1) > div:nth-of-type(2)]]
    // ERROR: Caught exception [Error: unknown strategy [shadow] for locator [shadow=ytd-app, ytd-page-manager, ytd-watch-flexy, ytd-player, div:nth-of-type(2) > div:nth-of-type(1) > button:nth-of-type(1)]]
  }

  @After
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
