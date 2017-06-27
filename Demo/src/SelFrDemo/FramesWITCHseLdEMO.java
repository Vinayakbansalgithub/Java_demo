package SelFrDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesWITCHseLdEMO {
public static void main(String[] args) {

	
	 WebDriver driver = new FirefoxDriver(); //navigates to the Browser
     driver.get("http://www.guru99.com/selenium-tutorial.html"); 
        // navigates to the page consisting an iframe

        driver.manage().window().maximize();
        driver.switchTo().frame("a077aa5e"); //switching the frame by ID

         System.out.println("********We are switch to the iframe*******");
         driver.findElement(By.xpath("html/body/a/img")).click();
         //Clicks the iframe
     
         System.out.println("*********We are done***************");
	driver.quit();
}
}
