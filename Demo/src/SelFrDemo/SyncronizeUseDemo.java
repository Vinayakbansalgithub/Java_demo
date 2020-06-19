package SelFrDemo;

class ThreadClass implements Runnable {

	@Override
	public void run() {

		synchronized (ThreadClass.class) {

			// TODO Auto-generated method stub
			System.out.println("[ message");
			try {

				Thread.sleep(2000);
			} catch (Exception e) {
			}
			System.out.println("]");

		}

	}

}

public class SyncronizeUseDemo {
	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass();

		ThreadClass t2 = new ThreadClass();

		Thread tt1 = new Thread(t1);
		Thread tt2 = new Thread(t2);

		tt1.start();
		tt2.start();
	}
}
