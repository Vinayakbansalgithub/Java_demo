package SelFrDemo;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import ThreadPackage.AtmWithdraw;

public class SingletonMain implements Runnable {
	static SingletonClass object;
    final static CountDownLatch startSignal = new CountDownLatch(1);

	@Override
	public void run() {
		
		System.out.println("-----");
		
	//	System.out.println("0000000000000000000");
		// TODO Auto-generated method stub
		
        try {
			startSignal.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 object =SingletonClass.getInstance();
		 object.print();
	}
public static void main(String[] args) throws InterruptedException {
	

	
	

	ExecutorService pool = Executors.newFixedThreadPool(8);

	for (int i = 0; i < 100; i++) {
		pool.execute(new SingletonMain());
	}
    
//	SingletonMain SingletonMain1= new SingletonMain();
//	SingletonMain SingletonMain2= new SingletonMain();
//	Thread mehul= new Thread(SingletonMain1,"mehul");
//	Thread vinayak= new Thread(SingletonMain2,"vinayak");
//	
//	mehul.start();
//	vinayak.start();
    startSignal.countDown();

	
	
//	vinayak.join();
	
	
/*
	SingletonClass object = SingletonClass.getInstance();
	//System.out.println(object);
	object.print();*/
	}



}
