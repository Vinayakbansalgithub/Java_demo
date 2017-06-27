package SelFrDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SameTypeSelenium {
	public static void main(String[] args) throws IOException {
		
	//read from console
		BufferedReader br = null;

            br = new BufferedReader(new InputStreamReader(System.in));

           
               
		
		
		
	WebDriver driver = null;
	driver = new FirefoxDriver();
	
	driver.get("http://toolsqa.com/automation-practice-form/");
	
	String locator=".//*[@id='primary-menu']/li/a/span/span/span[contains(text(),'movie')]";
	try{
		WebElement eleone = driver.findElement(By.xpath(locator));
		
	} catch (NoSuchElementException e) {
		
		String parentvalue=getTrimmedString(locator);
		
		List<WebElement> ele = driver.findElements(By.xpath(parentvalue));
		
		for (WebElement webElement : ele) {
			
			System.out.println(webElement.getText());
		}
		 System.out.print("Enter value to be clicked : ");
         String input = br.readLine();
         parentvalue=parentvalue+"//*[contains(text(),'"+input+"')]";
         
      System.out.println("parent value is  "+parentvalue);
         driver.findElement(By.xpath(parentvalue)).click();
		
	}
			
	

	System.out.println("fjkfhekn");
	/*
     // Create an interface WebElement of the div under div with **class as facetContainerDiv**
     WebElement WebElement =    driver.findElement(By.xpath("//div[@class='facetContainerDiv']/div"));
     // Create an IList and intialize it with all the elements of div under div with **class as facetContainerDiv**
     List<WebElement> AllCheckBoxes = WebElement.findElement(By.xpath("//label/input"));
     // Get the count of check boxes 
     int RowCount = WebElement.findElement(By.xpath("//label/input")).Count;
     for (int i = 0; i < RowCount; i++)
     {
     // Check the check boxes based on index
        AllCheckBoxes[i].Click();

     }
     Console.WriteLine(RowCount);
     Console.ReadLine(); 
*/
}
	
	public static String getTrimmedString(String s){
		int counter =0;
		String n;
		String s1 = new String();
		while(counter!=4){
			int indexOfS = s.indexOf("/");
			n = counter!=3?s.substring(0, indexOfS + 1) : s.substring(0, indexOfS);
			s = s.substring(n.length());
			s1 = s1 + n;
			counter ++;
		}
		System.out.println(s1);
		return s1;
	}
}
