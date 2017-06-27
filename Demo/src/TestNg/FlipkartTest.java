package TestNg;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Function;

public class FlipkartTest {
	
	static WebDriver driver;
	String baseURL = "https://www.flipkart.com/";
	static WebElement element;
	SoftAssert s_assert = new SoftAssert();
	 static Logger Log = Logger.getLogger(FlipkartTest.class.getName());

	
	
	public static void ajaxWaitandJquery() throws InterruptedException {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		if ((Boolean) executor
				.executeScript("return window.jQuery != undefined")) {
			while (!(Boolean) executor
					.executeScript("return jQuery.active == 0")) {
				Thread.sleep(2000);
			}
		}
		return;
	}

	public void waitForElemet(WebDriver driver, WebElement element) {

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)

		.withTimeout(60, TimeUnit.SECONDS)

		.pollingEvery(2, TimeUnit.SECONDS)

		.ignoring(NoSuchElementException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return element;
			}
		});
	}

	@BeforeTest
	public void openURL() throws InterruptedException  {
		
		String path = System.getProperty("user.dir");
		String Folder = path + "\\src\\Log4j.xml";
		DOMConfigurator.configure(Folder);
		FirefoxProfile profile = new FirefoxProfile();
		profile.setAcceptUntrustedCertificates(true);
		profile.setAssumeUntrustedCertificateIssuer(false);

		driver = new FirefoxDriver(profile);
		driver.navigate().to(baseURL);
		driver.manage().window().maximize();
		ajaxWaitandJquery();
		Log.info("New firefox driver instantiated");
		Reporter.log("Application Lauched successfully | ");

	}

	@Test(priority='0')
	public void SerachLaptop() throws InterruptedException {
		element = driver
				.findElement(By
						.xpath("//input[@title='Search for Products, Brands and More']"));
		element.click();
		element.sendKeys("laptop");
		Thread.sleep(1000);
		element.click();
		Thread.sleep(1000);

		element = driver.findElement(By.xpath("//form/ul/li[1]/div/a"));
		element.click();
		waitForElemet(driver, element);
		ajaxWaitandJquery();
		Log.info("laptop search");
		Reporter.log("laptop searched successfully | ");


	}

	@Test( dependsOnMethods="SerachLaptop")
	public void sortByPopularity() throws InterruptedException {
		element = driver
				.findElement(By
						.xpath(".//*[@id='container']/div/header/div[1]/div[2]/div/div/div[1]/a/img"));
		new Actions(driver).moveToElement(element).perform();
		element = driver.findElement(By
				.xpath("//div/section/ul/li[text()='Popularity']"));
		element.click();
		waitForElemet(driver, element);
		Log.info("sort by Popularity");
		Reporter.log("sort by Popularity ");

	}

	@Test(dependsOnMethods="sortByPopularity")
	public void laptopDetails() throws InterruptedException {
		ajaxWaitandJquery();

		element = driver.findElement(By
				.xpath("(//a/div[2]/div/div[@class='_3wU53n'])[1]"));
		element.click();
		ajaxWaitandJquery();
		element = driver.findElement(By.xpath("//h1"));
		String headingText = element.getText();

		// these are some of the generic verification further verification points can be added
		
		s_assert.assertTrue(headingText.contains("GB")
				|| headingText.contains("TB"));
		s_assert.assertTrue(headingText.contains("inch"), "text found");
		s_assert.assertTrue(headingText.contains("kg"), "text found");
		s_assert.assertTrue(headingText.contains("Laptop")
				|| headingText.contains("Notebook")
				|| headingText.contains("Netbook"));
		s_assert.assertTrue(headingText.contains("5th Gen")
				|| headingText.contains("6th Gen")
				|| headingText.contains("7th Gen")
				|| headingText.contains("4th Gen"));
		element = driver.findElement(By
				.xpath("//span[contains(@id,'productRating')]"));
		s_assert.assertNotNull(element);
		element = driver.findElement(By
				.xpath("//span/span/span[contains(text(),'Ratings')]"));
		s_assert.assertNotNull(element);
		element = driver.findElement(By
				.xpath("//span/span/span[contains(text(),'Reviews')]"));
		s_assert.assertNotNull(element);
		element = driver.findElement(By
				.xpath("(//div/div/div[contains(text(),'₹')])[1]"));
		s_assert.assertNotNull(element);

		s_assert.assertAll();
		Log.info("basic verifications");
		Reporter.log("verification done by Popularity ");

	}
	
	@AfterSuite
	public void tearDown(){
		driver.close();
		}
	

}
