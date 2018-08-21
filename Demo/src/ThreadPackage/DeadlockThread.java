package ThreadPackage;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

public class DeadlockThread{
	static String s1= "vinayak";
	static String s2= "Mehul";
	
	
	public static void main(String[] args) {
		DeadlockThread obj= new DeadlockThread();
		
		Thread t1= new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
				synchronized (s1) {
					synchronized (s2) {
					System.out.println("mehul vinayak");	
					}
					
				}
				}
		}
		
		};
		
		Thread t2= new Thread(){
			@Override
			public void run() {
				while(true){
				// TODO Auto-generated method stub
				synchronized (s2) {
					synchronized (s1) {
					System.out.println(" vinayak mehul");	
					}
				}
				}
		}
		
		};
		t1.setName("vinayak thread");
		t2.setName("mehul thread");

		t1.start();	
		t2.start();	
		
		
		
		 ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		 
	        long ids[] = bean.findMonitorDeadlockedThreads();
	 
	        if(ids != null)
	        {
	            ThreadInfo threadInfo[] = bean.getThreadInfo(ids);
	 
	            for (ThreadInfo threadInfo1 : threadInfo)
	            {
	                System.out.println(threadInfo1.getThreadId());    //Prints the ID of deadlocked thread
	 
	                System.out.println(threadInfo1.getThreadName());  //Prints the name of deadlocked thread
	 
	                System.out.println(threadInfo1.getLockName());    //Prints the string representation of an object for which thread has entered into deadlock.
	 
	                System.out.println(threadInfo1.getLockOwnerId());  //Prints the ID of thread which currently owns the object lock
	 
	                System.out.println(threadInfo1.getLockOwnerName());  //Prints name of the thread which currently owns the object lock.
	            
	            
	            System.out.println("---------------------");
	            }
	        }
	        else
	        {
	            System.out.println("No Deadlocked Threads");
	        }
		
		
		
		
		
	}
	
	
}
