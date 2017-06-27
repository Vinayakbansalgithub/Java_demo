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
	
		
		
		Producer1 p = new Producer1();
		Customer1 con = new Customer1();
		Merchent1 m = new Merchent1();
		Seller1 s = new Seller1();
		Thread c1 = new Thread(c);
		Thread p2 = new Thread(p);
		Thread con2 = new Thread(con);
		Thread m2 = new Thread(m);
		Thread s2 = new Thread(s);
		c1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(p2);
		c1.start();
		p2.start();
		con2.start();
		m2.start();
		s2.start();
	}

}
