package SelFrDemo;

public class VolatileDemo extends Thread {
		 boolean  runCheck = true;

		    public void run() {
		    	synchronized (this) {
					
			
		    	System.out.println("helo i m in run and keeprinning is"+Thread.currentThread().getName()+runCheck);
		        long count=0;
		        while (runCheck) {
		        	System.out.println(runCheck);
		            count++;
		        }

		        System.out.println("Thread terminated."+count);
		    }

		    	
		    }
		    public static void main(String[] args) throws InterruptedException {
		    	final VolatileDemo t = new VolatileDemo();
		        t.start();
		        Thread.sleep(2000);
		        t.runCheck = false;
		        System.out.println("keepRunning set to ."+t.runCheck+Thread.currentThread().getName());
		    }
		}

