package Recurssion;

public class PrintID {
	
	
	private static void print(int i) {
		// TODO Auto-generated method stub
		
		
	if(i==0) {
		return;
	}
	
	System.out.println(i);
		print(i-1);
		System.out.println(i);	
	}
	
	private static void printSkip(int i) {
		// TODO Auto-generated method stub
		
		
		if(i==0)
			return;
		
	if(i%2==1) {
		System.out.println(i);
	}
	
	
	
	
		printSkip(i-1);
	
		if(i%2==0) {
			System.out.println(i);
		}

	
		
	}
	
	public static void main(String[] args) {
		
		
		
		//print(5);
		printSkip(15);
	}

	

}
