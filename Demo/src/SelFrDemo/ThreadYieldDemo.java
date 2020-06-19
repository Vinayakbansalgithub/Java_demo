package SelFrDemo;

class Consumer1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("i am in consumer  " + i);
			Thread.yield();

		}
	}
}

class Producer1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("i am in Producer  " + i);
			Thread.yield();
		}
	}

}

class Customer1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("i am in customer  " + i);
			Thread.yield();
		}
	}

}

class Merchent1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("i am in merchent  " + i);
			Thread.yield();
		}
	}

}

class Seller1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("i am in seller  " + i);
			Thread.yield();
		}
	}

}

public class ThreadYieldDemo {
	public static void main(String[] args) {
		Consumer1 c = new Consumer1();
	
		
		
		Producer1 pt1 = new Producer1();
		Customer1 ct1 = new Customer1();
		Merchent1 mt1 = new Merchent1();
		Seller1 st1 = new Seller1();
		
		Thread c2 = new Thread(ct1);
		Thread p2 = new Thread(pt1);
		Thread s2 = new Thread(st1);
		Thread m2 = new Thread(mt1);
		
		
		p2.setPriority(Thread.MAX_PRIORITY);
		c2.setPriority(Thread.MIN_PRIORITY);
	
		
		
		c2.start();
		m2.start();
		s2.start();
		p2.start();
		
	}

}
