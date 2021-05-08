package java8;

import java.util.function.Consumer;

interface JustLikeConsumer {

	void accept(String str);
}

public class PrintNameExample {

	void withHi(JustLikeConsumer lambda, String name) {
		lambda.accept(name);
	}

	public static void main(String[] args) {
		String name = "vinayak";
		PrintNameExample obj = new PrintNameExample();

		obj.withHi(a -> System.out.println("hello " + a), name);

		JustLikeConsumer lambdaDefined = a -> System.out.println("hello " + a);
		lambdaDefined.accept("Mehul");

		Consumer<String> lambda = s1 -> System.out.println("Hi " + s1);
		lambda.accept("Alice");

	}

}
