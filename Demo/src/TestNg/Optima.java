package TestNg;

import static com.jayway.restassured.RestAssured.given;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class Optima { 
	static String price;
	
 HashMap<Integer, Integer> mapDateRate= new HashMap<Integer, Integer>();
 HashMap<Integer, Integer> mapCompetitiveness= new HashMap<Integer, Integer>();

	
public static void main(String[] args)  {
	WebDriver driver = null;
	
	
//	WebDriver driver= new FirefoxDriver();
	try{
	 
	System.setProperty("webdriver.chrome.driver", "D:\\Vinayak\\workspace\\asdasd\\Driver\\chromedriver.exe");
	 
	// Initialize browser
	driver=new ChromeDriver();
	System.out.println("start---------------------");
	driver.get("https://optima-demo.rategain.com/optima/login");
//	driver.manage().window().maximize();
	Thread.sleep(10000);
	
	WebElement username=driver.findElement(By.xpath("html/body/pgh-layout/ui-view/form/div/div/input[@type='email']"));
	username.sendKeys("Pooja.tapan@rategain.com");
	WebElement password=driver.findElement(By.xpath("html/body/pgh-layout/ui-view/form/div/div/input[@type='Password']"));
	password.sendKeys("pgh@1234");
	
	WebElement login= driver.findElement(By.xpath(".//*[@id='btnLogin']"));
	login.click();
	
	Thread.sleep(15000);
	
	WebElement inbox= driver.findElement(By.xpath("html/body/pgh-layout/ui-view/div[1]/a[contains(text(),'Inbox')]"));
	
	inbox.click();
	
	Thread.sleep(5000);


	WebElement shopdate= driver.findElement(By.xpath("//ul/c/li/div[contains(text(),'Price Threshold Breach')]/em"));
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();", shopdate);
	Thread.sleep(10000);

	
	System.out.println("shopdate");
	WebElement trends= driver.findElement(By.xpath("//div[@class='leftPane dsk ng-scope']//div/a[contains(@href,'trends')]"));
	
	
	 js.executeScript("arguments[0].click();", trends);
	Thread.sleep(10000);


	System.out.println("trends");

	

	WebElement rates= driver.findElement(By.xpath("//div[@class='leftPane dsk ng-scope']//div/a[contains(@href,'rates')]"));
	js.executeScript("arguments[0].click();", rates);
	Thread.sleep(5000);
	
	WebElement pricebinding= driver.findElement(By.xpath("//*[@id='monthCalendarTable']/table/tbody/tr[2]/td[1]/div/div/span[@class='price ng-binding']"));
	price=pricebinding.getText();
	
	
	List<WebElement>  calanderRows= driver.findElements(By.xpath("	//*[@id='monthCalendarTable']/table/tbody/tr"));
	System.out.println(calanderRows.size());
	
	for (int i = 1; i <= calanderRows.size(); i++) {
		String path="//*[@id='monthCalendarTable']/table/tbody/tr["+i+"]/td";
		List<WebElement>  calandercolumns= driver.findElements(By.xpath(path));

		if(i==calanderRows.size()){
			
		}
		
		System.out.println(calandercolumns.size());
		
		
		String partialColumnPath="//*[@id='monthCalendarTable']/table/tbody/tr["+i+"]/td/div/div/span[@class='price ng-binding']";
	
		List<WebElement>  calandercolumnspartial= driver.findElements(By.xpath(partialColumnPath));

		System.out.println("partialColumnPath"+calandercolumnspartial.size());
		
		
		int diff=(calandercolumns.size()-calandercolumnspartial.size());
		System.out.println("diff   "+diff);
		
		//*[@id='monthCalendarTable']/table/tbody/tr[1]/td
		
		//*[@id='monthCalendarTable']/table/tbody/tr[1]/td[5]/div/div/span[@class='price ng-binding']
		
		if(i!=calanderRows.size()){
		for (int j = 1+diff; j <= calandercolumns.size(); j++) {
			
			String datepath="//*[@id='monthCalendarTable']/table/tbody/tr["+i+"]/td["+j+"]/div/div/span[@class='date ng-binding']";
			
			//*[@id='monthCalendarTable']/table/tbody/tr[1]/td/div[1]/div/span
			WebElement currentDate= driver.findElement(By.xpath(datepath));
			
			System.out.println("  date   "+currentDate.getText());

			String ratepath="//*[@id='monthCalendarTable']/table/tbody/tr["+i+"]/td["+j+"]/div/div/span[@class='price ng-binding'][text()]";
			
			WebElement currentRate= driver.findElement(By.xpath(ratepath));
			
			System.out.println(" rate  "+currentRate.getText());
			System.out.println("--------------");
		}
		}
		else{
			
			for (int j = 1; j <= calandercolumnspartial.size(); j++) {
				
				String datepath="//*[@id='monthCalendarTable']/table/tbody/tr["+i+"]/td["+j+"]/div/div/span[@class='date ng-binding']";
				
				//*[@id='monthCalendarTable']/table/tbody/tr[1]/td/div[1]/div/span
				WebElement currentDate= driver.findElement(By.xpath(datepath));
				System.out.println("  date   "+currentDate.getText());

				String ratepath="//*[@id='monthCalendarTable']/table/tbody/tr["+i+"]/td["+j+"]/div/div/span[@class='price ng-binding'][text()]";
				
				WebElement currentRate= driver.findElement(By.xpath(ratepath));
				
				System.out.println(" rate  "+currentRate.getText());
				System.out.println("--------------");
			}
			
		}
		

	}
	
	
	System.out.println("---------------");
	
	Thread.sleep(5000);

	
	
	js.executeScript("arguments[0].click();", pricebinding);
	Thread.sleep(5000);
	
	WebElement Competitiveness= driver.findElement(By.xpath("//span[text()='Competitiveness']"));
	js.executeScript("arguments[0].click();", Competitiveness);
	
	WebElement graph= driver.findElement(By.xpath(".//*[@id='CompetitivenessChart']/div/div[1]/*[local-name() = 'svg']/*[name()='g'][6]/*[name()='g']/*[name()='g'][8]/*[name()='path']"));
	Actions action = new Actions(driver);
	action.moveToElement(graph);
	
	Thread.sleep(10000);
	
	System.out.println("api start");

	RestAssured.baseURI="https://www.googleapis.com/books/v1/";
	Response response=given().param("q", "turing").when().get("/volumes");
	System.out.println(" status code  "+response.getStatusCode());
	
	RestAssured.baseURI  = "https://optima-demo.rategain.com/optimaapi/GetCompetitiveness?";	

	Response r = given()
	.contentType("application/json").
	body("{\"LOS\":\"1\",\"Guest\":\"1\",\"ProductTypeID\":null,\"InclusionID\":null,\"Properties\":[],\"Channels\":[],\"Restriction\":null,\"Qualification\":null,\"Promotion\":null,\"CheckInStartDate\":\"06/1/2017\",\"CheckInEndDate\":\"06/1/2017\",\"SID\":\"15738\",\"MSIRequired\":\"true\",\"MSIRequired\":true,\"BenchmarkRequired\":true,\"CompsetRatesRequired\":true,\"SubscriberPropertyID\":1101213}").
    when().
    post("");
	
	Thread.sleep(5000);

	
	System.out.println("api body");
	System.out.println("status : " + r.statusCode());


	String Rbody = r.getBody().asString();
	System.out.println(Rbody);
	
	
	
	JSONObject obj = new JSONObject(Rbody);
	
	boolean boolstatus=obj.getBoolean("Status");
	
	
	
	
	
	

	System.out.println(boolstatus);
	
	
	JSONObject region = obj.getJSONObject("Body");

	System.out.println(region);
	
	JSONArray arr = region.getJSONArray("PriceCompetitivenessRates");
	System.out.println(arr.length());
	
	

	for (int i = 0; i < arr.length(); i++) {
		String PropertName = arr.getJSONObject(i).getString("PropertName");
		System.out.println("PropertName is : " + PropertName);
		
		Double ratee = arr.getJSONObject(i).getDouble("Rate");
		System.out.println("price is : " + ratee);

		
		

		String ChannelName = arr.getJSONObject(i).getString("ChannelName");
		System.out.println("ChannelName is : " + ChannelName);
		

		
	}


	 Date date = new Date();
	    String DATE_FORMAT = "MM/dd/yyyy";
	    SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
	    System.out.println("Today is " + sdf.format(date));
	
	//String APIBody = "{API Body}";
	//e.g.- "{\"key1\":\"value1\",\"key2\":\"value2\"}"
	

/*
"{\"key1\":\"value1\",\"key2\":\"value2\",\"key3\":\"value3\",\"key4\":\"value5\",\"key6\":\"value6\",\"key7\":\"value7\",\"key8\":\"value8\",\"key9\":\"value9\",\"key10\":\"value10\"}"


"{\"LOS\":\"1\",\"Guest\":\"1\",\"ProductTypeID\":\"null\",\"InclusionID\":\"null\",\"Properties\":\"[]\",\"Channels\":\"[]\",\"Restriction\":\"null\",\"Qualification\":\"null\",\"Promotion\":\"null\",\"CheckInStartDate\":\"06/13/2017\",\"CheckInEndDate\":\"06/13/2017\",\"SID\":\"15738\",\"MSIRequired\":\"true\",\"MSIRequired\":\"true\",\"BenchmarkRequired\":\"true\",\"CompsetRatesRequired\":\"true\",\"SubscriberPropertyID\":\"1101213\"}"

*
*	body("{\"LOS\":\"1\",\"Guest\":\"1\",\"ProductTypeID\":\"null\",\"InclusionID\":\"null\",\"Properties\":\"[]\",\"Channels\":\"[]\",\"Restriction\":\"null\",\"Qualification\":\"null\",\"Promotion\":\"null\",\"CheckInStartDate\":\"06/13/2017\",\"CheckInEndDate\":\"06/13/2017\",\"SID\":\"15738\",\"MSIRequired\":\"true\",\"MSIRequired\":\"true\",\"BenchmarkRequired\":\"true\",\"CompsetRatesRequired\":\"true\",\"SubscriberPropertyID\":\"1101213\"}").

*/		
	//driver.quit();

	}catch(Exception e){
		e.printStackTrace();

		driver.quit();
	}
	
	}

}
