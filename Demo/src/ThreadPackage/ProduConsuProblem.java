package ThreadPackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ProduConsuProblem {

	static Queue<Integer> basket = new LinkedList();
	static Thread t1;
	static Thread t2;
	
	static int i;

	  void comsume() throws InterruptedException {

		synchronized(basket){
		for (int i = 0; i < 10; i++) {
			
		
		if (!basket.isEmpty()) {

			
			System.out.println("money consumed ");

				basket.poll();

				basket.	notify();
			

		} else {
			System.out.println("empty queue----------");
			basket.wait();
			
		}
		}
	}}

	  void produce() throws InterruptedException {

		synchronized(basket){
		for (int i = 0; i < 10; i++) {
		if (isFull()) {
System.out.println("-----full");
		basket.	wait();


		} else {

		
			
				basket.add(i);
				System.out.println("money prduced ");
				basket.	notify();
				
			//	Thread.sleep(1000);
				basket.	wait();


			
		}
		}
		}

	}

	static boolean isFull() {

		if (basket.size() == 10)
			return true;
		else
			return false;
	}

	public static void main(String[] args) throws InterruptedException {

		
		ProduConsuProblem obj= new ProduConsuProblem();
		t1 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				
					try {
						obj.produce();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				
			}

		};

		t2 = new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

					try {
						obj.	comsume();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				
			}

		};

		t1.start();
		
		t2.start();

		
		t2.join();
		System.out.println("end-------------");
	}

}
