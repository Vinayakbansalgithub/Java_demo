package SelFrDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.opera.core.systems.internal.ImplicitWait;

public class SelSelf {
	public static void main(String[] args) {
		WebDriver wd= new FirefoxDriver();
		wd.manage().window().maximize();
		String subWindowHandler = null;
		wd.get("https://www.oxigenwallet.com/");
		String parentWindowHandler = wd.getWindowHandle(); // Store your parent window		System.out.println(wd.getWindowHandle());
		
		
		//html/body/header/nav/div/div/ul/li[7]/a/i
		WebElement welogin= wd.findElement(By.xpath("//html/body/header/nav/div/div/ul/li[7]/a/i"));
		welogin.click();
		
		Set<String> handles = wd.getWindowHandles(); // get all window handles
		Iterator<String> iterator = handles.iterator();
		while (iterator.hasNext()){
		    subWindowHandler = iterator.next();
		}
		wd.switchTo().window(subWindowHandler); // switch to popup window
		                                            // perform operations on popup
		WebElement signup= wd.findElement(By.xpath(".//*[@id='signup-mobile']"));
		signup.sendKeys("9582747112");
		try{
			Thread.sleep(2000);
		}catch(Exception w){}
		WebElement password= wd.findElement(By.xpath(".//*[@id='signup-password']"));
		password.sendKeys("312710");	
		
		WebElement submit= wd.findElement(By.xpath(".//*[@id='btn-signin-submit']"));
		submit.click();
		
		try{
			Thread.sleep(2000);
		}catch(Exception w){}
		
		
		wd.switchTo().window(parentWindowHandler);  // switch back to parent window
		WebElement we= wd.findElement(By.xpath(".//*[@id='mobilerecharge-service_number']"));
		we.sendKeys("9582747112");
		WebElement wedd= wd.findElement(By.xpath(".//*[@id='mobilerecharge-operator']"));

		Select sel= new Select(wedd);
		sel.selectByValue("VODA");
		try{
			Thread.sleep(2000);
		}catch(Exception w){}
		WebElement weamount= wd.findElement(By.xpath(".//*[@id='mobilerecharge-amount']"));
		weamount.sendKeys("10");
		// .//*[@id='button-mobile-recharge']
		
		WebElement webutton= wd.findElement(By.xpath(".//*[@id='button-mobile-recharge']"));
		we.submit();
		ImplicitWait wait= new ImplicitWait(null);
		
		WebElement webuttonconfirm= wd.findElement(By.xpath(".//*[@id='button-mobile-confirm-recharge']"));
		webuttonconfirm.submit();
		wd.quit();
	}

}
