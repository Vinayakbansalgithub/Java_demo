package SelFrDemo;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TabSwitchWindows {
	public static WebElement element;
	static boolean learning(){
		return true;
	}
public static void main(String[] args) throws Exception{
	
	WebDriver driver = new FirefoxDriver();
	
	WebDriverWait wait= new WebDriverWait(driver, 1000);
		driver.get("https://www.dineout.co.in/delhi");
	String windowHandle = driver.getWindowHandle();
	driver.findElement(By.xpath("//img[@title='Hot offers in Delhi']")).click();
	Thread.sleep(2000);
	System.out.println(driver.getPageSource().contains("404"));
	ArrayList<String> availableWindows = new ArrayList<String>(driver.getWindowHandles()); 
	System.out.println(availableWindows.size());
	
	for(String winHandle :availableWindows){
	    driver.switchTo().window(winHandle);
	    try{
	    element=driver.findElement(By.xpath("//div/h3[text()='Sort By']"));
	    
	    }
	    catch(Exception e){
	    	element=null;
	    }if(element != null)
	    break;
	}
	element= driver.findElement(By.xpath(".//*[@id='rest_header']"));
	
	Assert.assertEquals("Hot Offers Restaurants in Delhi", element.getText());
}
}
