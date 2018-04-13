package ThreadPackage;

class MyRunnable implements Runnable
{

	static int sum=0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < 10; i++) {
			sum+=i;
		}
		
	}
	}

public class MyThread extends MyRunnable{
public static void main(String[] args) throws InterruptedException {
	
	Runnable run= new MyRunnable();
	
	Thread t1= new Thread(run,"thread 1");
	
	t1.start();
	t1.setPriority(Thread.MAX_PRIORITY);
	t1.join();
	
	//Thread.yield();
	System.out.println(sum);
	
	
}
}
