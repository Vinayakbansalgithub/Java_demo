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
