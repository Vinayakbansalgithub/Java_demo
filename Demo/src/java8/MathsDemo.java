package java8;
interface MathsOperation{
	int operation(int a, int b);
}
public class MathsDemo { 
	
	int print(int a, int b, MathsOperation oprration){
		return oprration.operation(a, b);
	}
	
public static void main(String[] args) {
	MathsDemo obj= new MathsDemo();
	MathsOperation add=( a,  b)->a+b;
	MathsOperation sub=(int a, int b)->a-b;

	MathsOperation mul=(int a, int b)->a*b;

	MathsOperation div=(int a, int b)->a/b;
	int addresult=obj.print(5, 2, add);
	System.out.println(addresult);

	int subresult=obj.print(5, 2, sub);
	System.out.println(subresult);
	
	
	int mulresult=obj.print(5, 2, mul);
	System.out.println(mulresult);
	
	
	int divresult=obj.print(5, 2, div);
	System.out.println(divresult);
	
	
	
}
}
