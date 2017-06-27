package TestNg;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import SelAppAutoTest.LogSupport;

public class Reporters {
	private static WebDriver driver;
	static String baseURL = "https://www.linkedin.com/";
	private static Logger Log = Logger.getLogger(Reporters.class.getName());

	@Test
	public static void test() {

		DOMConfigurator
				.configure("D:\\Vinayak\\workspace\\Demo\\src\\Log4j.xml");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Log.info("New driver instantiated");
		Log.info("Browser closed");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LogSupport.INFOPass("open url");

		driver.get(baseURL);

		Log.info("Web application launched");

		// Our first step is complete, so we produce a main event log here for
		// our reports.

		Reporter.log("Application Lauched successfully | ");

		System.out.println("Verify login page test started");
		WebElement element = driver.findElement(By.cssSelector("h3.subtitle"));
		String headerText = element.getText();
		System.out.println(headerText);
		Assert.assertEquals(headerText, "Get started - it's free.");
		LogSupport.INFOPass("header has been verifed");

		Reporter.log("header verified");

		System.out.println("Verify Forgot password page test started");
		WebElement element2 = driver.findElement(By
				.linkText("Forgot password?"));
		element2.click();
		WebElement pageTextElement = driver
				.findElement(By
						.cssSelector("div.flow-login-content fieldset.flow-fieldset h2.flow-h2"));
		String pageText = pageTextElement.getText();
		Assert.assertEquals(pageText, "Please enter your email or phone");
		LogSupport.INFOPass("next page");

		Reporter.log("next page ");

	}
}
