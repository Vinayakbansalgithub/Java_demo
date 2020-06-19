package SelFrDemo;

public class strictfpDemo {
	double f=1.8f;
	double g=2.7456f;
	int j;
	strictfp void fun()
	{
		int i;
		System.out.println("value of f is  "+f);
		System.out.println("value of g is  "+g);
//		System.out.println("value of i is  "+i);
		System.out.println("value of j is  "+j);
	}
	public static void main(String[] args) {
		strictfpDemo de=new strictfpDemo();
		de.fun();
	}
	

}
