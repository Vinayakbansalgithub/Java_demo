package ThreadPackage;

import java.util.concurrent.Semaphore;


class Sproducer implements Runnable{

	
	Sproducer(){
		new Thread(this).start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	for (int i = 0; i < 10; i++) {
			try {
				SemaphoreExample.put();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	}
}
class Sconsumer implements Runnable{
	
	 Sconsumer() {
			new Thread(this).start();
	}
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			try {
				SemaphoreExample.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}}

public class SemaphoreExample {
	
	static int counter=0;
	
static Semaphore sProd= new Semaphore(1);
static Semaphore sCon= new Semaphore(0);

static void put() throws InterruptedException{
	
	
	sProd.acquire();
	
	System.out.println("producer  "+ ++counter);
	
	sCon.release();

}

static void get() throws InterruptedException {
	
	sCon.acquire();
	
	System.out.println("consumer "+ --counter);
	
	sProd.release();
}

	
public static void main(String[] args) {
	
	new Sproducer();
	new Sconsumer();

	
	
}
}
