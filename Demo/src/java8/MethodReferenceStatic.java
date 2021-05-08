package java8;

import java.util.Arrays;
import java.util.List;

interface Moter {
	void runInteface();
}

public class MethodReferenceStatic {

	static void runClass() {
		System.out.println("running your moter");
	}

	public static void main(String[] args) {
		Moter m = () -> runClass();
		m.runInteface();
		
		
		Moter mm = MethodReferenceStatic::runClass;
		m.runInteface();
		
		
		
		// method reference instance method
		Moter m2 = () -> System.out.println("hello Vinayak");;
		m2.runInteface();
		
		Moter m22 =  System.out::println;;
		m22.runInteface();
		
		
		
		
		
		
		
	}
}
