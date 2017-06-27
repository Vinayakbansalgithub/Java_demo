package TestNg;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;

public class ListnerAdapter extends TestListenerAdapter{
	@Override
	  public void onTestSuccess(ITestResult tr) {
	   System.out.println("method "+tr.getMethod()+"  has successfully passed");
	  }

	  @Override
	  public void onTestFailure(ITestResult tr) {
		   System.out.println("method "+tr.getMethod()+"  has failed");
	  }

	  @Override
	  public void onTestSkipped(ITestResult tr) {
		   System.out.println("method "+tr.getMethod()+"  has skipped");

	  }

	  @Override
	  public void onTestFailedButWithinSuccessPercentage(ITestResult tr) {
		   System.out.println("method "+tr.getMethod()+"  has  passed with some precentage"+tr.SUCCESS_PERCENTAGE_FAILURE);

	  }

	

	  @Override
	  public void onStart(ITestContext testContext) {
		System.out.println(testContext.getAllTestMethods());
	  }

	  @Override
	  public void onFinish(ITestContext testContext) {
		  System.out.println(testContext.getClass());
	  }
	

}
