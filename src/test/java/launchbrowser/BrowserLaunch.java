package launchbrowser;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BrowserLaunch {
	WebDriver driver;
	
  @Test
  public void google() {
	  driver.get("https://www.google.com");
	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
