package Lamda;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ExceptionHandleLamda {
	private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
	  System.out.println("3");
		for (int i : someNumbers) {
			consumer.accept(i, key);
		}
		
	}
	
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		  System.out.println("2");

		return (v, k) ->  {
			  System.out.println("4");

			try {
				consumer.accept(v, k);
			}
			catch (ArithmeticException e) {
				System.out.println("Exception caught in wrapper lambda");
			}
			
		};
	}

	public static void main(String[] args) {

		int [] someNumbers = { 1 };
		int key = 0;
		  System.out.println("1");

		//process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
		process(someNumbers, key, (v, k) -> System.out.println(v / k));

		  System.out.println("5");

	}
}
