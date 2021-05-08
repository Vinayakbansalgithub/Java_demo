package ThreadPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class ListInSameOrder implements Runnable{
	
	List<String> list;
	
	Semaphore ins, outs;

    ListInSameOrder(List<String> list, Semaphore ins, Semaphore outs) {
        this.list = list;
        this.ins = ins;
        this.outs = outs;
    }

    public void run() {
        for (int i = 0; i < list.size(); i++) {
            try {
				ins.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // wait for permission to run
            System.out.println(Thread.currentThread().getName()+" print " + list.get(i));
            outs.release();  // allow another thread to run
        }
    }
    
    
    
//    private Semaphore semEven = new Semaphore(0);
//    private Semaphore semOdd = new Semaphore(1);
// 
//    void printEvenNum(int num) {
//        try {
//            semEven.acquire();
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//        System.out.println(Thread.currentThread().getName() + num);
//        semOdd.release();
//    }
// 
//    void printOddNum(int num) {
//        try {
//            semOdd.acquire();
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//        System.out.println(Thread.currentThread().getName() + num);
//        semEven.release();
// 
//    }

   
    
    
	public static void main(String[] args) {
		//Creating a List  
		 List<String> list=new ArrayList<String>();  
		 //Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 
		 
		 Semaphore od = new Semaphore(1);  // first thread is allowed to run immediately
		 Semaphore ev = new Semaphore(0); // second thread has to wait
		 ListInSameOrder tp1 = new ListInSameOrder(list, od, ev);
		 ListInSameOrder tp2 = new ListInSameOrder(list, ev, od); 
		 
		 Thread odd = new Thread(tp1);
		 Thread even = new Thread(tp2);
		 odd.setName("producer");
		 even.setName("consumer");

		 odd.start();
		 even.start();

	}

}
