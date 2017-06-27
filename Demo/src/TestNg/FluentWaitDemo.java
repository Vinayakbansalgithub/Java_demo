package TestNg;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.google.common.base.Function;

public class FluentWaitDemo {
	public static void main(String[] args) {
		
	
	WebDriver driver = new FirefoxDriver() ;
	   driver.get("http://demo.guru99.com/V4/");			
	//     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	     		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	     WebElement button =driver.findElement(By.name("btnLogin"));			
	     		
	     FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
	    		 
	    	       .withTimeout(60, TimeUnit.SECONDS)
	    	 
	    	       .pollingEvery(2, TimeUnit.SECONDS)
	    	 
	    	       .ignoring(NoSuchElementException.class);
	    	 
	     WebElement foo=	  wait.until(new Function<WebDriver,WebElement>() {

				@Override
				public WebElement apply(WebDriver driver) {
					// TODO Auto-generated method stub
		    	       return driver.findElement(By.name("btnLogin"));
				}
			});
	    	 /*
	    	   WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
	    	 
	    	     public WebElement apply(WebDriver driver) {
	    	 
	    	       return driver.findElement(By.id("foo"));
	    	 
	    	     }
	    	 
	    	   });*/
	     
	  

		
	   
	     
}
}
