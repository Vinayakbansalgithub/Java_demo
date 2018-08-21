package ThreadPackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ConsumerProducerProblem {
	static Queue<String> queue = new LinkedList<String>();

	void Consume() throws InterruptedException {

		
		// here we are having class level locking because we have taken lock on static variable
		
		synchronized (queue) {

			for (int i = 0; i < 10; i++) {

				if (queue.size() == 0)
					queue.wait();

				System.out.println("in consumer");

				queue.remove("hello");
				queue.notify();

			}

		}

	}

	synchronized void produce() throws InterruptedException {
		synchronized (queue) {

			for (int i = 0; i < 10; i++) {
				System.out.println("in producer");
				queue.add("hello");
				queue.notify();
				queue.wait();

			}

		}

	}

	public static void main(String[] args) throws InterruptedException {

		ConsumerProducerProblem obj = new ConsumerProducerProblem();

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

		}
		;
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

		}
		;

		new Producer().start();
		new Consumer().start();

	}

}
