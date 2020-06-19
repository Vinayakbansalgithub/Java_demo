package SelFrDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathInputCheck  {
public static void main(String[] args) throws Exception {
	WebDriver driver = new FirefoxDriver();
	System.out.println("opening firefox driver");

	// driver.get("http://puresoftware.com/");
	 driver.get(" https://www.oxigenwallet.com/");

	//driver.get("http://www.magicbricks.com/");

	// driver.manage().window().maximize();
	
	WebElement element=driver.findElement(By.xpath("//input[ @type='radio' and @class='recharge_mode' and  @id='mobprepaid' and  @name='MobileRecharge[service]' and  @value= 'prepaid']"));
	element.click();
	Thread.sleep(5000);
}
}
