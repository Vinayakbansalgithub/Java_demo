package SelFrDemo;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.util.List;
import java.awt.AWTException;
import java.io.IOException;






// log backup with file rename
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Date;
import java.text.DateFormat;
import java.lang.reflect.Method;

public class GoldPoc {

	/*
	 *  All the static element defined here
	 */
	public static WebDriver driver = null;	
	public static Actions action = null;
	public static JavascriptExecutor js = null;	
	public static final String Sourceloc = System.getProperty("user.dir");
	static final Logger log = LogManager.getLogger("New Order");
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		String URL = "http://10.237.93.105/home/gold/jsp/partner.jsp";
		String product = "Business VPN Galerie";
		
		DOMConfigurator.configure(Sourceloc + "/Util/log4j.xml");
		// Clear logs
		PrintWriter writer = new PrintWriter(Sourceloc + "/logfile.log");
		writer.print("");
		writer.close();
		
		FirefoxDriver();
		//ChromeDriver();
//		IEDriver();
		/*
		 *  Browser Wait
		 */
		WebDriverWait manualWait = new WebDriverWait(driver, 10);  // For explicit wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	// For implicit wait
		action = new Actions(driver);
		js = (JavascriptExecutor)driver;
		/*
		 *  Launch URL
		 */
		try {
		driver.get(URL);		
		log.info("Environment : " + URL);
		}catch (Exception e){
			log.error("Server not accessible.");
			driver.quit();
		}
		Thread.sleep(3000);
		/*
		 *  Enter user name
		 */
		driver.findElement(By.cssSelector(".EquantLoginInput[name='UserName']")).sendKeys("jsingh6");
		
		/*
		 *  Enter password
		 */
		driver.findElement(By.cssSelector(".EquantLoginInput[name='Password']")).sendKeys("6eD.9zT~4b");
		
		/*
		 *  Click on Submit
		 */
		driver.findElement(By.xpath("//a/img[@class='butSubmit_image']")).click();
		
		log.info("Logged in successfully");
		
		/*
		 *  Close information window
		 */
		manualWait.until(ExpectedConditions.
				visibilityOfElementLocated(By.className("closeLink")));  // WebDriver will wait until close link is shown
		driver.findElement(By.className("closeLink")).click();
		
		/*
		 * Go to Orders tab
		 */
		driver.findElement(By.linkText("Orders")).click();
		
		/*
		 *  Scroll page
		 */
		js.executeScript("window.scrollBy(0,200)");
		
		/*
		 *  Click on Create Order
		 */
		driver.findElement(By.className("butCreateOrder_image")).click();
		driver.findElement(By.xpath("//div[@id='CreateOrderPopUp']//td[.='New']")).click();
		
		
		/*
		 * 
		 * Enter commercial information
		 * 
		 */

		//Select Customer
		driver.findElement(By
				.xpath("//*[@title='Select a Contracting Party']")).click();		
		Thread.sleep(1000);
		WindowSwitch();
		driver.findElement(By.id("nameValCustomer")).sendKeys("");					// Customer name
		driver.findElement(By.id("organizationIdValCustomer")).sendKeys("673542");		// Customer Number IC01
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.id("grid_row_1")).click();
		WindowSwitch();
