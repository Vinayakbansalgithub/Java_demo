package SelFrDemo;


interface MathOperation {
     int operation(int a, int b);
  }


interface BoolInterface {
     boolean greatercheck(int a, int b);
  }

public class LamdaDemo {
 
 
  private int operate(int a, int b, MathOperation mathOperation){
     return mathOperation.operation(a, b);
  }
 
 
 
  private boolean check(int a, int b, BoolInterface ib){
     return ib.greatercheck(a, b);
  }
  public static void main(String args[]){
     LamdaDemo obj = new LamdaDemo();
		
     //with type declaration
     MathOperation addition = (int a, int b) -> a + b;
	 BoolInterface greater = (int a, int b) -> a > b;
		
	
     System.out.println("10 + 5 = " + obj.operate(10, 5, addition));
    System.out.println("a is greater then b   " + obj.check(2, 5, greater));
   
	
  }

 
}