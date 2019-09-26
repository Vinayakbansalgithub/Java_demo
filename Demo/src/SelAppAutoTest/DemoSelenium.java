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
	 

	public static void main(String[] args) throws Exception {
		
		//	WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver",
				"/Users/vinayakbansal/Downloads/chromedriver");
		
		driver.get("https://test.salesforce.com/");
        
//      driver.findElement(By.xpath("//*[@id=\"link-rail\"]/div/div/div[1]/nav/ul/li[2]/a")).click();
      
      Thread.sleep(5000);
              
      driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("partner.reshma.kuntoji@philips.com.sysadmin");

      driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("123Sales567@");

      
      driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
      
      Thread.sleep(5000);
      
      driver.navigate().to("https://philipsb2c--b2csit--c.cs105.visual.force.com/apex/B2C_PTP_ProductTestCreation?retURL=%2Fa36%2Fo&save_new=1&sfdc.override=1");
      
      Thread.sleep(5000);
      
//      driver.findElement(By.xpath("//*[@id=\"vf-myaccount-logon-form\"]/div[5]/div[2]/a")).click();
      
      driver.findElement(By.xpath("//*[@id=\"j_id0:ProductTestForm:j_id35:GIPGSection:j_id38:j_id42\"]")).sendKeys("test2019");
      
      WebElement frameElement=driver.findElement(By.xpath("//IFRAME[@title=\"Rich Text Editor, j_id0:ProductTestForm:j_id35:j_id65:j_id66:j_id70:textAreaDelegate_Test_Description__c\"]"));
      driver.switchTo().frame(frameElement);
      
      driver.findElement(By.xpath("//*[@id=\"j_id0:ProductTestForm:j_id35:j_id65:j_id66:j_id70:textAreaDelegate_Test_Description__c_rta_body\"]")).sendKeys("TESTdATA");
      
      Thread.sleep(5000);
      
//      driver.findElement(By.cssSelector("#j_id0\\:ProductTestForm\\:j_id35\\:j_id93\\:selectListOutputPanelId\\:productTestTypeSelectList")).click();
//      
//      Select drop = new Select(driver.findElement(By.xpath("//*[@id=\"j_id0:ProductTestForm:j_id35:j_id93:selectListOutputPanelId:productTestTypeSelectList\"]")));
//      drop.selectByVisibleText("Known Product Test");
//      fruits.selectByIndex(1);
      
//      driver.findElement(By.xpath("//*[@id=\"j_id0:ProductTestForm:j_id35:j_id93:selectListOutputPanelId:productTestTypeSelectList\"]")).click();
//      
//      driver.findElement(By.xpath("//*[@id=\"j_id0:ProductTestForm:j_id35:j_id93:selectListOutputPanelId:productTestTypeSelectList\"]/option[3]")).click();
//      
      driver.findElement(By.cssSelector("a#j_id0\\:ProductTestForm\\:j_id35\\:productTypePanelId\\:j_id101\\:j_id103_lkwgt > img]")).click();
      
//      driver.findElement(By.xpath("//*[@id=\"WC_VFMyAccountRegistrationForm_FormInput_logonPassword_In_Register_1\"]")).sendKeys("F89URi9Jsdw");
//      
//      driver.findElement(By.xpath("//*[@id=\"loyalty-program-register\"]")).click();
//      
//      driver.findElement(By.xpath("//*[@id=\"buttoncreateaccount\"]")).click();
      
      String handle= driver.getWindowHandle();
       
      System.out.println(handle);

      // Click on the Button "New Message Window"

//      driver.findElement(By.name("New Message Window")).click();

      // Store and Print the name of all the windows open                  

      Set handles = driver.getWindowHandles();

      System.out.println(handles);

      // Pass a window handle to the other window

      for (String handle1 : driver.getWindowHandles()) {

       System.out.println(handle1);

       driver.switchTo().window(handle1);

       }
      
      WebElement frameElement1=driver.findElement(By.xpath("//FRAME[@id=\"resultsFrame\"]"));
      driver.switchTo().frame(frameElement1);
      
      driver.findElement(By.xpath("//*[@id=\"col0\"]")).click();
		
		
		
		
		
	}


}
