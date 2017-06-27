package TestNg;

import org.testng.annotations.Test;

public class DependTest {
  @Test(dependsOnMethods="test2")
  public void test1(){
	  System.out.println("run second");
  }
  @Test()
  public void test2(){
	  System.out.println("run first");
  }
}
