package ThreadPackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		// return the thread name executing this callable task
		return Thread.currentThread().getName();
	}

	public <T> Future<T> wrap(Callable<T> task) {
		Callable<T> wrappedMethod = () -> {
			return task.call();
		};
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<T> future = executor.submit(wrappedMethod);
		return future;
	}

	public static void main(String args[]) throws InterruptedException, ExecutionException {

		// Get ExecutorService from Executors utility class, thread pool size is 10
		ExecutorService executor = Executors.newFixedThreadPool(10);

		Callable mycall = () -> {
			return Thread.currentThread().getName();
		};

		Future<String> threadNameResult = executor.submit(mycall);

		System.out.println(threadNameResult.get());

		CallableExample obj = new CallableExample();
		Future<ArrayList<String>> mylistFuture = obj.wrap(() -> new ArrayList<String>());

		System.out.println(mylistFuture.get().size());

		// create a list to hold the Future object associated with Callable
		List<Future<String>> list = new ArrayList<Future<String>>();
		// Create MyCallable instance
		Callable<String> callable = new CallableExample();
		for (int i = 0; i < 5; i++) {
			// submit Callable tasks to be executed by thread pool
			Future<String> future = executor.submit(callable);
			// add Future to the list, we can get return value using Future
			list.add(future);
		}
		for (Future<String> fut : list) {
			try {
				// print the return value of Future, notice the output delay in console
				// because Future.get() waits for task to get completed
				System.out.println(new Date() + "::" + fut.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}

		// shut down the executor service now
		executor.shutdown();
	}

}