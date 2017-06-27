package SelFrDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) throws Exception {
	WebDriver driver = new FirefoxDriver();
	System.out.println("opening firefox driver");

	// driver.get("http://puresoftware.com/");
	 driver.get(" https://www.seleniumeasy.com/");
	 Thread.sleep(5000);
	 
	 System.out.println("start");
	 Actions ToolTip1 = new Actions(driver);
	    WebElement googleLogo = driver.findElement(By.xpath(".//*[@id='site-name']/a"));

	    Thread.sleep(2000);
	    
	    ToolTip1.moveToElement(googleLogo).build().perform();

	  //  ToolTip1.clickAndHold(googleLogo).perform();
	   // googleLogo.click();
	    Thread.sleep(8000);
	 System.out.println("end");
}
}
