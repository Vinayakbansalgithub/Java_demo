package ThreadPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

 class WorkerThreadd implements Runnable {
	  
    private String job;
    
    public WorkerThreadd(String s){
        this.job=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+job);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.job;
    }
}
public class ThreadPoolDemo {
public static void main(String[] args) {
	//ThreadPollDemo obj= new ThreadPollDemo();
	ExecutorService pool=  Executors.newFixedThreadPool(3);
for (int i = 0; i < 10; i++) {
	Runnable task= new WorkerThreadd("thread"+i);
	pool.execute(task);
}
pool.shutdown();
while (!pool.isTerminated()) {
}
System.out.println("Finished all threads");
}
}

