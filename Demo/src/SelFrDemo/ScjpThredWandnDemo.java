package SelFrDemo;

class ThredB extends Thread {
	int count = 0;

	public void run() {

		synchronized (this) {
			System.out.println("in the start");
			System.out.println("value of this is" + this);

			for (int i = 1; i <= 100; i++) {
				count = count + 1;
			}
			notifyAll();

		}

	}
}

public class ScjpThredWandnDemo {
	public static void main(String[] args) {
		ThredB b = new ThredB();
		b.start();
		synchronized (b) {
			try {
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("count value is " + b.count);
		}

	}
}
