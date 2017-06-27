package TestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporter  {
	ExtentReports reports;
	ExtentTest test;
	@BeforeTest
	public void setup(){
		reports= new ExtentReports(System.getProperty("user.dir")+"/test-output/MyOwnReport.html", true);
		reports.addSystemInfo("owner", "Vinayak");
		reports.addSystemInfo("enviromet", "Stage");
		reports.addSystemInfo("Project", "Automation project");
		reports.config().reportName("vinayak autotest");
		reports.config().reportHeadline("selenium heading");
		reports.config().documentTitle("doc title");
	}
	@BeforeMethod
	public void start(){
	test=reports.startTest("test 1");	
	}  
	
	
	
	
  @Test
  public void test1() {
	  System.out.println("test case 1 has pass sucessfully");
	  Assert.assertTrue(true);
	  	test.log(LogStatus.PASS,"test 1 has been passed");
  }
 /* @Test
  public void test2() {
	  System.out.println("test case 1 has failed");
	  Assert.assertTrue(false);

	  	test.log(LogStatus.FAIL,	 "test 1 has been failed");
  }*/
  @AfterMethod
  public void closeTest(){
	  reports.endTest(test);  }
  @AfterTest
  public void close(){
	  
	  reports.flush();
	  reports.close();
  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
