package SelFrDemo;

import java.util.List;

class Consumer implements Runnable
{
   private final List<Integer> taskQueue;
 
   public Consumer(List<Integer> sharedQueue)
   {
      this.taskQueue = sharedQueue;
   }
 
   @Override
   public void run()
   {
      while (true)
      {
         try
         {
        	 synchronized (taskQueue)
             {
                if (taskQueue.isEmpty())
                {
                   System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " + taskQueue.size());
                   taskQueue.notifyAll();
                   taskQueue.wait();
                }
                else
                {
           //     Thread.sleep(1000);
                int i = (Integer) taskQueue.remove(0);
                System.out.println("Consumed: " + i);
               // taskQueue.notify();
                }
             }
         } catch (InterruptedException ex)
         {
            ex.printStackTrace();
         }
      }
   }
 
}