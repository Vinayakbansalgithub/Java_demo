package SelFrDemo;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//import org.apache.poi.util.SystemOutLogger;

class PrintThread implements Runnable {
	int count;

	public PrintThread(int i) {

		// TODO Auto-generated constructor stub
		count = i;
	}

	@Override
	public void run() {
	//	synchronized (this) {

			// TODO Auto-generated method stub
			System.out.println(Thread.currentThread().getName()
					+ " is printing value " + count);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("exception has been caught");
			}
			System.out.println(Thread.currentThread().getName()
					+ "  is in the end");
		}
	//}

}

public class ThreadPoolDemo {
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		ThreadPoolExecutor exe = (ThreadPoolExecutor) Executors
				.newFixedThreadPool(2);

		/*new ThreadPoolExecutor(2, 2, 0L,
		 TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
		*/
		
		for (int i = 0; i < 10; i++) {
			PrintThread workingthread = new PrintThread(i);
			Callable<Integer> c = new Callable<Integer>() {

				@Override
				public Integer call() throws Exception {
					// TODO Auto-generated method stub
					return 123;
				}
			};
		System.out.println("value of c is " + c);
			
			exe.execute(workingthread);
			Future<Integer> f = exe.submit(c);
			System.out.println(f.isDone());
			Integer p = f.get();
			System.out.println(f.isDone());
			System.out.println(p.toString());

		}
		exe.shutdown();
	}
}
