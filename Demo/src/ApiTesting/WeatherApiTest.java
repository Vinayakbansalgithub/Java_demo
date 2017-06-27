package ApiTesting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.apache.http.client.ClientProtocolException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WeatherApiTest {
	private WebDriver driver;
	private String baseUrl;
	
	public void setUp() throws Exception {
		  driver = new FirefoxDriver();
		    baseUrl = "http://openweathermap.org/current";
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  }
	

	public void tearDown() throws Exception {
		 driver.close();
		 driver.quit();
	}

	@SuppressWarnings("deprecation")
	public void test() throws ClientProtocolException, IOException {
		driver.get(baseUrl);
		driver.navigate().to("http://api.openweathermap.org/data/2.5/weather?q=London");	
	 WebElement webElement=driver.findElement(By.tagName("pre"));
	 WeatherApiResponse weatherApiResponse=new WeatherApiResponse();
	 String ExpectedString=weatherApiResponse.GetResponse();
	 Assert.assertTrue(webElement.getText().equals(ExpectedString));
	 
	}
	
	public static void main(String[] args) throws Exception {
		WeatherApiTest reqobj= new WeatherApiTest();
		reqobj.setUp();
		reqobj.test();
		reqobj.tearDown();
		System.out.println("=========finish===========");
	}

}
