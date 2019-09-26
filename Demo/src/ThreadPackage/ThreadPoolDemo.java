package ThreadPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class WorkerThreadd implements Runnable {

	private String job;

	public WorkerThreadd(String s) {
		this.job = s;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Start. Command = " + job);
		processCommand();
		System.out.println(Thread.currentThread().getName() + " End.");
	}

	private void processCommand() {
		System.out.println("Task done");
	}

	@Override
	public String toString() {
		return this.job;
	}
}

public class ThreadPoolDemo {
	public static void main(String[] args) {
		// ThreadPollDemo obj= new ThreadPollDemo();
		ExecutorService pool = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			Runnable task = new WorkerThreadd("job-" + i);
			// pool.execute(task); // this will also run the thread
			pool.submit(task); // this will also run the thread

		}
		pool.shutdown();
		while (!pool.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}
}
