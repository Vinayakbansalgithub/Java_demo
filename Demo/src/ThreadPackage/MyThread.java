package ThreadPackage;

public class MyThread implements Runnable {

	static int sum = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			sum += i;
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Runnable run = new MyThread();

		Runnable ref = run::run;
		ref.run();

		// Thread.yield();
		System.out.println(sum);

	}
}
