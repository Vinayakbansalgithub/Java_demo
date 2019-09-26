package ThreadPackage;

public class MyThread implements Runnable {

	static int sum = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {
			sum += i;
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Runnable run = new MyThread();
		Runnable ref = run::run;
		ref.run();

		// Thread.yield();
		System.out.println(sum);
		
		String threadName = Thread.currentThread().getName();
	    System.out.println ("Current Thread : " + threadName);
		
//		If you do not need to use multiple times the same runnable in different threads, 
//		you could also do as the following example:
		Thread t = new Thread( new Runnable(){
		    public void run(){
		    	for (int i = 0; i < 10; i++) {
					System.out.println("hi");
				}
		    }}
		); 
		
		
		t.start(); 
		
//		Thread.join() simple waits for the Thread to die and returns. 
//		However its safe to assume that thread may already have died before Thread.join() happens.
		t.join();
		 threadName = Thread.currentThread().getName();
	    System.out.println ("Current Thread : " + threadName);
	}
}
