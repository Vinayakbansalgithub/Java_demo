package Lamda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

class LockThread implements Runnable{
ReentrantLock lock;
	@Override
	public void run() {
		
		
		lock.lock();
		
		LockExample.counter++;
		System.out.println("counter value "+LockExample.counter);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock.unlock();
	}
	
	LockThread(ReentrantLock lock, String name){
		this.lock= lock;
		new Thread(this).start();
	}
}

public class LockExample {

	static int counter=0;
	
	
	public static void main(String[] args) {
		
		ReentrantLock lock = new ReentrantLock();
		new LockThread(lock,"a");
		new LockThread(lock,"b");
		new LockThread(lock,"c");
		new LockThread(lock,"d");
		new LockThread(lock,"f");
		new LockThread(lock,"e");
		
		ExecutorService service = Executors.newFixedThreadPool(2);

	}
	
}
