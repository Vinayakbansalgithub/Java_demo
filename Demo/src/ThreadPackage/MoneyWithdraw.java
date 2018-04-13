package ThreadPackage;

public class MoneyWithdraw implements Runnable{
	
	static int balance=50;
	
	@Override
	public void run(){
		
		for (int i = 0; i < 5; i++) {
			
	//	synchronized (this) {
			
		
		if(balance>0)
		{
			balance=balance-10;
			
			System.out.println("current balance "+balance);
			
		}else
			System.out.println("sorry not enough balance "+ Thread.currentThread().getName());
		
	//	}
		}
	}
	
	
public static void main(String[] args) {
	
	
	Runnable r1= new MoneyWithdraw();
	Runnable r2= new MoneyWithdraw();

	
	Thread t1= new Thread(r1,"vinayak");
	Thread t2= new Thread(r1,"Mehul");

	t1.start();
	t2.start();
	
	System.out.println("END");
}
}



