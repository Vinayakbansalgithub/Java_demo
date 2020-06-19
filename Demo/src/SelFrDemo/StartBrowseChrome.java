/*package SelFrDemo;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StartBrowseChrome implements Runnable {

static	WebDriver driver;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		ExtentHTML.starttest();
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,true);
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Demo\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-extensions");
		capabilities.setCapability(ChromeOptions.CAPABILITY,
				options);
		driver = new ChromeDriver(capabilities);
		driver.manage().window().maximize();
		
		try {
			BuildObjrep.runTestCase(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("----------Chrome ends-------------");
		StartBrowseChrome.driver.close();
		ExtentHTML.Endtest();
	}

}
*/