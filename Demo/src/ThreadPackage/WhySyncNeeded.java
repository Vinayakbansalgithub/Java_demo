package ThreadPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class WhySyncNeeded {
	volatile int counter=0;
	Lock lock = new ReentrantLock();

	
	 void  inc() {
		//synchronized (this) {
			
			lock.lock();
			counter=counter+1;
			lock.unlock();	
		//}
		
	}
public static void main(String[] args) throws InterruptedException {
	WhySyncNeeded obj= new WhySyncNeeded();
	
	ExecutorService es= Executors.newFixedThreadPool(2);
	
	IntStream.range(0, 1000).forEach((c)->es.execute(obj::inc));
	
	//IntStream.range(0, 1000).forEach((c)->es.execute(obj.inc()));

	
	
	Thread.sleep(1000);
	System.out.println("value is "+obj.counter);
}
}
