package java8;


 interface Algebra{
	
	int calculate(int num1, int num2);
}
 

public class LamadaCalculate {

	
	
	int doOperation(Algebra a, int num1, int num2) {
		
		return a.calculate(num1, num2);
		
	}
	
	public static void main(String[] args) {
		
		LamadaCalculate obj = new LamadaCalculate();
		int num1=5;
		int num2=10;
		int result=obj.doOperation(((a,b) -> a*b),num1,num2);
		System.out.println(result);
	}
}
