package TestNg;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.testng.annotations.Test;

public class BrowserStack {
  @BeforeClass
  public void before() {
	  
	  System.out.println("we are in before class");
  }
  
  
  @AfterClass
  public void after() {
	  
	  System.out.println("we are in after class");
  }
}