//		String customerName = driver.findElement(By.xpath("//*[@id='contractingpartyDIV']/br[1]/preceding-sibling::text()")).toString();
//		log.info(customerName + " selected in Contracting Party");
		
		// Select Contract
		driver.findElement(By
				.xpath("//*[@title='Select a Contract']")).click();
		Thread.sleep(1000);
		WindowSwitch();
		driver.findElement(By.id("nameValContract")).sendKeys("");				// Contract ID
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.id("grid_row_1")).click();
		WindowSwitch();
		
		// Enter Order Term
		driver.findElement(By.id("orderTerm")).clear();
		driver.findElement(By.id("orderTerm")).sendKeys("5");
		driver.findElement(By
					.xpath("//td[@class='orderHeader' and contains(text(),'New order #')]/span"))
					.click();
		ifAlertAccept();
		
		/*
		 *  Select Customer Site Survey
		 *  	Values can be:
		 *  	1. no
		 *  	2. yes
		 */
		Select customerSiteSurvey = new Select (driver.findElement(By.id("customerSiteSurvey")));
		customerSiteSurvey.selectByValue("no");							// Put the value in double quotes

		
		/*
		 *  Select Customer Requested Early Delivery
		 *  	Values can be:
		 *  	1. no
		 *  	2. yes
		 */
		Select customerRequestedEarlyDelivery = new Select (driver.findElement(By.id("customerRequestedEarlyDelivery")));
		customerRequestedEarlyDelivery.selectByValue("no");				// Put the value in double quotes

		/*
		 *  Select Non QUOTO Order Reason
		 *  	Values can be:
		 *  	1. New logo opportunity (more than 15 sites)
		 *  	2. Customer exception
		 *  	3. Requested via QUOTO
		 *  	4. Bulk price change order
		 *  	5. BAN changes
		 *  	6. Full contract renewal
		 *  	7. Internal order with no price impact
		 *  	8. SITA customer
		 */
		Select NonQUOTOOrderReason = new Select (driver.findElement(By.id("NonQUOTOOrderReason")));
		NonQUOTOOrderReason.selectByValue("Customer exception");		// Put the value in double quotes
		
		
		// Select Billing Profile
		driver.findElement(By
				.xpath("//*[@title='Select a Billing Profile']")).click();
		Thread.sleep(1000);
		WindowSwitch();
		driver.findElement(By.id("grid_row_1")).click();
		WindowSwitch();
		
		/*
		// Select Customer division
		driver.findElement(By
				.xpath("//*[@title='Customer Division']")).click();
		Thread.sleep(1000);
		WindowSwitch();
		driver.findElement(By.id("grid_row_1")).click();
		WindowSwitch();
		*/
		/*
		 * Save the order
		 */
		driver.findElement(By.xpath("//*[@class='butSave']")).click();
		ifAlertAccept();
		
		manualWait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By
						.xpath("//*[@title='Select Lead Time Basis']")));
		
		if ( isAlertPresent() ){
			driver.switchTo().alert().accept();
		}
		
		// Capture order number generated
		String orderRef = driver.findElement(By
					.xpath("//td[@class='orderHeader' and contains(text(),'New order #')]/span")).getText();
		
		
		
		
	}
	
	public static void ifAlertAccept(){
		
		try{
			driver.switchTo().alert().accept();
		}
		catch (NoAlertPresentException Ex) {}
	}
	
	public static boolean isAlertPresent() 
	{ 
	    try 
	    { 
	        driver.switchTo().alert(); 
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	}   // isAlertPresent()
	
	public static void FirefoxDriver(){
		
		
		System.setProperty("webdriver.chrome.driver",
				"D:\\workspace\\Puresoftware_Automation\\Automation\\Automation_Framework_Puresoftware\\driver\\chromedriver.exe");
         driver = new ChromeDriver();  
		
		/*System.setProperty("webdriver.gecko.driver",
				"D:/Vinayak/workspace/asdasd/Driver/geckodriver.exe");
         driver = new FirefoxDriver();  
		*/
		System.out.println("Firefox driver Initiated.");
	}
	
	@SuppressWarnings("deprecation")
	public static void ChromeDriver(){
		DesiredCapabilities chromeCapabilities = DesiredCapabilities.chrome();
		chromeCapabilities.setCapability(
				CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,
				true);
		System.setProperty("webdriver.chrome.driver",Sourceloc + "/Drivers/chromedriver.exe");		
		driver = new ChromeDriver(chromeCapabilities);
		driver.manage().window().maximize();
		log.info("Chrome driver Initiated.");
	}
	
	@SuppressWarnings("deprecation")
	public static void IEDriver() {
		DesiredCapabilities ieCapabilities = DesiredCapabilities
				.internetExplorer();
		// -- Below lines only #####
		ieCapabilities.setCapability("nativeEvents", true);
		ieCapabilities.setCapability("unexpectedAlertBehaviour", "accept");
		ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
		ieCapabilities.setCapability("disable-popup-blocking", true);
		ieCapabilities.setCapability("enablePersistentHover", true);
		System.setProperty("webdriver.ie.driver" , Sourceloc + "/Drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver(ieCapabilities);
		driver.manage().window().maximize();
		log.info("Internet Explorer driver Initiated.");
	}
	
	public static boolean isElementPresent (By element){
		try{
			driver.findElement(element);
			return true;
		} catch (NoSuchElementException e){
			return false;
		}
	}
	
	public static void AddToTeam(){
		
		driver.findElement(By.xpath(".//table[@id='LeftNavBar']//tr[.='Teams']")).click();
		driver.findElement(By.className("butManageTeams")).click();
		if (isAlertPresent()){
			driver.switchTo().alert().accept();
		}
		
		/*
		 *  Sales Team
		 */
		
		// Same as customer Checked/unchecked
		if ( driver.findElement(By.id("TeamControlSales_Inherit")).isSelected() ){
			driver.findElement(By.id("TeamControlSales_Inherit")).click();
		}
		driver.findElement(By.id("TeamControlSales_add")).click();
		WindowSwitch();
		driver.findElement(By.id("firstNameValUser")).sendKeys("nitin");
		driver.findElement(By.id("lastNameValUser")).sendKeys("loomba");
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.id("grid_row_1")).click();
		WindowSwitch();
		
		/*
		 *  Technical Team
		 */
		
		// Same as customer Checked/unchecked
		if ( driver.findElement(By.id("TeamControlTechSup_Inherit")).isSelected() ){
			driver.findElement(By.id("TeamControlTechSup_Inherit")).click();
		}
		driver.findElement(By.id("TeamControlTechSup_add")).click();
		WindowSwitch();
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.id("grid_row_1")).click();
		WindowSwitch();
		// Team is locked Checked/Unchecked
		if ( !driver.findElement(By.id("TeamControlTechSup_Locked")).isSelected() ){
			driver.findElement(By.id("TeamControlTechSup_Locked")).click();
		}
		
		/*
		 *  Delivery Order Owner Team
		 */
		
		if ( driver.findElement(By.id("TeamControlDelOrdOwner_Inherit")).isSelected() ){
			driver.findElement(By.id("TeamControlDelOrdOwner_Inherit")).click();
		}
		driver.findElement(By.id("TeamControlDelOrdOwner_add")).click();
		WindowSwitch();
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.id("grid_row_1")).click();
		WindowSwitch();
		// Team is locked Checked/Unchecked
		if ( !driver.findElement(By.id("TeamControlDelOrdOwner_Locked")).isSelected() ){
			driver.findElement(By.id("TeamControlDelOrdOwner_Locked")).click();
		}
		
		/*
		 *  Delivery Order Coordinator Teams
		 */
		
		if ( driver.findElement(By.id("TeamControlDelOrdCoord_Inherit")).isSelected() ){
			driver.findElement(By.id("TeamControlDelOrdCoord_Inherit")).click();
		}
		driver.findElement(By.id("TeamControlDelOrdCoord_add")).click();
		WindowSwitch();
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.id("grid_row_1")).click();
		WindowSwitch();
		// Team is locked Checked/Unchecked
		if ( !driver.findElement(By.id("TeamControlDelOrdCoord_Locked")).isSelected() ){
			driver.findElement(By.id("TeamControlDelOrdCoord_Locked")).click();
		}
		
		/*
		 *  Billing Teams
		 */
		
		if ( isElementPresent(By.id("TeamControlBilling_Inherit")) ){
			driver.findElement(By.id("TeamControlBilling_Inherit")).click();
		}
		driver.findElement(By.id("TeamControlBilling_add")).click();
		WindowSwitch();
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.id("grid_row_1")).click();
		WindowSwitch();
		// Team is locked Checked/Unchecked
		if ( !driver.findElement(By.id("TeamControlBilling_Locked")).isSelected() ){
			driver.findElement(By.id("TeamControlBilling_Locked")).click();
		}
		
		/*
		 *  Legal Team
		 */
			
		if ( driver.findElement(By.id("TeamControlLegal_Inherit")).isSelected() ){
			driver.findElement(By.id("TeamControlLegal_Inherit")).click();
		}
		driver.findElement(By.id("TeamControlLegal_add")).click();
		WindowSwitch();
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.id("grid_row_1")).click();
		WindowSwitch();
		
		/*
		 *  Disconnect Administrator Team
		 */
		
		if ( driver.findElement(By.id("TeamControlDisconnectAdmin_Inherit")).isSelected() ){
			driver.findElement(By.id("TeamControlDisconnectAdmin_Inherit")).click();
		}
		driver.findElement(By.id("TeamControlDisconnectAdmin_add")).click();
		WindowSwitch();
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.id("grid_row_1")).click();
		WindowSwitch();
		// Team is locked Checked/Unchecked
		if ( !driver.findElement(By.id("TeamControlDisconnectAdmin_Locked")).isSelected() ){
			driver.findElement(By.id("TeamControlDisconnectAdmin_Locked")).click();
		}
		
		/*
		 *  DTVS Team
		 */
		
		if ( driver.findElement(By.id("TeamControlDTVS_Inherit")).isSelected() ){
			driver.findElement(By.id("TeamControlDTVS_Inherit")).click();
		}
		driver.findElement(By.id("TeamControlDTVS_add")).click();
		WindowSwitch();
		driver.findElement(By.id("searchButton")).click();
		driver.findElement(By.id("grid_row_1")).click();
		WindowSwitch();
		// Team is locked Checked/Unchecked
		if ( !driver.findElement(By.id("TeamControlDTVS_Locked")).isSelected() ){
			driver.findElement(By.id("TeamControlDTVS_Locked")).click();
		}
		
		/*
		 *  Save teams
		 */
		
		driver.findElement(By.className("butSaveTeams")).click();
	}
	
	public static void WindowSwitch(){
		for ( String winHandle : driver.getWindowHandles() ){
			driver.switchTo().window(winHandle);
		}
	}
	
	public static void displayMessage() {
		By passMessage = By.xpath("//table[@id='LeftErrorBar']//tr[@class='normal']/td[./img[@class='alertGreen']]");
		By failMessage = By.xpath("//table[@id='LeftErrorBar']//tr[@class='normal']/td[./img[@class='alertRed_image']]");
		try {
			for ( WebElement messageElements : driver.findElements(passMessage) ){
				log.info(" > " + messageElements.getText());
			}
		} catch (NoSuchElementException Ne) {}
		try {
			for ( WebElement messageElements : driver.findElements(failMessage) ){
				log.info(" > " + messageElements.getText());
			}
		} catch (NoSuchElementException Ne) {}
	}
	
}