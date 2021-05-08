package ThreadPackage;

import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class ThreadPoolImpl implements Executor {

	Queue<Runnable> blockingQueue = new ConcurrentLinkedQueue<>();
	boolean isRunning = true;

	ThreadPoolImpl(int threadCount) {
		for (int i = 0; i < threadCount; i++) {
			new Thread(new worker()).start();

		}
	}

	@Override
	public void execute(Runnable command) {
		// TODO Auto-generated method stub

		System.out.println("adding command to the queue");
		blockingQueue.add(command);

	}

	public void shutDown() {
		// TODO Auto-generated method stub

		isRunning = false;

	}

	class worker implements Runnable {

		@Override
		public void run() {

			System.out.println("blocking queue size " + blockingQueue.size());
			while (isRunning) {

				Runnable nextTask = blockingQueue.poll();
				if (nextTask != null) {
					nextTask.run();
				}

			}
		}

	}

	void task() {
		System.out.println(Thread.currentThread().getName() + " start");

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " end");

	}

	public static void main(String[] args) {

		ThreadPoolImpl pool = new ThreadPoolImpl(8);

		pool.execute(() -> pool.task());
		pool.execute(() -> pool.task());
		pool.execute(() -> pool.task());
		pool.execute(() -> pool.task());
		pool.execute(() -> pool.task());
		pool.execute(() -> pool.task());
		pool.execute(() -> pool.task());
		pool.execute(() -> pool.task());

	}

}
