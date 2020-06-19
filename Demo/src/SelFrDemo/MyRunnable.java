package SelFrDemo;
import SelFrDemo.NotThreadSafe;

public class MyRunnable implements Runnable{
	NotThreadSafe instance = null;
	MyRunnable(NotThreadSafe instance){
	    this.instance = instance;
	  }
public static void main(String... args)
{
	
	 NotThreadSafe sharedInstance = new NotThreadSafe();
	// new Thread(new MyRunnable(new NotThreadSafe())).start();
	// new Thread(new MyRunnable(new NotThreadSafe())).start();
	new Thread(new MyRunnable(sharedInstance)).start();
	new Thread(new MyRunnable(sharedInstance)).start();
	 
	}
@Override
public void run() {
	this.instance.add("some text");
	
}


}

