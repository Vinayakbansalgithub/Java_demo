package ThreadPackage;

public class MoneyWithdraw implements Runnable{
	
	static Integer balance=500;
static	boolean lock= true;
	
	@Override
	public void run(){
		
		
		
			
			
			
		for (int i = 0; i < 50; i++) {
			
			
		synchronized (this) {
			
			
		//	while(lock){
		
		if(balance>0)
		{
			balance=balance-10;
			
			System.out.println("current balance "+balance +" withdraw by "+Thread.currentThread().getName());
			
		}else{
			System.out.println("sorry not enough balance "+ Thread.currentThread().getName());
	lock=false;
	break;
		
		
	//	}
		}
		}
		
		
		}
	}
	
	
public static void main(String[] args) throws InterruptedException {
	System.out.println(Thread.currentThread().getName()  +" Thread");

	
	Runnable r1= new MoneyWithdraw();
	Runnable r2= new MoneyWithdraw();

	
	Thread t1= new Thread(r1,"vinayak");
	Thread t2= new Thread(r1,"Mehul");
	Thread t3= new Thread(r1,"arpit");

	
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MAX_PRIORITY);
	t3.setPriority(Thread.MAX_PRIORITY);

	t1.start();
	t2.start();
	t3.start();
	
	
	//Thread.yield();
	
	
t2.join();
t1.join();
t3.join();
	System.out.println("END");
}
}



