package SelFrDemo;
import java.io.File;
import java.io.FileInputStream;

//import Util.waitForJSandJQueryToLoad;

import java.util.concurrent.ConcurrentHashMap;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class SelDemo extends Thread{
	
	
	public static WebDriver driver = null;
public 	static void tittle(ConcurrentHashMap<String, String> objKeyValue, ConcurrentHashMap<String, String> objKeyType) {
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
	
	//	LogDetails.info("Starting Automation framework");
		
		
		
		WebDriver driver = new FirefoxDriver();
		
	      //Launch website
	      driver.navigate().to("http://www.calculator.net/");
	      
	      //Maximize the browser
	      driver.manage().window().maximize();
   
	    // waitForJSandJQueryToLoad.ajaxcall();
	      // Click on Math Calculators
	      driver.findElement(By.xpath(objKeyValue.get("abc"))).click();
	      
	      // Click on Percent Calculators
	      driver.findElement(By.xpath(objKeyValue.get("qqq"))).click();
	      
	      // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");
	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");
	      
	      // Click Calculate Button
	      driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[2]/td/input[2]")).click();

	      
	      // Get the Result Text based on its xpath
	      String result = driver.findElement(By.xpath(".//*[@id='content']/p[2]/font/b")).getText();

	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
	      
	      //Close the Browser.
	      driver.close();
	   }
	

}
