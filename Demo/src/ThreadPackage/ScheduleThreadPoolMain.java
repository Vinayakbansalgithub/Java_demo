package ThreadPackage;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class LoopTaskk implements Runnable {
    private String taskName;

    public LoopTaskk(String taskName) {
        super();
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start Time for " + taskName + " " + new Date());
        // Process task here
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " End Time for " + taskName + " " + new Date());
    }
}
public class ScheduleThreadPoolMain {
	 public static void main(String[] args) {
		 
		 
		 //  1 schedule
//	        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
//	        for (int i = 0; i < 3; i++) {
//	            System.out.println("Submitting task" + i + " " + new Date());
//	            LoopTaskk task = new LoopTaskk("task" + i);
//	            executorService.schedule(task, 20, TimeUnit.SECONDS);
//	        }
//	        executorService.shutdown();
//	        
//	        System.out.println("=============");
	        
	        // 2 scheduleAtFixedRate
	        
//	        ScheduledExecutorService executorService1 = Executors.newScheduledThreadPool(3);
//	        for (int i = 0; i < 3; i++) {
//	            System.out.println("Submitting task" + i + " " + new Date());
//	            LoopTaskk task = new LoopTaskk("task" + i);
//	            executorService1.scheduleAtFixedRate(task, 20, 10, TimeUnit.SECONDS);
//	        }
//	        try {
//	            Thread.sleep(30000);
//	        } catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
//	        executorService1.shutdown();
//	        
//	        
//	        System.out.println("=============");
//
//	  
//	        // 3 scheduleAtFixedRate
	        ScheduledExecutorService executorService2 = Executors.newScheduledThreadPool(3);
	        for (int i = 0; i < 3; i++) {
	            System.out.println("Submitting task" + i + " " + new Date());
	            LoopTaskk task = new LoopTaskk("task" + i);
	            executorService2.scheduleWithFixedDelay(task, 20, 10, TimeUnit.SECONDS);
	        }
	        try {
	            Thread.sleep(50000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        executorService2.shutdown();
	        
	    }
}
