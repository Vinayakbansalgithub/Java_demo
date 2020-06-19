package SelFrDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

//class MyThread1 implements Runnable {
//	
//	public void run() {
//		try{
//		Thread.sleep(1000);
//		}catch(Exception e)
//		{ Thread.currentThread().interrupt();}
//		WebDriver driver = null;
//		driver = new FirefoxDriver();
//		driver.get("http://toolsqa.com/automation-practice-form/");
//				
//	//	driver.manage().window().setSize(new Dimension(685, 720));
//		Multiplescripts.Action(driver);
//		System.out.println("----------firefox ends-------------");
//	}
//}

class MyThread2 implements Runnable {
	public void run() {
		
		
		
		
		/*Dimension windowSize = driver.manage().window().getSize();
		int targetWidth = (int) (windowSize.width / 2); // Half the screen
															// width
		driver.manage().window().setPosition(new Point(targetWidth, 0)); // Right
																			// side
																			// of
																			// screen
		Multiplescripts.Action(driver);
		System.out.println("----------chrome ends-------------");*/

	}
}

public class Multiplescripts {

	/*public static void Action(WebDriver driver) {

		Select continent = new Select(driver.findElement(By.name("continents")));

		continent.selectByIndex(1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		continent.selectByVisibleText("Africa");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		List<WebElement> continentdesc = continent.getOptions();
		int ilistsize = continentdesc.size();

		for (int i = 0; i < ilistsize; i++) {
			String svalue = continent.getOptions().get(i).getText();
			
			System.out.println(svalue);

			if (svalue.equals("Africa")) {
				driver.manage().window().maximize();
				continent.selectByIndex(i);

			}

		}

		driver.quit();
	}*/

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver",
				"D:/workspace/Puresoftware_Automation/Automation/Automation_Framework_Puresoftware/driver/chromedriver.exe");
		
		
		
		
		driver = new ChromeDriver();


		//*[@id='search']/input
		
		
		//driver.get("http://toolsqa.com/automation-practice-form/");
		driver.get("https://www.w3schools.com/");
	WebElement ee=	driver.findElement(By.xpath("html/body/div[5]/div/a[1]/i"));
	
	
	
		ee.click();	
		WebElement eee=	driver.findElement(By.xpath(".//*[@id='___gcse_0']/div/div/form/table[1]/tbody/tr/td[1]"));

		eee.click();
		
		
		eee.sendKeys("selenium");
		
		
		System.out.println("---------------------");
		
		
	//	MyThread1 m1 = new MyThread1();
		MyThread2 m2 = new MyThread2();
	//	Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
//		t1.start();
		//t1.interrupt();
		t2.start();

	}
}
