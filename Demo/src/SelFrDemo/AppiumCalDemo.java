package SelFrDemo;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumCalDemo {

	 static DesiredCapabilities capabilities;
		static WebDriver driver = null;
		DesiredCapabilities capabiledevice;
		           
		
		
		static String nodePath2 = "\"C:\\Program Files (x86)\\Appium\\node.exe\"";
		static String appiumJSPath2 = "\"C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js\"";
		static String versionapp2 = "--address 127.0.0.1 --port 4725 --platform-name Android --platform-version 23 --automation-name Appium --log-no-color";
		static String cmd2 = nodePath2 + " " + appiumJSPath2 + " " + versionapp2;
		static Process p2;
		
		public static void main(String[] args) throws IOException, InterruptedException {
			
		//	p2 = Runtime.getRuntime().exec(cmd2);
			capabilities = new DesiredCapabilities();
			
			
			
			
			capabilities.setCapability("deviceName", "Android");
			capabilities.setCapability("platformName","Android");
			capabilities.setCapability("udid","c3ab7ffd" );
			capabilities.setCapability("platformVersion", "7.0");

			
			
			/*
			capabilities.setCapability("deviceName", "Android Emulator");
			capabilities.setCapability("udid", "emulator-5554");

			capabilities.setCapability("platformVersion", "6.0");

			capabilities.setCapability("platformName", "Android");*/
			capabilities.setCapability("autoAcceptAlerts", true);

			capabilities.setCapability("noReset", "true");
			capabilities.setCapability("appPackage", "com.android.calculator2");

			capabilities.setCapability("appActivity",
					"com.android.calculator2.Calculator");
			
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		  // Click on DELETE/CLR button to clear result text box before running test.
	//	  driver.findElements(By.xpath("//android.widget.Button")).get(0).click();
		  driver.findElement(By.name("DELETE")).click();

		  // Click on number 2 button.
		  driver.findElement(By.name("2")).click();
		  Thread.sleep(2000);
		  

		  // Click on + button.
		  driver.findElement(By.name("+")).click();

		  // Click on number 5 button.
		  driver.findElement(By.name("8")).click();

		  // Click on = button.
		  driver.findElement(By.name("=")).click();

		  // Get result from result text box.
		  String result = driver.findElement(By.className("android.widget.EditText")).getText();
		  System.out.println("Number sum result is : " + result);

			driver.quit();
			
			
		}
	
	
	
}
