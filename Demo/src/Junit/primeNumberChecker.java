package Junit;

public class primeNumberChecker {
	
	Double d = new Double("6.9685");
	public Boolean validate(final Integer primeNumber) {
	      for (int i = 2; i < (primeNumber / 2); i++) {
	         if (primeNumber % i == 0) {
	            return false;
	         }
	      }
	      return true;
	   }
}
