package ThreadPackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;



//For cSemaphore all acquire() calls will block and tryAcquire() calls will return false, until you do a release()
//
//For pSemaphore the first acquire() calls will succeed and the rest will block until the first one releases. 

public class ProducerConsumerUsingSemaphores {
	Semaphore pSemaphore = new Semaphore(1);
	Semaphore cSemaphore = new Semaphore(0);

	Queue<Integer> queue = new LinkedList<Integer>();

	class Producers implements Runnable {

		Semaphore pSemaphore;
		Semaphore cSemaphore;

		Queue<Integer> queue;

		public Producers(Semaphore pSemaphore, Semaphore cSemaphore, Queue<Integer> queue) {
			super();
			this.pSemaphore = pSemaphore;
			this.cSemaphore = cSemaphore;

			this.queue = queue;

		}

		@Override
		public void run() {

			for (int i = 1; i <= 5; i++) {
				try {
//					System.out.println("pSemaphore allow permits before aquire "+pSemaphore.availablePermits());
					pSemaphore.acquire();
					queue.add(i);
					System.out.println(Thread.currentThread().getName() + " addd integer " + i);
					cSemaphore.release();
					// pSemaphore.release();
//					System.out.println("pSemaphore allow permits after add "+pSemaphore.availablePermits());

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}
	}

	class Consumers implements Runnable {

		Semaphore cSemaphore;
		Semaphore pSemaphore;

		Queue<Integer> queue;

		public Consumers(Semaphore cSemaphore, Semaphore pSemaphore, Queue<Integer> queue) {
			super();
			this.pSemaphore = pSemaphore;
			this.cSemaphore = cSemaphore;

			this.queue = queue;
		}

		@Override
		public void run() {

			for (int i = 1; i <= 5; i++) {
				try {
//					System.out.println("cSemaphore allow permits before consume  "+cSemaphore.availablePermits());
					cSemaphore.acquire();
					int val = queue.poll();
					System.out.println(Thread.currentThread().getName() + " remove integer " + val);
					pSemaphore.release();
					// cSemaphore.drainPermits();
//					System.out.println("pSemaphore allow permits after consume "+pSemaphore.availablePermits());
//					System.out.println("cSemaphore allow permits after consume "+cSemaphore.availablePermits());

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public static void main(String[] args) {
		ProducerConsumerUsingSemaphores obj = new ProducerConsumerUsingSemaphores();
		Producers p = obj.new Producers(obj.pSemaphore, obj.cSemaphore, obj.queue);
		Consumers c = obj.new Consumers(obj.cSemaphore, obj.pSemaphore, obj.queue);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();

	}
}
