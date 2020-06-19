package Junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)




abstract class Myabstractclass{
	public  abstract void  met();
}
public class MyTestCheck {

	Integer value;
	public MyTestCheck(Integer num){
		 System.out.println("constructor ");
		 
		 value=num;
		}
	 
	 
	@Before
	   public void initialize() {
		
		System.out.println("-------------------");
		
		MyTestCheck  obj= new MyTestCheck(4);
	   }
	
	
	 @Parameterized.Parameters
	   public static Collection primeNumbers() {
	      return Arrays.asList(new Object[][] {
	         { 2 },
	         { 6 },
	         { 19 },
	         { 22 },
	         { 23 }
	      });
	   }

	
	
	
	@Test
	public void hellotest(){
		System.out.println("hello test"+value);
		
		
		
	}

}
