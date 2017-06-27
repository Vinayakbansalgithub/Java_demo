package SelFrDemo;

public class PCThread {
	
	
	

public static class PC {

	public  void producer() throws InterruptedException{
		synchronized (this) {
			System.out.println("in producer");
			
			wait();
			
			
			System.out.println("end");
		}
		
		
	
		
		
	}
public  void consumer() throws InterruptedException{
	Thread.sleep(1000);
	synchronized (this) {
		System.out.println("in consumer");
		// if we do not use notify then program will never exit
		//notify();
		
		
		Thread.sleep(2000);
		
	}
	
	}
	
}
	
	
	
	
	
	
	
	
public static void main(String[] args) throws InterruptedException {
	PC pc= new PC();
	Thread t1= new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
		try {
			pc.producer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	});
Thread t2= new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
		try {
			pc.consumer();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		}
	});
// Start both threads
t1.start();
t2.start();


	
	
}
	}

