package ThreadPackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class PassengerThread extends Thread {
	private int duration;
	private CyclicBarrier barrier;

	public PassengerThread(int duration, CyclicBarrier barrier, String pname) {
		super(pname);
		this.duration = duration;
		this.barrier = barrier;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(duration);
			System.out.println(Thread.currentThread().getName() + " is arrived.");

			barrier.reset();

			int await = barrier.await();
			if (await == 0) {
				System.out.println("Four passengers have arrived so cab is going to start..");
			}
		} catch (InterruptedException | BrokenBarrierException e) {

		
		System.out.println("BrokenBarrierException===");
		}
		System.out.println("here");
	}
}
public class CyclicBarrierExample {
	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3 };
		List<Integer> s=IntStream.of(arr).boxed().collect(Collectors.toList());
		System.out.println(s.get(0));

		System.out.println(Thread.currentThread().getName() + " has started");
		
		CyclicBarrier barrier = new CyclicBarrier(4);
		
		PassengerThread p1 = new PassengerThread(1000, barrier, "John");
		PassengerThread p2 = new PassengerThread(2000, barrier, "Martin");
		PassengerThread p3 = new PassengerThread(3000, barrier, "Joya");
		PassengerThread p4 = new PassengerThread(4000, barrier, "Sam");
		
		PassengerThread p5 = new PassengerThread(1000, barrier, "Pipa");
		PassengerThread p6 = new PassengerThread(2000, barrier, "Dolly");
		PassengerThread p7 = new PassengerThread(3000, barrier, "Harman");
		PassengerThread p8 = new PassengerThread(4000, barrier, "Brad");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		p5.start();
		p6.start();
		p7.start();
		p8.start();
		
		System.out.println(Thread.currentThread().getName() + " has finished");
	}
}