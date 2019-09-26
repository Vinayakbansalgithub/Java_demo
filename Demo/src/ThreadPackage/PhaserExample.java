package ThreadPackage;

import java.util.concurrent.Phaser;

class PhaserThread implements Runnable {

	Phaser ph;

	PhaserThread(String name, Phaser phaser) {
		this.ph = phaser;

		new Thread(this).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(90);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("phase number " + ph.getPhase());
		
		System.out.println("::: " + Thread.currentThread().getName());

		// System.out.println("+++++++++");

		ph.arriveAndAwaitAdvance();
		// System.out.println("...........");
		// System.out.println("phase number "+ph.getPhase());

		// ph.arriveAndAwaitAdvance();
		System.out.println("phase number " + ph.getPhase());
		System.out.println(Thread.currentThread().getName());

	}

}

public class PhaserExample {
	public static void main(String[] args) {
		Phaser phaser = new Phaser(3);

		new PhaserThread("a", phaser);
		new PhaserThread("b", phaser);
		new PhaserThread("c", phaser);
		// System.out.println("end of main function");

	}

}
