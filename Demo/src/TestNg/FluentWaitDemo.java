package TestNg;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.base.Function;

public class FluentWaitDemo {
	public static void main(String[] args) {
		System.out.println("start");
	

		int num=2;
		int count=0;
		
		
		while(num>0){
			
			
			num=num>>1;
			count++;			
			
			
	}
		
		
		System.out.println(count);
	
	System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Puresoftware_Automation\\Automation\\Automation_Framework_Puresoftware\\driver\\chromedriver.exe");
	WebDriver driver = new PhantomJSDriver();
		//	ChromeDriver();
	   driver.get("http://demo.guru99.com/V4/");			
	   
	   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	   WebDriverWait eWait= new WebDriverWait(driver, 500);
	   
	   WebElement username =driver.findElement(By.name("uid"));
	   username.sendKeys("mngr118043");
	   
	   WebElement password =driver.findElement(By.name("password"));
	   password.sendKeys("ugYtUgY");
	   
	    
	     			     		
	    // driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	     WebElement lgnwait= eWait.until(ExpectedConditions.elementToBeClickable(By.name("btnLogin")));
	     System.out.println( lgnwait.isDisplayed());

	    // WebElement login =driver.findElement(By.name("btnLogin"));		
	     lgnwait.click();
	     
	    
	     
	     FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)

  				.withTimeout(60, TimeUnit.SECONDS)

  				.pollingEvery(2, TimeUnit.SECONDS)

  				.ignoring(NoSuchElementException.class);

  				WebElement foo= wait.until(new Function<WebDriver,WebElement>() {

  				@Override
  				public WebElement apply(WebDriver driver) {
  					// TODO Auto-generated method stub
  				    return driver.findElement(By.name("btnLogin"));
  				}
  				});
  				
  				
	    
	     WebElement Customer= eWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='New Customer']")));
	     
	    System.out.println( Customer.isDisplayed());
	     
	      
	    Customer.click();
	     
	    driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
	     
	     		driver.close();
	     		
	     		
	     		
	   
	     
	  

		
	   
	     
}
}








































/**/
