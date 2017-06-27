package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Paralleltest {
	
	
	WebDriver driver;
	String baseURL = "https://www.linkedin.com/";

	@org.testng.annotations.BeforeClass
	public void setup() {
		
	}

	
  @Test
  public void T1() throws InterruptedException{
	  driver = new FirefoxDriver();
		driver.manage().window().maximize();
	  driver.navigate().to(baseURL);
		System.out.println("Verify login page test started");
		System.out.println(Thread.currentThread().getId());
		Thread.sleep(50000);
		WebElement element = driver.findElement(By.cssSelector("h3.subtitle"));
		String headerText = element.getText();
		System.out.println(headerText);
		Assert.assertEquals(headerText, "Get started - it's free.");  }
	
  @Test
  public void T2() throws InterruptedException{
	  driver = new FirefoxDriver();
		driver.manage().window().maximize();
	  driver.navigate().to(baseURL);
		System.out.println(Thread.currentThread().getId());

		System.out.println("Verify login page test started");
		Thread.sleep(50000);
		WebElement element = driver.findElement(By.cssSelector("h3.subtitle"));
		String headerText = element.getText();
		System.out.println(headerText);
		Assert.assertEquals(headerText, "Get started - it's free.");
  }
  
  
}
