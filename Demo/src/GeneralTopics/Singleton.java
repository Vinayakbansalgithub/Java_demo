package GeneralTopics;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;



public class Singleton {
	
	private static Singleton instance;

	static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					System.out.println("instance by thread " + Thread.currentThread().getName() + " is creating obj");
					instance = new Singleton();
				}
			}
		}

		System.out.println("instance by thread " + Thread.currentThread().getName() + " is " + instance);
		return instance;
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		//System.out.println(Singleton.getInstance());

		ExecutorService es = Executors.newFixedThreadPool(5);

		IntStream.range(0, 100).forEach((c) -> es.submit(Singleton::getInstance));

		System.out.println(Singleton.getInstance());

		Singleton instance2 = Singleton.getInstance();
//
//		Constructor[] con = Singleton.class.getDeclaredConstructors();
//
//		for (Constructor c : con) {
//			//Below code will destroy the singleton pattern
//            c.setAccessible(true);
//            instance2 = (Singleton) c.newInstance();
//            break;
//		}
		
		System.out.println(Singleton.getInstance());
		System.out.println(instance2);


	}
}




//They are generally used as a global instance, why is that so bad? Because you hide the dependencies of your application in your code, instead of exposing them through the interfaces. Making something global to avoid passing it around is a code smell.
//
//They violate the single responsibility principle: by virtue of the fact that they control their own creation and lifecycle.
//
//They inherently cause code to be tightly coupled. This makes faking them out under test rather difficult in many cases.
//
//They carry state around for the lifetime of the application. Another hit to testing since you can end up with a situation where tests need to be ordered which is a big no no for unit tests. Why? Because each unit test should be independent from the other.

