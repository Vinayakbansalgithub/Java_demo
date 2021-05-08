package ThreadPackage;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ProducerConsumerBlockingQueue {

	public static void main(String args[]) {

		// Creating shared object
		BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<Integer>(1);

		// Producer Class in java
		class Producer implements Runnable {

			private BlockingQueue<Integer> sharedQueue;

			public Producer(BlockingQueue<Integer> sharedQueue) {
				this.sharedQueue = sharedQueue;
			}

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						sharedQueue.put(i);
						System.out.println("Produced: " + i);
					} catch (InterruptedException ex) {

					}
				}
			}

		}

		// Consumer Class in Java
		class Consumer implements Runnable {

			private BlockingQueue<Integer> sharedQueue;

			public Consumer(BlockingQueue<Integer> sharedQueue) {
				this.sharedQueue = sharedQueue;
			}

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					try {
						System.out.println("Consumed: " + sharedQueue.take());
					} catch (InterruptedException ex) {
					}
				}
			}

		}

		// Creating Producer and Consumer Thread
		Thread prodThread = new Thread(new Producer(sharedQueue));
		Thread consThread = new Thread(new Consumer(sharedQueue));

		// Starting producer and Consumer thread
		prodThread.start();
		consThread.start();
	}

}
