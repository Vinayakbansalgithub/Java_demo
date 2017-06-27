package TestNg;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.ExpectedExceptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RetryAnalyzerImpl implements IRetryAnalyzer {
	private int retryCount = 0;
	private int maxRetryCount = 3;
	WebDriver driver;
	String baseURL = "https://www.linkedin.com/";

	@Override
	public boolean retry(ITestResult result) {
		if (retryCount < maxRetryCount) {
			retryCount++;
			return true;

		}

		return false;
	}

	@org.testng.annotations.BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1, retryAnalyzer = TestNGExampleTests.class, enabled = true, alwaysRun = true)
	public void verifyLoginPageText() {
		driver.navigate().to(baseURL);
		System.out.println("Verify login page test started");
		WebElement element = driver.findElement(By.cssSelector("h3.subtitle"));
		String headerText = element.getText();
		System.out.println(headerText);
		Assert.assertEquals(headerText, "Get started - it's free.");

	}

	@Test(priority = 2, retryAnalyzer = TestNGExampleTests.class)
	public void verifyForgotPasswordPage() {
		driver.navigate().to(baseURL);
		System.out.println("Verify Forgot password page test started");
		WebElement element = driver
				.findElement(By.linkText("Forgot password?"));
		element.click();
		WebElement pageTextElement = driver
				.findElement(By
						.cssSelector("div.flow-login-content fieldset.flow-fieldset h2.flow-h2"));
		String pageText = pageTextElement.getText();
		Assert.assertEquals(pageText, "Please enter your email or phone");
		// Assert.assertEquals(pageText, "Change your password") }}

	}

	@Test(timeOut = 2000)
	public void Timeout() throws InterruptedException {

		Thread.sleep(1000);
	}

	
	@Test
	@Parameters({"brand","model"})
	public void phoneBrand(String brand,String model)
	{
		System.out.println(brand +"   "+model);
	}	
	@AfterClass
	void close() {
		driver.close();
	}
}
