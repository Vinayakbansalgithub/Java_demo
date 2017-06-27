package SelFrDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwipeDemo {
	static AndroidDriver driver;
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		 Dimension size;
		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability("deviceName", "V00776141140523199");
		  capabilities.setCapability("browserName", "Android");
		  capabilities.setCapability("platformVersion", "6.0.1");
		  capabilities.setCapability("platformName", "Android");
		  capabilities.setCapability("appPackage", "com.fortysevendeg.android.swipelistview");
		  capabilities.setCapability("appActivity","com.fortysevendeg.android.swipelistview.sample.activities.SwipeListViewExampleActivity");
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  WebDriverWait wait = new WebDriverWait(driver, 300);
		 
		  
		// driver.findElementByName("APK Info");
		//  String text = dvrList.get(1).getText();
		//  driver.findElement(By.className("android.widget.RelativeLayout"));
		 // wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.RelativeLayout")));
		 
		 WebElement apkInfo =  driver.findElementByName("APK Info");
		 
		 Point point = apkInfo.getLocation() ;
		 
		int swipeStart= point.getY();
		 
		 
		 
		//  Android System WebView
		  size = driver.manage().window().getSize();
		  System.out.println(size);
		
		  //Find swipe start and end point from screen's with and height.
		  //Find startx point which is at right side of screen.
		  int startx = (int) (size.width * 0.70);
		  //Find endx point which is at left side of screen.
		  int endx = (int) (size.width * 0.30);
		  
		  
		  //Find swipe start and end point from screen's with and height.
		  //Find starty point which is at bottom side of screen.
		  int starty1 = (int) (size.height * 0.80);
		  //Find endy point which is at top side of screen.
		  int endy = (int) (size.height * 0.20);
		  
		  
		  //Find vertical point where you wants to swipe. It is in middle of screen height.
	//	  int starty = size.height / 2;
		  int starty = swipeStart / 2;
		  System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

		  //Swipe from Right to Left.
		  driver.swipe(startx, starty, endx, starty, 3000);
		  Thread.sleep(2000);

		  //Swipe from Left to Right.
		  driver.swipe(endx, starty, startx, starty, 3000);
		  Thread.sleep(2000);
		  size = driver.manage().window().getSize();
		  System.out.println(size);
		   
		
		  //Find horizontal point where you wants to swipe. It is in middle of screen width.
		  int startx1 = size.width / 2;
		  System.out.println("starty = " + starty1 + " ,endy = " + endy + " , startx = " + startx1);

		  //Swipe from Bottom to Top.
		  driver.swipe(startx1, starty1, startx1, endy, 3000);
		  Thread.sleep(2000);
		  //Swipe from Top to Bottom.
		  driver.swipe(startx1, endy, startx1, starty1, 3000);
		  Thread.sleep(2000);
		  driver.quit();
		 }
		  
	}
	
	
	 
	