package SelFrDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IfreameDemo {
public static void main(String[] args) {
WebDriver driver = new FirefoxDriver();
	
	driver.get("http://toolsqa.com/selenium-webdriver/handling-iframes-using-selenium-webdriver/");
	System.out.println("egdrgr");
	
	JavascriptExecutor exe = (JavascriptExecutor) driver;
	Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
	
	
	List<WebElement> elements=driver.findElements(By.tagName("iframe"));
	System.out.println(elements.size());
}
}
