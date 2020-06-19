package SelFrDemo;

import java.util.concurrent.ThreadFactory;

//import org.testng.internal.thread.ThreadUtil.ThreadFactoryImpl;

class HasRun1 extends Thread {
	static int count = 0;

	public void run() {
		while (count <= 5) {
			System.out.println("eat count" + count);
			count++;
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class ThreadJoin implements ThreadFactory {

	public static void main(String... agrs) throws InterruptedException {
		HasRun1 hr = new HasRun1();
		hr.setName("run thread");
		hr.start();
		hr.join();

		while (HasRun1.count <= 10) {
			System.out.println("print from main" + HasRun1.count);
			HasRun1.count++;

		}

	}

	@Override
	public Thread newThread(Runnable paramRunnable) {
		// TODO Auto-generated method stub
		return null;
	}
}
