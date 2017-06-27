package SelFrDemo;

public class DemonThread extends Thread {
	
	
	public DemonThread() {
			setDaemon(true);
	}
	
	public void run()
	{
		System.out.println("Demon thread is   "+isDaemon());
		}
	
	public static void main(String... a)
	{
		DemonThread dt= new DemonThread();
		dt.start();
		try{
		Thread.sleep(1000);
		
		}catch(Exception e)
		{}
		System.out.println("last step thread"+Thread.currentThread().getName());
		
	}
}
