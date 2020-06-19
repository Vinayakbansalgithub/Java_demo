package SelAppAutoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Way2Auto {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"D:/workspace/Puresoftware_Automation/Automation/Automation_Framework_Puresoftware/driver/chromedriver.exe");
	
	
	
	
	
	
	ChromeDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
		
driver.get("http://way2automation.com/way2auto_jquery/dropdown.php");
driver.findElement(By.linkText("Signin")).click();




driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
//Alert alert = driver.switchTo().alert();
WebElement ele=driver.findElement(By.xpath(".//*[@id='load_form']/fieldset[1]/input"));



ele.sendKeys("deeparora84@gmail.com");
WebElement ele2=driver.findElement(By.xpath("//input[@name='password']"));

ele2.sendKeys("Selenium123");
System.out.println("end");

}

}
