package Lamda;

import java.util.function.Consumer;

public class MethodReferenceSample {
public static void main(String[] args) {
	
	
	
	String s="hello";
	//Consumer con = (s) -> System.out::println;

	 Consumer<String> c =System.out::println;
c.accept(s);
}
}
