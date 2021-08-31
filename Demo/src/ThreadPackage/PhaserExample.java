package ThreadPackage;

import java.util.concurrent.Phaser;


//similar construct to the CountDownLatch that allows us to coordinate execution of threads. 
//In comparison to the CountDownLatch, it has some additional functionality.
//
//The Phaser is a barrier on which the dynamic number of threads need to wait before continuing execution.
//In the CountDownLatch that number cannot be configured dynamically 
//and needs to be supplied when we're creating the instance.
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
