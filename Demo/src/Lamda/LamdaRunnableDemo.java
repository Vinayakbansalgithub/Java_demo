package Lamda;

public class LamdaRunnableDemo {
public static void main(String[] args) {
	
	Thread t= new Thread(()->System.out.println("hope you like lamda"));

	t.start();
	
	
	
}
}
