package ThreadPackage;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerProblemWaitNotify {
	static Queue<String> queue = new LinkedList<String>();

	void Consume() throws InterruptedException {

		// here we are having class level locking because we have taken lock on static
		// variable

		
			for (int i = 0; i < 10; i++) {
				synchronized (queue) {
				if (queue.size() == 0)
					queue.wait(); // wait will give up the lock
				System.out.println("in consumer");
				queue.remove("food");
				queue.notify();
				queue.wait();
			}
		}
	}

	void produce() throws InterruptedException {
	
				for (int i = 0; i < 10; i++) {
					synchronized (queue) {
				System.out.println("in producer");
				queue.add("food");
				queue.notify(); 
				queue.wait();
				}
			}
		}

	public static void main(String[] args) throws InterruptedException {

		ProducerConsumerProblemWaitNotify obj = new ProducerConsumerProblemWaitNotify();

		class Consumer extends Thread {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					obj.Consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		class Producer extends Thread {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					obj.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		new Producer().start();
		new Consumer().start();

	}

}
