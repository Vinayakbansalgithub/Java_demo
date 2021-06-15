package ThreadPackage;

public class Thread100Times extends Thread {


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		for (int i = 1; i <= 100; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(i%10==0)
				System.out.println(Thread.currentThread()+"every 10 seconds");
			
			try {
				Thread.sleep(100);
				
				System.out.println("-------------------------");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
	
	Thread100Times t= new Thread100Times();
	t.start();
	
}

}
