package ThreadPackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {

	ReentrantReadWriteLock lock = new ReentrantReadWriteLock(true);

	Queue<Integer> queue = new LinkedList<Integer>();

	class Read implements Runnable {

		ReentrantReadWriteLock obj;
		Queue<Integer> queue;

		public Read(ReentrantReadWriteLock lock, Queue<Integer> queue) {
			// TODO Auto-generated constructor stub
			this.obj = lock;
			this.queue = queue;

		}

		@Override
		public void run() {
			// TODO Auto-generated method stub

			obj.readLock().lock();

			try {
				System.out.println("queue size " + queue.size());
			} finally {
				obj.readLock().unlock();
			}

		}
	}

	class Write implements Runnable {
		ReentrantReadWriteLock obj;
		Queue<Integer> queue;

		public Write(ReentrantReadWriteLock lock, Queue<Integer> queue) {
			// TODO Auto-generated constructor stub
			this.obj = lock;
			this.queue = queue;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			obj.writeLock().lock();
			try {
				queue.add(1);
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				obj.writeLock().unlock();
				System.out.println("write complete");
			}

		}
	}

	public static void main(String[] args) {

		ReadWriteLock obj = new ReadWriteLock();

		Read r = obj.new Read(obj.lock, obj.queue);
		Write w = obj.new Write(obj.lock, obj.queue);
		
		
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(w);
		Thread t4 = new Thread(w);
		Thread t5 = new Thread(r);
		Thread t6 = new Thread(w);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();


		
		

	}
}
