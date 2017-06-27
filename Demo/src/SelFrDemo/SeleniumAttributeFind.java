package SelFrDemo;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumAttributeFind {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// Connect to the Internet driver server and create an instance of
		// Internet explorer driver.
		// File file = new File("D:\\selenium\\IEDriverServer.exe");
		// System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		try {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e);
		}
		driver.navigate().to("https://google.com");
		// function to get names of all the links in the Page
		getALLNameforObject("link");
		// function to validate a particular object with particular text appears
		// in the Page
		ValidateObjectExists("link", "About");
		//
	}

	public static void getALLNameforObject(String strObject) {
		if (strObject.toLowerCase().trim().contentEquals("link")) {
			strObject = "a";
		}
		if (strObject.toLowerCase().trim().contentEquals("button")) {
			strObject = "button";
		}
		List<WebElement> elemLink = driver.findElements(By.tagName(strObject));
		int intLinksinPage = elemLink.size();
		System.out.println(intLinksinPage);
		for (int i = 0; i < intLinksinPage; i++) {
			System.out.println("The name of the link " + (i + 1)
					+ " in the page is :- "
					+ elemLink.get(i).getAttribute("text"));
		}
	}

	public static void ValidateObjectExists(String strObject, String ObjName) {
		if (strObject.toLowerCase().trim().contentEquals("link")) {
			strObject = "a";
		}
		if (strObject.toLowerCase().trim().contentEquals("button")) {
			strObject = "button";
		}
		List<WebElement> elemLink = driver.findElements(By.tagName(strObject));
		int intLinksinPage = elemLink.size();
		System.out.println(intLinksinPage);
		for (int i = 0; i < intLinksinPage; i++) {
			if (elemLink.get(i).getAttribute("text").contentEquals(ObjName)) {
				System.out.println("Link exists in Page with text "
						+ elemLink.get(i).getAttribute("text"));
			}
		}
	}
}
