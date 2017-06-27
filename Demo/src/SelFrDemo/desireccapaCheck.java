package SelFrDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class desireccapaCheck {
public static void main(String[] args) throws MalformedURLException {
	 DesiredCapabilities capabilities;
		WebDriver driver = null;

	
			System.out.println("driver 1 capabilities set here");

			capabilities = new DesiredCapabilities();
			capabilities.setCapability("deviceName", "Android Emulator");

			capabilities.setCapability("platformVersion", "6.0");

			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("autoAcceptAlerts", true);

			capabilities.setCapability("noReset", "true");
			capabilities.setCapability("appPackage", "com.android.calculator2");

			capabilities.setCapability("appActivity",
					"com.android.calculator2.Calculator");
			
		driver=	new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
					
}
}
