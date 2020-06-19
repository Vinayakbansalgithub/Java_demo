package SelFrDemo;


 class HasRun extends Thread
{
 static int count=0; 
	@Override
	public void run() {
		
			
		
		while(count<=5)
		{
			System.out.println("print from run"+count);
			count++;
			
		}
	
	}	
	
}

public class ThreadRunnable  {
public static void main(String... args) throws InterruptedException
{
	HasRun tr= new HasRun();
	//Thread t = new Thread(tr);

tr.start();
tr.join();

while(HasRun.count<=10)
{
	System.out.println("print from main"+HasRun.count);
	HasRun.count++;
	
}


}
}

