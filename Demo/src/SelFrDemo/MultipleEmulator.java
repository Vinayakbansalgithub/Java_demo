package SelFrDemo;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MultipleEmulator {


	 WebDriver driver = null;
	 WebDriver driver2 = null;
	    int timeOut=180;
	    int port=-1;
	
	
	

	    MultipleEmulator(int port){
	        this.port=port;
	    }

	    public void testEmulator(int p) throws Exception {
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");
	        capabilities.setCapability(CapabilityType.VERSION, "4.3");
	        capabilities.setCapability(CapabilityType.PLATFORM, "Windows");

	        capabilities.setCapability("udid","emulator-"+p);

	        capabilities.setCapability("app-package", "your.app.pkg");
	        capabilities.setCapability("app-activity",
	            "your.app.pkg.Activity");
	        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
					capabilities);
	        
	        driver2 = new AndroidDriver(new URL("http://127.0.0.1:4476/wd/hub"),
					capabilities);
	        
	     
	        
	        driver.manage().timeouts().implicitlyWait(timeOut, TimeUnit.SECONDS);
	        Thread.sleep(50000);
	    }

	    public void tearDown() {
	        if (driver != null)
	            driver.quit();
	    }

	    public void runTest() {
	        try {
	            testEmulator(5554);     // for emulator on port 5554
	            tearDown();
	            testEmulator(5556);     // for emulator on port 5556
	            tearDown();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }

	    public static void main(String[] args) {
	        new MultipleEmulator(4723).runTest();       // appium server port 4723
	    }
	
	
	
	
	
	
	
	
	
	
	
}
