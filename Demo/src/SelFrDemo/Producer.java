package SelFrDemo;

import java.util.List;

class Producer implements Runnable
{
   private final List<Integer> taskQueue;
   private final int  MAX_CAPACITY;
 
   public Producer(List<Integer> sharedQueue, int size)
   {
      this.taskQueue = sharedQueue;
      this.MAX_CAPACITY = size;
   }
 
   @Override
   public void run()
   {
      int counter = 0;
      while (true)
      {
    	  System.out.println("counter: while:: " + counter);
         try
         {
             
        	 synchronized (taskQueue)
             {
                if (taskQueue.size() == MAX_CAPACITY)
                {
                   System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
                   taskQueue.notifyAll();
                   taskQueue.wait();
                }
                else
                {
              //  Thread.sleep(1000);
                taskQueue.add(counter);
                System.out.println("Produced: " + counter);
             
               counter++;
                }
             }
         } 
         catch (InterruptedException ex)
         {
            ex.printStackTrace();
         }
      }
   }
}
