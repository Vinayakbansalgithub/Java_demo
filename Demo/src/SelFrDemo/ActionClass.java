/*package SelFrDemo;

import java.awt.AWTException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.gargoylesoftware.htmlunit.javascript.host.media.rtc.webkitRTCPeerConnection;

//import atu.testrecorder.ATUTestRecorder;
//import atu.testrecorder.exceptions.ATUTestRecorderException;

class LowBatteryException extends Exception {
	LowBatteryException(String s) {
		super(s);
	}
}

class NoDeviceFoundException extends Exception {
	NoDeviceFoundException(String s) {
		super(s);
	}
}

public class ActionClass {
	// static WebDriver driver = CapabilitiesDevice.driver;

	static WebDriver driver = null;

	// static ATUTestRecorder recorder;
	static DateFormat dateFormat;

	static String msg = "";

	static String from, to, wbFrom, wbTo;
	static int devicecount = 0;

	public static boolean suitrunner = true;
	static DesiredCapabilities capabilities;
	static String nodePath = "\"C:\\Program Files (x86)\\Appium\\node.exe\"";
	static String appiumJSPath = "\"C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js\"";
	static String versionapp = "--address 127.0.0.1 --port 4723 --platform-name Android --platform-version 23 --automation-name Appium --log-no-color";
	static String cmd = nodePath + " " + appiumJSPath + " " + versionapp;
	static Process p;

	
	 * static String nodePath2 =
	 * "\"C:\\Program Files (x86)\\Appium\\node.exe\""; static String
	 * appiumJSPath2 =
	 * "\"C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js\""
	 * ; static String versionapp2 =
	 * "--address 127.0.0.1 --port 4725 --platform-name Android --platform-version 23 --automation-name Appium --log-no-color"
	 * ; static String cmd2 = nodePath2 + " " + appiumJSPath2 + " " +
	 * versionapp2; static Process p2;
	 

	public static Screen screen;
	public static Pattern pattern;
	public static long startTime;
	public static long starttest;
	static String nullcheck;
	static boolean flag = true;

	static WebElement findPath(String string) {

		WebDriverWait wait = new WebDriverWait(driver, 10); // explicit wait

		if (string.equalsIgnoreCase("Xpath")) {
			return (wait
					.until(ExpectedConditions.presenceOfElementLocated(By
							.xpath((BuildObjrep.TestCaseHashmap
									.get("Elementlocation"))))));

			
			 * return driver.findElement(By.xpath(BuildObjrep.TestCaseHashmap
			 * .get("Elementlocation")));
			 
		}

		if (string.equalsIgnoreCase("ObjectRep")) {

			return (wait.until(ExpectedConditions.presenceOfElementLocated(By
					.xpath((BuildObjrep.objKeyValue
							.get(BuildObjrep.TestCaseHashmap
									.get("Elementlocation")))))));

			
			 * return driver.findElement(By.xpath(BuildObjrep.objKeyValue
			 * .get(BuildObjrep.TestCaseHashmap.get("Elementlocation"))));
			 

		}

		if (string.equalsIgnoreCase("name")) {
			return (wait
					.until(ExpectedConditions.presenceOfElementLocated(By
							.name((BuildObjrep.TestCaseHashmap
									.get("Elementlocation"))))));

			
			 * return driver.findElement(By.xpath(BuildObjrep.TestCaseHashmap
			 * .get("Elementlocation")));
			 
		}

		if (string.equalsIgnoreCase("className")) {
			return (wait.until(ExpectedConditions.presenceOfElementLocated(By
					.className((BuildObjrep.TestCaseHashmap
							.get("Elementlocation"))))));

			
			 * return driver.findElement(By.xpath(BuildObjrep.TestCaseHashmap
			 * .get("Elementlocation")));
			 
		}

		if (string.equalsIgnoreCase("id")) {
			return (wait.until(ExpectedConditions.presenceOfElementLocated(By
					.id((BuildObjrep.TestCaseHashmap.get("Elementlocation"))))));

			
			 * return driver.findElement(By.xpath(BuildObjrep.TestCaseHashmap
			 * .get("Elementlocation")));
			 
		}

		return null;

	}

	static WebElement findPathclick(String string, AndroidDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 10); // explicit wait

		if (string.equalsIgnoreCase("Xpath")) {
			return (wait
					.until(ExpectedConditions.presenceOfElementLocated(By
							.xpath((BuildObjrep.TestCaseHashmap
									.get("Elementlocation"))))));

			
			 * return driver.findElement(By.xpath(BuildObjrep.TestCaseHashmap
			 * .get("Elementlocation")));
			 
		}

		if (string.equalsIgnoreCase("ObjectRep")) {

			return (wait.until(ExpectedConditions.presenceOfElementLocated(By
					.xpath((BuildObjrep.objKeyValue
							.get(BuildObjrep.TestCaseHashmap
									.get("Elementlocation")))))));

			
			 * return driver.findElement(By.xpath(BuildObjrep.objKeyValue
			 * .get(BuildObjrep.TestCaseHashmap.get("Elementlocation"))));
			 

		}

		if (string.equalsIgnoreCase("name")) {
			return (wait
					.until(ExpectedConditions.presenceOfElementLocated(By
							.name((BuildObjrep.TestCaseHashmap
									.get("Elementlocation"))))));

			
			 * return driver.findElement(By.xpath(BuildObjrep.TestCaseHashmap
			 * .get("Elementlocation")));
			 
		}

		if (string.equalsIgnoreCase("className")) {
			return (wait.until(ExpectedConditions.presenceOfElementLocated(By
					.className((BuildObjrep.TestCaseHashmap
							.get("Elementlocation"))))));

			
			 * return driver.findElement(By.xpath(BuildObjrep.TestCaseHashmap
			 * .get("Elementlocation")));
			 
		}

		if (string.equalsIgnoreCase("id")) {
			return (wait.until(ExpectedConditions.presenceOfElementLocated(By
					.id((BuildObjrep.TestCaseHashmap.get("Elementlocation"))))));

			
			 * return driver.findElement(By.xpath(BuildObjrep.TestCaseHashmap
			 * .get("Elementlocation")));
			 
		}

		return null;

	}

	public static List<String> getAllElementText(List<WebElement> wb, int size) {
		List<String> PageList = new ArrayList<String>();
		for (WebElement eachwb : wb) {
			PageList.add(eachwb.getText());
		}

		return PageList;

	}

	static List<WebElement> findPaths(String string) {

		WebDriverWait wait = new WebDriverWait(driver, 10); // explicit wait

		if (string.equalsIgnoreCase("Xpath")) {

			return driver.findElements(By.xpath(BuildObjrep.TestCaseHashmap
					.get("Elementlocation")));

		}

		if (string.equalsIgnoreCase("ObjectRep")) {
			return driver.findElements(By.xpath(BuildObjrep.objKeyValue
					.get(BuildObjrep.TestCaseHashmap.get("Elementlocation"))));

		}

		return null;

	}

	public static void startAppium() throws IOException, InterruptedException {

		p = Runtime.getRuntime().exec(cmd);
		// System.out.println(p.get());
		// p2 = Runtime.getRuntime().exec(cmd2);

		System.out.println("process name is " + p);

		// System.out.println("process for the second session " + p2);

		Thread.sleep(10000);

		System.out.println("time ends here");
	}

	public static void BrowserUsed(String browser) throws IOException,
			NoDeviceFoundException, ClassNotFoundException,
			InvocationTargetException, NoSuchMethodException,
			SecurityException, IllegalAccessException,
			IllegalArgumentException, InterruptedException {

		if (browser.equalsIgnoreCase("firefox")) {
			ExtentHTML.starttest();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			BuildObjrep.runTestCase(driver);
		} else if (browser.equalsIgnoreCase("chrome")) {

			try {
				ExtentHTML.starttest();
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(CapabilityType.BROWSER_NAME,
						"chrome");
				capabilities
						.setCapability(
								CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION,
								true);

				System.setProperty("webdriver.chrome.driver",
						"D:\\Vinayak\\workspace\\asdasd\\Driverchromedriver.exe");

				ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-extensions");
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				driver = new ChromeDriver(capabilities);
				driver.manage().window().maximize();
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}

		}

		else if (browser.equalsIgnoreCase("Appium")) {

			// Created object of DesiredCapabilities class.
			capabilities = new DesiredCapabilities();

			// capabilities2 = new DesiredCapabilities();

			
			 * String devicecount_command = "adb devices";
			 * 
			 * Process p_device_exe =
			 * Runtime.getRuntime().exec(devicecount_command); //
			 * System.out.println("process name is " + p);
			 * 
			 * java.io.InputStream iscount = p_device_exe.getInputStream();
			 * java.io.BufferedReader readercount = new java.io.BufferedReader(
			 * new InputStreamReader(iscount)); readercount.readLine(); for (int
			 * i = 0; i < 5; ++i) {
			 * 
			 * String lineIWantcount = readercount.readLine();
			 * System.out.println(lineIWantcount); if(lineIWantcount==null) {
			 * devicecount++;
			 * 
			 * }
			 * 
			 * System.out.println(
			 * "total emulator or real devices connected to system "
			 * +devicecount_command );
			 * 
			 * 
			 * }
			 

			System.out.println("appium setup is running on the system");

			// Set android deviceName desired capability. Set it Android
			// Emulator.
			String developer_mode = "enable developer mode";
			String device_adb = "adb devices";
			Process p_device = Runtime.getRuntime().exec(device_adb);
			// System.out.println("process name is " + p);

			java.io.InputStream is = p_device.getInputStream();
			java.io.BufferedReader reader = new java.io.BufferedReader(
					new InputStreamReader(is));
			reader.readLine();
			for (int i = 0; i < 5; ++i) {

				String lineIWant = reader.readLine();
				if (lineIWant == null) {
					break;
				}

				if (flag == true) {
					nullcheck = lineIWant;
					flag = false;
				}

				if (nullcheck.equals(null) || nullcheck.equals("")) {
					// System.out.println("No device or emulator is available");
					throw new NoDeviceFoundException(
							"No device or emulator is available");

				}

				if (lineIWant.contains("emulator") && !lineIWant.isEmpty()) {
					capabilities
							.setCapability("deviceName", "Android Emulator");
					// break;

				} else if (!lineIWant.contains("emulator")
						&& !lineIWant.isEmpty()) {
					String[] str = lineIWant.split("\\s+");

					// lineIWant.split("\\d+");
					System.out.println("device name is " + str[0]);
					// capabilities.setCapability("deviceName", str[0]);

					// capabilities2.setCapability("deviceName",
					// "AQ4501_sprout");
					capabilities.setCapability("udid", str[0]);

					// capabilities2.setCapability("deviceName", str[0]);
					break;
				}

			}

			String device_version = "adb shell getprop ro.build.version.release";
			Process p_version = Runtime.getRuntime().exec(device_version);
			// System.out.println("process name is " + p);
			BufferedReader errinput = new BufferedReader(new InputStreamReader(
					p_version.getErrorStream()));

			String errormsg = errinput.readLine();
			System.out.println("error message is " + errormsg);
			java.io.InputStream isV = p_version.getInputStream();
			java.io.BufferedReader version = new java.io.BufferedReader(
					new InputStreamReader(isV));
			String versionvalue = version.readLine();

			if (errormsg == null) {
				errormsg = "only one device connected";
				System.out.println("version for the defined device is "
						+ versionvalue);
			}

			if (!(errormsg.contains("only one device connected"))) {

				capabilities.setCapability("deviceName", "Android Emulator");
				capabilities.setCapability("udid", "emulator-5554");

				// capabilities.setCapability("platformVersion", "6.0");

			}
			if (!(versionvalue == null))
				if (versionvalue.contains(".")) {
					// capabilities.setCapability("platformVersion",
					// versionvalue);

					capabilities.setCapability("platformVersion", versionvalue);

				}

			// Set browserName desired capability. It's Android in our case
			// here.
			// capabilities.setCapability("browserName",
			// "MobileBrowserType.BROWSER");
			// capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

			// Set android platformVersion desired capability. Set your
			// emulator's android version.
			// capabilities.setCapability("platformVersion", "6.0");

			// Set android platformName desired capability. It's Android in our
			// case here.
			// capabilities2.setCapability("platformVersion", "6.0.1");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("autoAcceptAlerts", true);
			capabilities.setCapability("autoAcceptAlerts", true);
			capabilities.setCapability("deviceName", "Android");

			capabilities.setCapability("noReset", "true"); 
			
			
			// calling package activity class
			PackageActivityClass.findPackageActivityfun();
			
			
		//	CapabilitiesDevice.findPackageActivity();
			
			
			capabilities.setCapability("appPackage",
					BuildObjrep.PackageActivityMap.get("Package"));

			capabilities.setCapability("appActivity",
					BuildObjrep.PackageActivityMap.get("Activity"));

			try {
				driver = new AndroidDriver(new URL(
						"http://127.0.0.1:4723/wd/hub"), capabilities);

				System.out.println("driver capabilities has been set: "
						+ driver);
			} catch (SecurityException | IllegalArgumentException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			BuildObjrep.runTestCase(driver);
			

		}
	}

	public static void OpenURL() throws InterruptedException, IOException {

		// Get current date and time to provide in recorded video name.
		Date date = new Date();

		startTime = System.currentTimeMillis();
		starttest = TimeUnit.MILLISECONDS.toSeconds(startTime);
		System.out.println("test case start at  " + starttest);
		// Created object of ATUTestRecorder.
		// Provide path to store videos and file name format.
		
		 * recorder = new ATUTestRecorder("D:/ScriptVideos/", "TestVideo-" +
		 * dateFormat.format(date), false);
		 

		
		 * recorder = new ATUTestRecorder("D:/ScriptVideos/",
		 * "TestVideo-appium record", false);
		 * 
		 * recorder.start();
		 
		String browserName = BuildObjrep.TestSuitHashmap.get("Browser");

		if (BuildObjrep.browser.equalsIgnoreCase("chrome")
				|| BuildObjrep.browser.equalsIgnoreCase("Firefox")) {
			ExtentHTML.starttest();
			driver.get(BuildObjrep.objKeyValue.get(BuildObjrep.TestCaseHashmap
					.get("Elementlocation")));
			msg = "opening url :   "
					+ BuildObjrep.objKeyValue.get(BuildObjrep.TestCaseHashmap
							.get("Elementlocation"));
			LogSupport.INFOPass(msg);
			ExtentHTML.pass(msg);
		}
		if (BuildObjrep.browser.equalsIgnoreCase("Appium")) {

			
			 * String packagename =
			 * BuildObjrep.PackageActivityMap.get("Package");
			 * System.out.println("package name of current app is "+packagename
			 * ); String
			 * currentapplicationpackage="adb shell am force-stop "+" "+
			 * packagename;
			 * 
			 * Process currentprocess=
			 * Runtime.getRuntime().exec(currentapplicationpackage);
			 

			ExtentHTML.starttest();

			
			 * capabilities.setCapability("noReset", "true");
			 * capabilities.setCapability("appPackage",
			 * BuildObjrep.PackageActivityMap.get("Package"));
			 * 
			 * capabilities2.setCapability("noReset", "true");
			 * capabilities2.setCapability("appPackage",
			 * BuildObjrep.PackageActivityMap.get("Package"));
			 * 
			 * // Set android appActivity desired capability. It is //
			 * com.android.calculator2.Calculator for calculator application. //
			 * Set your application's appPackage if you are using any other app.
			 * 
			 * capabilities.setCapability("appActivity",
			 * BuildObjrep.PackageActivityMap.get("Activity"));
			 * 
			 * capabilities2.setCapability("appActivity",
			 * BuildObjrep.PackageActivityMap.get("Activity"));
			 * 
			 * 
			 * driver2 = new AndroidDriver( new
			 * URL("http://127.0.0.1:4725/wd/hub"), capabilities);
			 * 
			 * System.out.println("driver 2 start");
			 * 
			 * 
			 * driver = new AndroidDriver(new
			 * URL("http://127.0.0.1:4723/wd/hub"), capabilities2);
			 * 
			 * System.out.println("driver 1 start");
			 * 
			 * 
			 * driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 * driver2.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			 

			msg = "opening application :   "
					+ BuildObjrep.TestCaseHashmap.get("Testcaseid");
			LogSupport.INFOPass(msg);
			ExtentHTML.pass(msg);

		}

	}

	public static void ThreadWait() throws InterruptedException {
		String time = BuildObjrep.TestCaseHashmap.get("Data");
		int timeInt = Integer.parseInt(time);
		Thread.sleep(timeInt);
		msg = "wait for   " + timeInt + " ms.";

		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);
	}

	// to switch application add package name and activity name in data column
	// seperated by comma

	public static void Applicationswitch(AndroidDriver driver)
			throws InterruptedException, MalformedURLException {

		String DataFieldValue = BuildObjrep.TestCaseHashmap.get("Data");
		String index[] = DataFieldValue.split(",");

		String packagename = index[0];
		String activityname = index[1];

		try {
			driver.startActivity(packagename, activityname);
			String msg = "application has been changed to " + packagename;

			LogSupport.INFOPass(msg);
			ExtentHTML.fail(msg);
		} catch (Exception e) {

			String msg = "application is not changed, Application package or activity name may be incorrect";
			LogSupport.INFOFail(msg);
			ExtentHTML.fail(msg);
		}

	}

	public static void SubmitValue() throws InterruptedException {

		// HelpAllfunctions.ajaxWaitandJquery();

		
		 * if(BuildObjrep.browser.equalsIgnoreCase("Appium")){
		 * 
		 * ((AppiumDriver) driver).resetApp(); }
		 
		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));
		wb.sendKeys(BuildObjrep.TestCaseHashmap.get("Data"));

		Thread.sleep(2000);

		msg = "value " + BuildObjrep.TestCaseHashmap.get("Data")
				+ "  has been submited";
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	public static void OTPcapture() throws InterruptedException {

		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));
		System.out.println("wb has been created");
		String otpvalue = null;
		String frompage = wb.getText();
		String[] splited = frompage.split(" ");
		for (String string : splited) {
			if (string.matches("\\d+")) {
				otpvalue = string;
				break;
			}

		}

		BuildObjrep.arraylist.add(otpvalue);

	}

	public static void ValueCapture() throws Exception, Throwable {
		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));
		String DataValue = BuildObjrep.TestCaseHashmap.get("Data");
		String ValueFromPage = "";
		String Leftlimit = "", RightLimit = "";
		if (wb == null) {
			NoSuchElementException e = new NoSuchElementException();
			throw e;
		}
		if (!DataValue.contains("Blank")) {
			if (DataValue.contains("^")) {
				Leftlimit = DataValue.split("\\^")[0];
				RightLimit = DataValue.split("\\^")[1];
				Leftlimit = Leftlimit.replace("&lt", "");
				RightLimit = RightLimit.replace("&rt", "");
			} else if (DataValue.contains("&lt")) {
				Leftlimit = DataValue.replace("&lt", "");
			} else {
				RightLimit = DataValue.replace("&rt", "");
			}
		}

		if (BuildObjrep.TestCaseHashmap.get("ActionSupportValue") == "Blank") {
			ValueFromPage = wb.getText();
		} else {
			ValueFromPage = wb.getAttribute(BuildObjrep.TestCaseHashmap
					.get("ActionSupportValue"));
		}

		if (Leftlimit != "") {
			Leftlimit = Leftlimit.trim();
			ValueFromPage = ValueFromPage.split(Leftlimit)[1];
		}
		if (RightLimit != "") {
			RightLimit = RightLimit.trim();
			ValueFromPage = ValueFromPage.split(RightLimit)[0];
			// ValueFromPage = ValueFromPage.split("\\(")[0];
		}
		if (ValueFromPage.contains("Post")) {
			ValueFromPage = ValueFromPage.trim();
			ValueFromPage = ValueFromPage.split(" ")[0];
		}
		ValueFromPage = ValueFromPage.trim();

		BuildObjrep.arraylist.add(ValueFromPage);
		int size = BuildObjrep.arraylist.size();
		size = size - 1;
		msg = "value " + BuildObjrep.TestCaseHashmap.get("Data")
				+ "  has been stored";
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	// you can give percentage in the data column, like 50 or 80.
	public static void seekBar(MobileDriver driver) {

		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));

		float precentage = Float.parseFloat(BuildObjrep.TestCaseHashmap
				.get("Data"));
		precentage = (float) (precentage * .01);
		// Get start point of seekbar.
		int startX = wb.getLocation().getX();
		System.out.println(startX);
		// Get end point of seekbar.
		int endX = wb.getSize().getWidth();
		System.out.println(endX);
		// Get vertical location of seekbar.
		int yAxis = wb.getLocation().getY();

		// Set sllebar move to position.
		// endX * 0.6 means at 60% of seek bar width.
		int moveToXDirectionAt = (int) (endX * (precentage));
		System.out.println("Moving seek bar at " + moveToXDirectionAt
				+ " In X direction.");

		// Moving seekbar using TouchAction class.
		TouchAction act = new TouchAction(driver);
		act.press(startX, yAxis).moveTo(moveToXDirectionAt, yAxis).release()
				.perform();

		msg = "value " + BuildObjrep.TestCaseHashmap.get("Data")
				+ "  has been submited";
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	// in data colum either landscape or portrait
	public static void ScreenOrientation(MobileDriver driver) {

		String orientation = BuildObjrep.TestCaseHashmap.get("Data");

		if (orientation.equalsIgnoreCase("LANDSCAPE")) {
			driver.rotate(org.openqa.selenium.ScreenOrientation.LANDSCAPE);
		}
		if (orientation.equalsIgnoreCase("PORTRAIT")) {
			driver.rotate(org.openqa.selenium.ScreenOrientation.PORTRAIT);
		}

		msg = "screen orientation is " + driver.getOrientation();

		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	// this will hide keyboard which appear on screen
	public static void hideKeyboard(MobileDriver driver) {

		driver.hideKeyboard();

		msg = "keyboard is hidden";
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	public static void Click(AndroidDriver driver) {

		
		 * WebElement wb = findPath(BuildObjrep.TestCaseHashmap
		 * .get("ElementFinderType"));
		 
		WebElement wb = findPathclick(
				BuildObjrep.TestCaseHashmap.get("ElementFinderType"), driver);
		wb.click();

		msg = "value " + wb + "  has been clicked";
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	public static void clear(AndroidDriver driver) {

		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));

		wb.clear();

		msg = "value " + wb + "  has been cleared";
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	public static void LongClick(MobileDriver driver) {
		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));

		TouchAction action = new TouchAction(driver);
		action.longPress(wb).release().perform();
		msg = "value " + wb + "  has been clicked";
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	public static void Tap(AndroidDriver driver) {
		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));

		Point point1 = wb.getLocation();
		int y = point1.getY();
		int x = point1.getX();
		TouchAction action = new TouchAction(driver);

		action.tap(wb, x, y);

		msg = "value " + wb + "  has been tap";
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	public static void DoubleTap(MobileDriver driver) {
		WebElement gg = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));

		Point point = gg.getLocation();
		int y = point.getY();
		int x = point.getX();
		TouchAction action = new TouchAction(driver);
		action.tap(gg, x, y);
		action.tap(gg, x, y);
		msg = "value " + gg + "  has been double tap";

		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	public static void ClickCopyCapture() throws InterruptedException,
			AWTException, UnsupportedFlavorException, IOException {

		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));

		driver.manage().window().maximize();

		HelpAllfunctions.clearClipboard();
		wb.click();

		HelpAllfunctions.controlA();

		HelpAllfunctions.controlC();

		String data = HelpAllfunctions.ClipboardData();

		BuildObjrep.arraylist.add(data);
		int size = BuildObjrep.arraylist.size();
		size = size - 1;
		// System.out.println(BuildObjrep.arraylist.get(size));
		msg = "value " + BuildObjrep.arraylist.get(size)
				+ "  has been captured and stored at index" + size;
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	public static void VerifyText() {

		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));
		//System.out.println("wb has been created");
		String frompage = wb.getText();
		String fromdatafield = BuildObjrep.TestCaseHashmap.get("Data");
	//	System.out.println("data field value is  " + fromdatafield);
		msg = "value from page " + frompage + "  value from data field is "
				+ fromdatafield + " for method  VerifyText";

		if (frompage.contains(fromdatafield)) {
			System.out.println("contains check  "
					+ frompage.contains(fromdatafield));
			LogSupport.INFOPass(msg);
			ExtentHTML.pass(msg);
		} else {
			LogSupport.INFOFail(msg);
			ExtentHTML.fail(msg);
		}

	}

	public static void Pageback() {

		driver.navigate().back();

		String msg = " Back Button is clicked sucessfully";

		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	// give clear in data column if want to clear notification

	public static void openNotification(AndroidDriver driver)
			throws InterruptedException {

		driver.openNotifications();

		Thread.sleep(2000);
		String fromdatafield = BuildObjrep.TestCaseHashmap.get("Data");

		if (fromdatafield.equalsIgnoreCase("clear")
				&& BuildObjrep.TestCaseHashmap.get("Elementlocation")
						.equalsIgnoreCase("")) {

			WebElement wb = driver.findElement(By
					.id("com.android.systemui:id/dismiss_text"));
			wb.click();
		}
		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));
		wb.click();

		System.out.println("element has been clicked" + wb);

	}

	public static void isAppInstalled(AndroidDriver driver) {

		String packagename = BuildObjrep.TestCaseHashmap.get("Data");
		Boolean value = driver.isAppInstalled(packagename);
		if (value.equals("true")) {
			String msg = "Application is installed";
			LogSupport.INFOPass(msg);
			ExtentHTML.pass(msg);

		} else {

			String msg = "please install " + packagename + " before you test";
			LogSupport.INFOFail(msg);
			ExtentHTML.fail(msg);
		}

	}

	public static void Zoom() throws InterruptedException {
		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));
		((AndroidDriver) driver).zoom(wb);

		String msg = "zoom";
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	public static void WindowSwitch() {

		// by Id
		String toWindow = BuildObjrep.TestCaseHashmap.get("Data");
		driver.switchTo().window(toWindow);

	}

	public static void frameSwitch() {

		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));
		int size = driver.findElements(By.tagName("iframe")).size();
		for (int i = 0; i < size; i++) {

			if (wb == null) {
				driver.switchTo().defaultContent();
			} else {
				driver.switchTo().frame(i);
			}
		}

	}

	public static void VerifyAny() throws IOException {
		boolean Result = false;
		List<WebElement> wb = findPaths(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));
		// System.out.println("total number of elements  " + wb.size());

		List<String> frompageList = getAllElementText(wb, wb.size());
		frompageList = new ArrayList<String>(new LinkedHashSet<String>(
				frompageList));
		// System.out.println("from page values   "+frompageList);
		for (String pagevalue : frompageList) {
			if (pagevalue.contains(BuildObjrep.TestCaseHashmap.get("Data"))) {

				Result = true;
				break;
			}

		}
		if (Result) {
			String msg = "value " + BuildObjrep.TestCaseHashmap.get("Data")
					+ "  is found in list" + frompageList;
			LogSupport.INFOPass(msg);
			ExtentHTML.pass(msg);
		} else {

			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);

			// Now you can do whatever you need to do with it, for example copy
			// somewhere

			FileUtils.copyFile(scrFile, new File("D:\\screenshot.png"));
			String msg = "value " + BuildObjrep.TestCaseHashmap.get("Data")
					+ "  is not found in list" + frompageList;
			LogSupport.INFOFail(msg);
			ExtentHTML.fail(msg);
		}

	}

	public static void VerifyCapture() {

		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));

		String frompage = wb.getText();
		int index = Integer.parseInt(BuildObjrep.TestCaseHashmap.get("Data"));

		String valueatIndex = BuildObjrep.arraylist.get(index);

		msg = "value from page " + frompage + "value stored at Index "
				+ valueatIndex + "is " + valueatIndex
				+ " for method  VerifyCapture";

		if (frompage.contains(valueatIndex)) {
			LogSupport.INFOPass(msg);
			ExtentHTML.pass(msg);
		} else {
			LogSupport.INFOFail(msg);
			ExtentHTML.fail(msg);
		}

	}

	// this alert work for both Web and mobile
	public static void AlertAccept() {

		if (BuildObjrep.browser.equalsIgnoreCase("Appium")) {

			driver.findElement(By.name("OK")).click();
		} else
			driver.switchTo().alert().accept();

		msg = "Alert accepted";

		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	// this alert work for both Web and mobile
	public static void AlertReject() {

		if (BuildObjrep.browser.equalsIgnoreCase("Appium")) {
			driver.findElement(By.name("Cancel")).click();
		} else
			driver.switchTo().alert().dismiss();

		msg = "Alert dismissed";

		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	public static void VerifyElement() throws IOException {

		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));
		if (wb != null) {
			msg = "Element present";

			LogSupport.INFOPass(msg);
			ExtentHTML.pass(msg);

		} else {

			msg = "Element not present";
			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);

			// Now you can do whatever you need to do with it, for example copy
			// somewhere

			FileUtils.copyFile(scrFile, new File("D:\\screenshot"
					+ BuildObjrep.TestCaseHashmap.get("Testcaseid") + ".png"));

			LogSupport.INFOFail(msg);
			ExtentHTML.fail(msg);

		}

	}

	public static void VerifyAttribute() {
		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));

		String att = wb.getAttribute(BuildObjrep.TestCaseHashmap
				.get("ActionSupportValue"));
		String data = BuildObjrep.TestCaseHashmap.get("Data");
		String msg = "value from page  " + att + "  value in datfield  " + data
				+ " for method  verifyelement";
		if (att.equals(data)) {
			LogSupport.INFOPass(msg);
			ExtentHTML.pass(msg);
		} else {
			LogSupport.INFOFail(msg);
			ExtentHTML.fail(msg);
		}

	}

	// This is to verify the Android package name against the value defined in
	// the data section.
	public static void VerifyApkPackage() {

		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));

		String fromPageValue = wb.getText();
		String DataFieldValue = BuildObjrep.TestCaseHashmap.get("Data");
		String msg = "package name from page  " + fromPageValue
				+ "  value in datafield  " + DataFieldValue
				+ "  method  VerifyApkPackage";

		if (fromPageValue.contains(DataFieldValue)) {
			LogSupport.INFOPass(msg);
			ExtentHTML.pass(msg);
		} else {
			LogSupport.INFOFail(msg);
			ExtentHTML.fail(msg);
		}

	}

	public static void Native(AndroidDriver driver)
			throws InterruptedException, IOException {
		String command = BuildObjrep.TestCaseHashmap.get("Data");
		if (command.equalsIgnoreCase("home")) {
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_HOME);
		}
		if (command.equalsIgnoreCase("menu")) {
			driver.pressKeyCode(AndroidKeyCode.MENU);
			Thread.sleep(2000);

		}
		if (command.equalsIgnoreCase("volume up")) {
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		}
		if (command.equalsIgnoreCase("volume down")) {
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		}

		if (command.equalsIgnoreCase("mute")) {
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_MUTE);

		}

		if (command.equalsIgnoreCase("brightness up")) {
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);

		}

		if (command.equalsIgnoreCase("brightness down")) {
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);

		}

		if (command.equalsIgnoreCase("brightness down")) {
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_POWER);

		}

		if (command.equalsIgnoreCase("lock")) {
			Runtime.getRuntime().exec("adb shell input keyevent 26");

		}

		if (command.equalsIgnoreCase("unlock")) {
			Runtime.getRuntime().exec("adb shell input keyevent 82");

		}

		String msg = "commad for " + command + " has been executed";
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	// This is to test the application in batter saver mode
	// batter saver functionality will not work with usb connnected.
	// for this try emulator or bluetooth
	public static void BatteryStatus(AndroidDriver driver)
			throws InterruptedException {

		String uservalue = BuildObjrep.TestCaseHashmap.get("Data");

		if (uservalue.equals("battery saver")) {
			driver.startActivity("com.android.settings",
					"com.android.settings.fuelgauge.PowerUsageSummary");

			driver.findElement(
					By.xpath("//android.widget.ImageButton[@content-desc='More options']"))
					.click();
			Thread.sleep(2000);
			driver.findElement(
					By.xpath("//android.widget.TextView[@text='Battery saver']"))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.id("com.android.settings:id/switch_widget"))
					.click();
		}

		Integer uservaluebattery = Integer.parseInt(uservalue);

		String value = driver
				.findElement(
						By.xpath("//android.widget.FrameLayout/android.widget.ListView/android.widget.FrameLayout/android.view.View"))
				.getAttribute("name");
		String[] split = value.split("%");

		String battery = split[0];
		Integer phonebattery = Integer.parseInt(battery);
		try {
			if (phonebattery >= uservaluebattery) {

				System.out.println("test case has been passed");

			} else {
				throw new LowBatteryException(
						"battery level is lower then required level");
			}

			System.out.println("battery percentage is " + battery);

			String msg = "battery level is  " + phonebattery
					+ "  and minimum battery required   " + uservaluebattery;

			LogSupport.INFOPass(msg);
			ExtentHTML.pass(msg);

		} catch (Exception e) {
			String msg = "battery level is  " + phonebattery
					+ "  and minimum battery required   " + uservaluebattery
					+ e;

			LogSupport.INFOFail(msg);
			ExtentHTML.fail(msg);

		}
	}

	public static void Wifi(AndroidDriver driver) {

		driver.startActivity("com.android.settings",
				"com.android.settings.wifi.WifiSettings");

		String wifi = BuildObjrep.TestCaseHashmap.get("Data");

		if (capabilities.getCapability("platformName") == "Android"
				|| capabilities.getCapability("platformNAme") == "android"
				|| capabilities.getCapability("platformNAme") == "ANDROID") {

			WebElement wb = driver.findElement(By
					.id("com.android.settings:id/switch_widget"));

			if (wifi.equalsIgnoreCase("on")) {

				if (wb.getAttribute("checked").equals(false)) {
					wb.click();
				} else {
					System.out.println("Wifi Already ON");
				}

			} else if (wifi.equalsIgnoreCase("off")) {

				if (wb.getAttribute("checked").equalsIgnoreCase("true")) {
					wb.click();
				} else {
					System.out.println("Wifi Already OFF");
				}

			}
		} else if (capabilities.getCapability("platformName") == "ios"
				|| capabilities.getCapability("platformName") == "IOS"
				|| capabilities.getCapability("platformName") == "Ios") {

			driver.startActivity("com.android.settings",
					"com.android.settings.Settings");

			WebElement wb = driver.findElement(
					By.id("com.android.settings:id/wifi_settings"))
					.findElement(By.id("com.android.settings:id/switchWidget"));

			if (wifi.equalsIgnoreCase("on")) {

				if (wb.getAttribute("checked").equals(false)) {
					wb.click();
				} else {
					System.out.println("Wifi Already ON");
				}

			} else if (wifi.equalsIgnoreCase("off")) {

				if (wb.getAttribute("checked").equals(true)) {
					wb.click();
				} else {
					System.out.println("Wifi Already OFF");
				}

			}
		}

	}

	// This function is used to change the network settings-To switch on
	// wifi,airplaneMode mode and data connection

	// Example if you want to open wifi give wifi in data column and if you want
	// airplaneMode and wifi to get activated give airplaneMode,wifi

	public static void Network(AndroidDriver driver) {

		String awd = BuildObjrep.TestCaseHashmap.get("Data");
		System.out.println("value from data field is" + awd);
		if (awd.equalsIgnoreCase("wifi")) {
			NetworkConnectionSetting connection = new NetworkConnectionSetting(
					false, true, false);
			driver.setNetworkConnection(connection);// here driver type is
													// Android driver
		}
		if (awd.equalsIgnoreCase("data")) {
			NetworkConnectionSetting connection = new NetworkConnectionSetting(
					false, false, true);
			driver.setNetworkConnection(connection);// here driver type is
													// Android driver
		}
		if (awd.equalsIgnoreCase("airplaneMode")) {
			NetworkConnectionSetting connection = new NetworkConnectionSetting(
					true, false, false);
			driver.setNetworkConnection(connection);// here driver type is
													// Android driver
		}

		if (awd.contains("airplaneMode") && awd.contains("wifi")
				&& awd.contains("data")) {
			NetworkConnectionSetting connection = new NetworkConnectionSetting(
					true, true, true);
			driver.setNetworkConnection(connection);// here driver type is
													// Android driver
		}

		if (awd.contains("airplaneMode") && awd.contains("wifi")
				&& !awd.contains("data")) {
			NetworkConnectionSetting connection = new NetworkConnectionSetting(
					true, true, false);
			driver.setNetworkConnection(connection);// here driver type is
													// Android driver
		}
		if (awd.contains("airplaneMode") && !awd.contains("wifi")
				&& awd.contains("data")) {
			NetworkConnectionSetting connection = new NetworkConnectionSetting(
					true, false, true);
			driver.setNetworkConnection(connection);// here driver type is
													// Android driver
		}

		if (!awd.contains("airplaneMode") && awd.contains("wifi")
				&& awd.contains("data")) {
			NetworkConnectionSetting connection = new NetworkConnectionSetting(
					false, true, true);
			driver.setNetworkConnection(connection);// here driver type is
													// Android driver
		}

		if (!awd.contains("airplaneMode") && !awd.contains("wifi")
				&& !awd.contains("data")) {
			NetworkConnectionSetting connection = new NetworkConnectionSetting(
					false, false, false);
			driver.setNetworkConnection(connection);// here driver type is
													// Android driver
		}

	}

	// Element you want to drag in element and where you want to drop in
	// actionSupport and indexes in data column with comma separation

	public static void DragNDrop(MobileDriver driver) {
		System.out.println("DragNDrop start");
		if (BuildObjrep.TestCaseHashmap.get("Data") != null) {
			String DataFieldValue = BuildObjrep.TestCaseHashmap.get("Data");
			String index[] = DataFieldValue.split(",");
			if (BuildObjrep.TestCaseHashmap.get("Data") != null) {
				from = index[0];
				to = index[1];

			}
			wbFrom = BuildObjrep.TestCaseHashmap.get("Elementlocation");

			wbTo = BuildObjrep.TestCaseHashmap.get("ActionSupportValue");

			System.out.println("1 start");
			if (wbFrom.contains("val1")) {
				wbFrom = wbFrom.replace("val1", from);

			}

			if (wbTo.contains("val2")) {
				wbTo = wbTo.replace("val2", to);

			}

		}
		System.out.println("2 start");
		if (BuildObjrep.TestCaseHashmap.get("ElementFinderType")
				.equalsIgnoreCase("Xpath")) {

			System.out.println("3 start");

			WebDriverWait wait = new WebDriverWait(driver, 10); // explicit wait
			WebElement MovefromElement = wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(wbFrom)));
			WebElement MovetoElement = wait.until(ExpectedConditions
					.presenceOfElementLocated(By.xpath(wbTo)));

			// WebElement MovefromElement= driver.findElement(By.xpath(wbFrom));
			// WebElement MovetoElement= driver.findElement(By.xpath(wbTo));

			System.out.println("4 start");

			// WebElement MovefromElement=
			// driver.findElement(By.xpath("//android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView"));
			// WebElement MovetoElement=
			// driver.findElement(By.xpath(".//node[@class='android.view.ViewGroup' and @index='5']/node[@class='android.widget.LinearLayout']/node[@class='android.widget.ImageView']"));
			// WebElement MovefromElement=
			// driver.findElement(By.xpath("(//android.widget.ImageView)[2]"));
			// WebElement MovetoElement=
			// driver.findElement(By.xpath("(//android.widget.ImageView)[5]"));

			// WebElement MovetoElement=
			// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(wbTo)));
			TouchAction action = new TouchAction(driver);
			action.longPress(MovefromElement).moveTo(MovetoElement).release()
					.perform();
			String msg = "Element  " + MovefromElement
					+ "  has beeen moved to location   " + MovetoElement
					+ "  method  DragNDrop";
			if (MovefromElement != null && MovetoElement != null
					&& BuildObjrep.TestCaseHashmap.get("Data") != null) {
				LogSupport.INFOPass(msg);
				ExtentHTML.pass(msg);
			} else {
				LogSupport.INFOFail(msg);
				ExtentHTML.fail(msg);
			}
		}

	}

	public static void SwipeHorizontal(AndroidDriver driver)
			throws InterruptedException {
		Dimension size;

		WebElement wb = findPathclick(
				BuildObjrep.TestCaseHashmap.get("ElementFinderType"), driver);

		// Android System WebView
		size = driver.manage().window().getSize();
		System.out.println(size);

		// Find swipe start and end point from screen's with and height.
		// Find startx point which is at right side of screen.
		int startx = (int) (size.width * 0.70);
		// Find endx point which is at left side of screen.
		int endx = (int) (size.width * 0.30);

		Point point = wb.getLocation();

		int swipeStartHorizontal = point.getY();
		int startx1 = swipeStartHorizontal;
		if (BuildObjrep.TestCaseHashmap.get("ActionSupportValue") == null) {

			if (BuildObjrep.TestCaseHashmap.get("Data").equalsIgnoreCase("R2L")) {
				// Swipe from Right to Left.
				driver.swipe(startx, startx1, endx, startx1, 1000);
				Thread.sleep(2000);
			} else if (BuildObjrep.TestCaseHashmap.get("Data")
					.equalsIgnoreCase("L2R")) {
				driver.swipe(endx, startx1, startx, startx1, 1000);
				Thread.sleep(2000);
			}

			String msg = "element  "
					+ BuildObjrep.TestCaseHashmap.get("TeststepDescription")
					+ "  has been swipped"
					+ BuildObjrep.TestCaseHashmap.get("Data");
			LogSupport.INFOPass(msg);
			ExtentHTML.pass(msg);

		} else if (BuildObjrep.TestCaseHashmap.get("ActionSupportValue") != null) {

			for (int i = 0; i <= 100; i++) {
				int mysize = driver.findElements(
						By.name(BuildObjrep.TestCaseHashmap
								.get("ActionSupportValue"))).size();
				if (mysize != 0) {
					break;
				} else {

					if (BuildObjrep.TestCaseHashmap.get("Data")
							.equalsIgnoreCase("R2L")) {
						// Swipe from Right to Left.
						driver.swipe(startx, startx1, endx, startx1, 1000);
						Thread.sleep(500);
					} else if (BuildObjrep.TestCaseHashmap.get("Data")
							.equalsIgnoreCase("L2R")) {
						driver.swipe(endx, startx1, startx, startx1, 1000);
						Thread.sleep(500);
					}

				}
			}

		}

	}

	public static void SwipeVertical(AndroidDriver driver)
			throws InterruptedException {
		Dimension size;
		System.out.println("swipe vertical");
		WebElement wb = findPathclick(
				BuildObjrep.TestCaseHashmap.get("ElementFinderType"), driver);

		// driver.swipe(239,536,239,200,2000); // swipe using element
		// coordinates
		size = driver.manage().window().getSize();
		int screenhight = size.height;
		int screenwidth = size.width;

		System.out.println("scren size is " + size);
		Point point = wb.getLocation();

		int swipeStartXcoordinate = point.getX();
		int swipeStartYcoordinate = point.getY();
		Dimension dimension = wb.getSize();
		int elementhight = dimension.height;
		int elementwidth = dimension.width;

		int middlevaleuex = (swipeStartXcoordinate + elementwidth) / 2;
		int middlevaluey = (swipeStartYcoordinate + elementhight) / 2;

		System.out.println("middle value of x" + middlevaleuex);

		System.out.println("middle value of y" + middlevaluey);

		// Find swipe start and end point from screen's with and height.
		// Find starty point which is at bottom side of screen.
		// int starty = (int) (size.height * 0.80);
		// Find endy point which is at top side of screen.
		// int endy = (int) (size.height * 0.20);
		// Find horizontal point where you wants to swipe. It is in middle of
		// screen width.
		// int startx = size.width / 2;

		// int startx = swipeStartvertical;

		// System.out.println("starty = " + starty + " ,endy = " + endy
		// + " , startx = " + startx);

		if (BuildObjrep.TestCaseHashmap.get("Data").equalsIgnoreCase("B2T")) {

			// driver.swipe(startx, starty, startx, endy, 3000);
			// Thread.sleep(2000);
			// driver.swipe(swipeStartXcoordinate, swipeStartYcoordinate, endx,
			// endy, duration);

			int endx = middlevaleuex;
			int endy = swipeStartYcoordinate - 250;

			driver.swipe(middlevaleuex, swipeStartYcoordinate, endx, endy, 1000);

		} else if (BuildObjrep.TestCaseHashmap.get("Data").equalsIgnoreCase(
				"T2B")) {
			// driver.swipe(startx, endy, startx, starty, 3000);

			int endx = middlevaleuex;
			int endy = swipeStartYcoordinate + 250;

			driver.swipe(middlevaleuex, swipeStartYcoordinate, endx, endy, 1000);

		}

		String msg = "element  "
				+ BuildObjrep.TestCaseHashmap.get("TeststepDescription")
				+ "  has been swipped"
				+ BuildObjrep.TestCaseHashmap.get("Data");
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	// this will work with test name only
	// if you dont have name or text use VerticalScroll

	public static void AppiumScrollTo(AndroidDriver driver) {

		String scrollTo = BuildObjrep.TestCaseHashmap.get("Data");

		driver.scrollTo(scrollTo);

		String msg = "element  "
				+ BuildObjrep.TestCaseHashmap.get("TeststepDescription")
				+ "  scrolled " + BuildObjrep.TestCaseHashmap.get("Data");
		LogSupport.INFOPass(msg);
		ExtentHTML.pass(msg);

	}

	
	 * public WebElement scroll(String keyword) { HashMap scrollObject = new
	 * HashMap(); RemoteWebElement element = (RemoteWebElement) ((AndroidDriver)
	 * driver).findElementByAndroidUIAutomator(
	 * "new UiSelector().xpath(\"'//android.widget.EditText[@content-desc='Locality']\")"
	 * ); JavascriptExecutor js = (JavascriptExecutor) driver; String
	 * webElementId = ((RemoteWebElement) element).getId();
	 * System.out.println(webElementId);System.out.println(element);
	 * scrollObject.put("text", keyword); scrollObject.put("element",
	 * webElementId); js.executeScript("mobile: scrollTo", scrollObject); return
	 * element; }
	 

	public static void takeScreenShot() {
		// Set folder name to store screenshots.
		String destDir = "D:\\Appium_project\\Screenshots";
		// Capture screenshot.
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		// Set date format to set It as screenshot file name.
		dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		// Create folder under project with name "screenshots" provided to
		// destDir.
		new File(destDir).mkdirs();
		// Set file name using current date time.
		String destFile = BuildObjrep.TestSuitHashmap.get("Testcaseid")
				+ dateFormat.format(new Date()) + ".png";

		try {
			// Copy paste file at destination folder location
			FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	 * public static void verifyToast() {
	 * 
	 * String path = @"D:\\Appium_project\\Screenshots\\"; Bitmap image = new
	 * Bitmap(path); Tesseract ocr = new Tesseract();
	 * ocr.SetVariable("tessedit_char_whitelist", "0123456789"); // If digit
	 * only ocr.Init(@"C:\\tessdata\", "eng", false); // To use correct tessdata
	 * List<tessnet2.Word> result = ocr.DoOCR(image, Rectangle.Empty); foreach
	 * (tessnet2.Word word in result) Console.WriteLine("{0} : {1}",
	 * word.Confidence, word.Text); }
	 

	public static void verifyImages() throws IOException {

		// WebElement img =
		// driver.findElementByClassName("android.widget.ImageView");

		// take screen shot

		String destDir = "D:\\Appium_project\\Screenshots";
		File screen = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);

		// capture image of searched contact icon
		dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		// Create folder under project with name "screenshots" provided to
		// destDir.
		new File(destDir).mkdirs();

		WebElement wb = findPath(BuildObjrep.TestCaseHashmap
				.get("ElementFinderType"));

		String destFile = BuildObjrep.TestSuitHashmap.get("Testcaseid")
				+ dateFormat.format(new Date()) + ".png";

		Point point = wb.getLocation();

		int width = wb.getSize().getWidth();
		int height = wb.getSize().getHeight();

		BufferedImage img = ImageIO.read(screen);
		BufferedImage dest = img.getSubimage(point.getX(), point.getY(), width,
				height);
		ImageIO.write(dest, "png", screen);
		// File file = new File("Menu.png");

		
		 * try { // Copy paste file at destination folder location
		 * FileUtils.copyFile(screen, new File(destDir + "/" + destFile)); }
		 * catch (IOException e) { e.printStackTrace(); }
		 

		FileUtils.copyFile(screen, new File(destDir + "/" + destFile));
		String imagename = screen.getAbsolutePath();
		String againstimage = BuildObjrep.TestCaseHashmap.get("Data");
		// verify images
		verifyImage(imagename, againstimage);
	}

	public static void verifyImage(String image1, String image2)
			throws IOException {
		File fileInput = new File(image1);
		File fileOutPut = new File(image2);

		BufferedImage bufileInput = ImageIO.read(fileInput);
		DataBuffer dafileInput = bufileInput.getData().getDataBuffer();
		int sizefileInput = dafileInput.getSize();
		BufferedImage bufileOutPut = ImageIO.read(fileOutPut);
		DataBuffer dafileOutPut = bufileOutPut.getData().getDataBuffer();
		int sizefileOutPut = dafileOutPut.getSize();
		Boolean matchFlag = true;
		if (sizefileInput == sizefileOutPut) {
			for (int j = 0; j < sizefileInput; j++) {
				if (dafileInput.getElem(j) != dafileOutPut.getElem(j)) {
					matchFlag = false;
					break;
				}
			}
		} else {
			matchFlag = false;

		}
		if (matchFlag == false) {
			String msg = "image sub image from the xpath and the image provided are not same";
			LogSupport.INFOFail(msg);
			ExtentHTML.fail(msg);

		}
		if (matchFlag == true) {
			String msg = "Subimage of element and image given are same";

			LogSupport.INFOPass(msg);
			ExtentHTML.pass(msg);
		}
		// Assert.assertTrue(matchFlag, "Images are not same");
	}

}
*/