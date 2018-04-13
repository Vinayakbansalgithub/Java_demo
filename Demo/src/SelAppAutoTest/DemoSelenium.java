package SelAppAutoTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSelenium {
	  void go() {
		// TODO Auto-generated method stub
System.out.println("hello");	

	 }

	public static void main(String[] args) throws Exception {
		
		//	WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver",
				"D:/workspace/Puresoftware_Automation/Automation/Automation_Framework_Puresoftware/driver/chromedriver.exe");
		
		
		
		
		
		
		ChromeDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	

	// Storing the Application Url in the String variable
	String url = "https://accounts.google.com/SignUp?hl=en-GB";

	driver.get(url);
	Thread.sleep(500); 
	
	
	
	
	WebElement nameEle=driver.findElement(By.id("FirstName"));
	
	
	
	
//	nameEle.sendKeys("Vinayak");
	
	Actions action = new Actions(driver);
	action.keyDown(nameEle,Keys.SHIFT).sendKeys(nameEle,"vinayak").build().perform();
	
	action.click(nameEle);
	
	// reverse shift
	action.keyDown(nameEle,Keys.SHIFT).build().perform();
	Thread.sleep(500); 

	WebElement src=driver.findElement(By.xpath(".//*[@id='link-signin']"));
	Thread.sleep(1500); 

	action.contextClick(src).build().perform();
	
	//action.contextClick(src).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
	
	/*Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_DOWN);
	robot.keyRelease(KeyEvent.VK_DOWN);
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);*/

	
	
	Set<String> str=driver.getWindowHandles();
//	action.sendKeys(nameEle,"t").build().perform();
	Thread.sleep(1500); 

	//action.sendKeys("w").build().perform();


//	
//	WebElement destination=driver.findElement(By.id("GmailAddress"));
//	
//	
//	action.dragAndDrop(src, destination).build().perform();
	
	 driver.findElement(By.id("LastName")).sendKeys("bansal");
	 driver.findElement(By.id("GmailAddress")).sendKeys("bansalvinayakpuresoftware");
	 
	driver.findElement(By.id("Passwd")).sendKeys("puresoft@123");
	driver.findElement(By.id("PasswdAgain")).sendKeys("puresoft@123");

	driver.findElement(By.id("BirthDay")).sendKeys("31");
	driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]")).click();
	driver.findElement(By.xpath(".//*[@id=':a']/div[text()='October']")).click();

	driver.findElement(By.xpath(".//*[@id='BirthYear']")).sendKeys("1993");
	driver.findElement(By.xpath(".//*[@id='Gender']/div")).click();
	driver.findElement(By.xpath(".//*[@id=':f']/div")).click();

	driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9582747112");




	 Thread.sleep(2000);
	WebElement next=driver.findElement(By.xpath(".//*[@id='submitbutton']"));
	
	
	
	next.click();

	/* Set<String> s=driver.getWindowHandles();
	 Object popup[]=s.toArray();
	 driver.switchTo().window(popup[1].toString());*/

	
	
	
	
	
	
/*	 Actions a=new Actions(driver);
	 a.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	Thread.sleep(2000)*/;
	
	
	
	 Thread.sleep(4000);
	
	/*driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img")).click();
	driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img")).click();
	
	driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img")).click();
	driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img")).click();
	driver.findElement(By.xpath(".//*[@id='tos-scroll-button']/div/img")).click();*/
	Thread.sleep(2000);
	
	
	//
	 driver.findElement(By.xpath(".//*[@id='header-text-div']")).click();

	WebElement element= driver.findElement(By.xpath("(.//*[@id='tos-text']/div)[last()]"));
	
	//action.moveToElement(element);
	
	//WebElement ele=driver.findElement(By.xpath(".//*[@id='iagreebutton']"));
	
	
	//((JavascriptExecutor) driver).executeScript("scroll(0,1900)", element);
//	element.click();
//	((JavascriptExecutor) driver).executeScript("javascript:window.scrollBy(0,1350)");

	
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	// js.executeScript("javascript:window.scrollBy(0,1350)"); 
	 Thread.sleep(4000);
	 driver.findElement(By.xpath(".//*[@id='iagreebutton']")).click();
	}


}
