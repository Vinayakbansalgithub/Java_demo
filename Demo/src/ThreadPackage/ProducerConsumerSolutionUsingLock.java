package ThreadPackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerSolutionUsingLock {

	private static final int CAPACITY = 10;
	private final LinkedList<Integer> queue = new LinkedList<>();
	private final Random theRandom = new Random();

	// lock and condition variables
	private final Lock aLock = new ReentrantLock();
	private final Condition added = aLock.newCondition();
	private final Condition remove = aLock.newCondition();

	public void put() throws InterruptedException {

		for (int i = 0; i < 10; i++) {

			Thread.sleep(300);
			aLock.lock();
			try {
				while (queue.size() == CAPACITY) {
					System.out.println(Thread.currentThread().getName() + " : Buffer is full, waiting");
					remove.await();
				}

				int number = theRandom.nextInt();
				boolean isAdded = queue.offer(number);
				if (isAdded) {
					System.out.printf("%s added %d into queue %n", Thread.currentThread().getName(), number);
					// signal consumer thread that, buffer has element now
					System.out.println(
							Thread.currentThread().getName() + " : Signalling that buffer is no more empty now");
					added.signal();
				}
			} finally {
				aLock.unlock();
			}
		}
	}

	public void get() throws InterruptedException {
		for (int i = 0; i < 10; i++) {

			aLock.lock();
			try {
				while (queue.size() == 0) {
					System.out.println(Thread.currentThread().getName() + " : Buffer is empty, waiting");
					added.await();
				}

				Integer value = queue.poll();
				if (value != null) {
					System.out.printf("%s consumed %d from queue %n", Thread.currentThread().getName(), value);

					// signal producer thread that, buffer may be empty now
					System.out.println(Thread.currentThread().getName() + " : Signalling that buffer may be empty now");
					remove.signal();
				}

			} finally {
				aLock.unlock();
			}
		}
	}

	public static void main(String[] args) {

		ProducerConsumerSolutionUsingLock obj = new ProducerConsumerSolutionUsingLock();

		class Consumer extends Thread {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					obj.get();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		;
		class Producer extends Thread {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					obj.put();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		;

		new Producer().start();
		new Consumer().start();

	}
}
