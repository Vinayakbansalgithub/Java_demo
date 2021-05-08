package ThreadPackage;

import java.util.concurrent.Semaphore;





public class ProducerConsumerSemaphoreExample {

	static int counter = 0;

//The argument to the Semaphore instance is the number of "permits" that are available. It can be any integer, not just 0 or 1.

//For semZero all acquire() calls will block and tryAcquire() calls will return false, until you do a release()

//For semOne the first acquire() calls will succeed and the rest will block until the first one releases.

	static Semaphore sProd = new Semaphore(1);
	static Semaphore sCon = new Semaphore(0);

	static void put() throws InterruptedException {
		
		System.out.println("sProd.availablePermits() =>  " +sProd.availablePermits());

		sProd.acquire();

		System.out.println("producer  " + ++counter);

		sCon.release();
		
		System.out.println("sCon.availablePermits() =>  " +sCon.availablePermits());


	}

	static void get() throws InterruptedException {


		sCon.acquire();

		System.out.println("consumer " + --counter);

		sProd.release();
		

	}

	public static void main(String[] args) {

		class Sconsumer implements Runnable {

			

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					try {
						ProducerConsumerSemaphoreExample.get();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		}
		
		class Sproducer implements Runnable {

			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					try {
						ProducerConsumerSemaphoreExample.put();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}
		
	
		new Thread(new Sproducer()).start();
		new Thread(new Sconsumer()).start();

	}
}
