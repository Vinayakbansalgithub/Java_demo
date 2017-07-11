package Junit;
import java.util.Arrays;
import java.util.Collection;
 
import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
   private Integer inputNumber;
   private Boolean expectedResult;
   private primeNumberChecker primeNumberChecker;

   @Before
   public void initialize() {
	   
	   System.out.println("here");
      primeNumberChecker = new primeNumberChecker();
   }

   // Each parameter should be placed as an argument here
   // Every time runner triggers, it will pass the arguments
   // from parameters we defined in primeNumbers() method
	
   public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
	   System.out.println("we are in constuctor");
	   
      this.inputNumber = inputNumber;
      this.expectedResult = expectedResult;
   }

   
   // this will be the first step which will be run in this test class.
   @Parameterized.Parameters
   public static Collection primeNumbers() {
      return Arrays.asList(new Object[][] {
         { 2, true },
         { 6, false },
         { 19, true },
         { 22, false },
         { 23, true }
      });
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testPrimeNumberChecker() {
      System.out.println("Parameterized Number is : " + inputNumber);
    /*  assertEquals(expectedResult, 
      primeNumberChecker.validate(inputNumber));*/
   }}
