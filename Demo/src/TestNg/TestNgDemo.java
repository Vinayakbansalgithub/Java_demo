package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {
	public WebDriver driver;
  @Test
  public void f() {
	// Find the element that's ID attribute is 'account'(My Account)

      driver.findElement(By.id("account")).click();

      // Find the element that's ID attribute is 'log' (Username)

      // Enter Username on the element found by above desc.

      driver.findElement(By.id("log")).sendKeys("testuser_1");

      // Find the element that's ID attribute is 'pwd' (Password)

      // Enter Password on the element found by the above desc.

      driver.findElement(By.id("pwd")).sendKeys("Test@123");

      // Now submit the form. WebDriver will find the form for us from the element

      driver.findElement(By.id("login")).click();

      // Print a Log In message to the screen

      System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

      // Find the element that's ID attribute is 'account_logout' (Log Out)

      driver.findElement(By.id("account_logout"));

  }
  @BeforeMethod
  public void befourMethod()
  {
	  driver= new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("http://www.onlinestore.toolsqa.wpengine.com");
  }
  @AfterMethod
  public void afterMethod(){
	  driver.quit();
  }
}
