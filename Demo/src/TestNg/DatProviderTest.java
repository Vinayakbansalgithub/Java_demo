package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatProviderTest {
	
	WebDriver driver;
	String baseURL = "https://www.linkedin.com/";
	
	@BeforeMethod
	public void setup(){

		  driver = new FirefoxDriver();
			driver.manage().window().maximize();
		  driver.navigate().to(baseURL);
	}
	
	@Test(dataProvider="data")
	public void myTest(String userName, String Password){
		WebElement user=driver.findElement(By.id("login-email"));
		WebElement pass=driver.findElement(By.id("login-password"));

		user.sendKeys(userName);
		pass.sendKeys(Password);
		driver.findElement(By.className("login-submit")).click();
		
	}
	
	
	@AfterMethod
	public void close(){
		driver.close();
	}
	@DataProvider
	public Object[][] data() {
		return new Object[][] { { "bansalvinayak014@gmail.com", "intellectual@31" }, { "hello" },{ "hello", "monika" },{ "hello", "nandini" } };

	}
	
}
