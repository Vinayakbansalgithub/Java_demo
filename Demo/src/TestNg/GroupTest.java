package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GroupTest {
	@Test(dataProvider = "data",groups={"vinayak"})
	public void f(String s1, String s2) {
		System.out.println("vinayak group");
		System.out.println(s1 + s2);
	}
	@BeforeGroups("vinayak")
	public void group(){
		System.out.println("before group aannotation");
	}
	@Test(dataProvider = "data",groups={"mehul","monika"})
	public void d(String s1, String s2) {
		System.out.println("mehul group");
		System.out.println(s1 + s2);
		
	}
	@AfterGroups("mehul")
	public void aftaergroup(){
		System.out.println("after group aannotation");
	}
	

	@DataProvider
	public Object[][] data() {
		return new Object[][] { { "hello", "vinaYAK" }, { "hello", "mehul" },{ "hello", "monika" },{ "hello", "nandini" } };

	}
}
