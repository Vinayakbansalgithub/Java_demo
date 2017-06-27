package SelFrDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AutoItDemo {
	private static WebDriver driver = null;
	 
	public static void main(String[] args) throws IOException, InterruptedException {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
	 
	/*	WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Demo\\driver\\chromedriver.exe");
		driver = new ChromeDriver();*/
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	    driver.get("http://toolsqa.com/automation-practice-form");
 
	    driver.findElement(By.id("photo")).click();
	    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	// Now you can do whatever you need to do with it, for example copy somewhere

	    FileUtils.copyFile(scrFile, new File("D:\\workspace\\Demo\\src\\screenshots\\screenshot.png"));
 
	    Runtime.getRuntime().exec("D:\\workspace\\Demo\\src\\Autoit\\File_upload.Exe D:\\workspace\\Demo\\src\\Autoit\\images.jpg").getInputStream();

	    Thread.sleep(50000);
	  String str=  driver.findElement(By.xpath("(.//*[@id='content']/form/fieldset/div/strong)[1]")).getText();
	 if( str.equals("First name:"))
	  System.out.println(str+"string are equal");
	  else
		  System.out.println("values are not equal");
	    driver.close();
 
	}
}
