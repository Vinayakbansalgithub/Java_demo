package SelFrDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {
public static void main(String[] args) throws FindFailed, Exception {
WebDriver driver = new FirefoxDriver();
	
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	
	Screen screen= new Screen();
	Thread.sleep(1000);
	Pattern pattern= new Pattern("D:\\doodle.png");
	screen.wait(pattern,100);
	System.out.println("before click");
	screen.find(pattern);
	screen.click();
//	Match bool=screen.findText("google");
	//System.out.println("google search"+bool);
	System.out.println("done");
}
}
