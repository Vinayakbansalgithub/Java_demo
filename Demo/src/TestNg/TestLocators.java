package TestNg;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;


public class TestLocators {
	 static WebElement element;
public static void main(String[] args) throws Exception {
	WebDriver driver= new FirefoxDriver();
//	WebDriver driver= new HtmlUnitDriver();
	driver.manage().window().maximize();
	driver.get("https://www.linkedin.com/");
	Thread.sleep(2000);
 element=	driver.findElement(By.className("reg-firstname"));
 element.sendKeys("vinaya bansal");

element=driver.findElement(By.id("reg-lastname"));
element.sendKeys("bansal ji");

String strrr=driver.findElement(By.name("lastName")).getCssValue("font-size");
System.out.println(strrr);
	element.sendKeys("bansalvinayak014@gmail.com");
	
element= driver.findElement(By.cssSelector("input.reg-password"));
	element.sendKeys("hello");
	
	
	element = driver.findElement(By.linkText("Forgot password?"));
	/*String str=driver.findElement(By.tagName("input")).getText();
	System.out.println(str);*/
	
Actions action= new Actions(driver);

//action.moveToElement(element).contextClick().build().perform();
//new Actions(driver).keyDown(Keys.ALT).sendKeys(Keys.SPACE).keyUp(Keys.ALT).sendKeys("n").perform(); 
new Actions(driver).keyDown(Keys.CONTROL).sendKeys("a").perform(); 


File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	Robot robot= new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);

	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_DOWN);

	robot.keyPress(KeyEvent.VK_ENTER);


}

}
