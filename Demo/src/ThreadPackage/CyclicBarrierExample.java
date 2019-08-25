package ThreadPackage;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class HelloThread implements Runnable{

	CyclicBarrier mycb;
	public HelloThread(String string, CyclicBarrier cb) {
		// TODO Auto-generated constructor stub
		this.mycb=cb;
		
		new Thread(this).start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			System.out.println("======");

			mycb.await();
			
			System.out.println("++++");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}

public class CyclicBarrierExample {
	public static void main(String[] args) {
		
		
		CyclicBarrier cb = new CyclicBarrier(3);
		
		new HelloThread("t1" ,cb);
		new HelloThread("t2", cb);
		new HelloThread("t3", cb);
		System.out.println("---------");
		
	}

}
