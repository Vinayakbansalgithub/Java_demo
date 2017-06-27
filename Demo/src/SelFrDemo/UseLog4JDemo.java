package SelFrDemo;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class UseLog4JDemo {
	// Initialize Log4j logs
	private static Logger Log = Logger.getLogger(UseLog4JDemo.class);
	public static void main(String[] args) {
		DOMConfigurator.configure("D://workspace//Demo//src//SelFrDemo//MyLog4j.xml");
	    WebDriver driver=new FirefoxDriver();           
        Log.info("driver has beeen started");
	    //Launching the site.               
	        driver.get("http://demo.guru99.com/popup.php");         
	    driver.manage().window().maximize();        
	                     
	driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();           
	             
	    String MainWindow=driver.getWindowHandle();     //this will handle the main window
	             
	    // To handle all new opened window.             
	        Set<String> s1=driver.getWindowHandles();     
	    Iterator<String> i1=s1.iterator();        
	             
	    while(i1.hasNext())         
	    {       
	        String ChildWindow=i1.next();       
	                 
	        if(!MainWindow.equalsIgnoreCase(ChildWindow))           
	        {           
	              
	                // Switching to Child window
	                driver.switchTo().window(ChildWindow);      
	                                                                                      
	                                                                                          
	                    driver.findElement(By.name("emailid"))
	                   .sendKeys("gaurav.3n@gmail.com");            
	                                        
	                   driver.findElement(By.name("btnLogin")).click();         
	                              
	        // Closing the Child Window.
	                    driver.close();     
	        }       
	    }       
	    // Switching to Parent window i.e Main Window.
	        driver.switchTo().window(MainWindow);     
	        System.out.println("end");
	}
}
