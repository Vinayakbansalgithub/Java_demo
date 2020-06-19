package SelFrDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver",
				"D:/Vinayak/workspace/asdasd/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();              
        driver.get("http://www.test.com");

    }
}
