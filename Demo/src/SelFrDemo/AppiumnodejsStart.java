package SelFrDemo;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumnodejsStart {
	
	static AndroidDriver driver;
	static Process p;
	static String cmd;
	
	
	public void setUp() throws Exception {
		  // Stop appium server If It Is already running.
		  appiumStop();
		  // Start appium server.
		  appiumStart();
		  DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "Android Emulator");

			// Set browserName desired capability. It's Android in our case
			// here.
			capabilities.setCapability("browserName", "Android");

			// Set android platformVersion desired capability. Set your
			// emulator's android version.
			capabilities.setCapability("platformVersion", "6.0");

			// Set android platformName desired capability. It's Android in our
			// case here.
			capabilities.setCapability("platformName", "Android");
		 
		  driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 }
	
	
	
	 // This method Is responsible for starting appium server.
	 public void appiumStart() throws IOException, InterruptedException {
	  // Execute command string to start appium server.
	  p = Runtime.getRuntime().exec(cmd);
	  // Provide wait time of 10 mins to start appium server properly.
	  // If face any error(Could not start a new session...) then Increase
	  // this time to 15 or 20 mins.
	  Thread.sleep(10000);
	  if (p != null) {
	   System.out.println("Appium server Is started now.");
	  }
	 }

	 
	 

	 // This method Is responsible for stopping appium server.
	 public void appiumStop() throws IOException {
	  if (p != null) {
	   p.destroy();
	  }
	  System.out.println("Appium server Is stopped now.");
	 }
	 
	 
	 public void End() throws IOException {
		  driver.quit();
		  // Stop appium server when test Is ended.
		  appiumStop();
	}
	

public static void main(String[] args) throws Exception {
	AppiumnodejsStart appobj= new AppiumnodejsStart();

	 String nodePath = "\"C:\\Program Files (x86)\\Appium\\node.exe\"";
	 
	 // Set path of your appium.js file.
	 String appiumJSPath = "\"C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js\"";
	  cmd = nodePath + " " + appiumJSPath;
//appobj.setUp();

appobj.appiumStart();
appobj.appiumStop();

	appobj.End();

	
}
}