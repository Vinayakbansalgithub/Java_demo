package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptTest {
public static void main(String[] args) {
	 WebDriver driver= new FirefoxDriver();			
		
     //Creating the JavascriptExecutor interface object by Type casting		
     JavascriptExecutor js = (JavascriptExecutor)driver;		
     		System.out.println(System.currentTimeMillis());
     //Launching the Site.		
     driver.get("http://demo.guru99.com/V4/");			
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
     		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
     WebElement button =driver.findElement(By.name("btnLogin"));			
     		
     
     String urldriver=driver.getCurrentUrl();
     String urljs=(String) js.executeScript("return document.URL");
     System.out.println(urldriver+"-----"+urljs);
     //Login to Guru99 		
     driver.findElement(By.name("uid")).sendKeys("mngr34926");					
     driver.findElement(By.name("password")).sendKeys("amUpenu");					
     String sText =  js.executeScript("return document.title;").toString();     System.out.println(sText);
     //Perform Click on LOGIN button using JavascriptExecutor		
     js.executeScript("arguments[0].click();", button);
     
     // refresh browser
     js.executeScript("history.go(0)");
                             
     //To generate Alert window using JavascriptExecutor. Display the alert message 			
    // js.executeAsyncScript("alert('User or Password is not valid');");   
}
}
