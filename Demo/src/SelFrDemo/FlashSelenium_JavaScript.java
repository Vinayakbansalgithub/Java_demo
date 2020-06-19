package SelFrDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

 class FlashSelenium_JavaScript {
	
	private final WebDriver webDriver;
	 private final String flashObjectId;
	 
	public FlashSelenium_JavaScript(final WebDriver webDriver, final String flashObjectId) {
	 this.webDriver = webDriver;
	 this.flashObjectId = flashObjectId;
	 }
	public String callFlashObject(final String functionName, final String... args) {
		 final Object result =
		 ((JavascriptExecutor)webDriver).executeScript(
		 makeJsFunction(functionName, args),
		 new Object[0]);
		 
		return result != null ? result.toString() : null;
		 }
	private String makeJsFunction(final String functionName, final String... args) {
		 final StringBuffer functionArgs = new StringBuffer();
		 
		if (args.length > 0) {
		 for (int i = 0; i < args.length; i++) {
		 if (i > 0) {
		 functionArgs.append(",");
		 }
		 functionArgs.append(String.format("'%1$s'", args[i]));
		 }
		 }
		 return String.format(
		 "return document.%1$s.%2$s(%3$s);",
		 flashObjectId,
		 functionName,
		 functionArgs);
		 }
		 
		
	
	
	public static void main(String[] args) throws InterruptedException {
		 FirefoxDriver driver = new FirefoxDriver();
		 
		 driver.get("http://www.permadi.com/tutorial/flashjscommand/");
		 driver.manage().window().maximize();
		 FlashSelenium_JavaScript flashApp = new FlashSelenium_JavaScript(driver, "myFlashMovie");
		 flashApp.callFlashObject("Play"); // first number
		 Thread.sleep(3000L);
		 flashApp.callFlashObject("StopPlay"); // operation
		 
		Thread.sleep(3000L);
		 flashApp.callFlashObject("Rewind");
		 System.out.println(flashApp.callFlashObject("GetVariable","/:message"));
		 flashApp.callFlashObject("SetVariable","/:message","Learn Flash testing with Webdriver");
		 System.out.println(flashApp.callFlashObject("GetVariable","/:message"));
		 
		 }
		 
		
		
}
