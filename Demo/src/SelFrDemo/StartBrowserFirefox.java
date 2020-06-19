package SelFrDemo;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StartBrowserFirefox implements Runnable {
static WebDriver driver ;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try{
			Thread.sleep(2000);
			}catch(Exception e)
			{System.out.println(e);}
			
			driver = new FirefoxDriver();
			
		/*			
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
			
			
			System.out.println("----------firefox ends-------------");
			StartBrowserFirefox.driver.close();
			ExtentHTML.Endtest();
			*/
		}
		
	}


