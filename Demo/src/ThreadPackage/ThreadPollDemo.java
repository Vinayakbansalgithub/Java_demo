package ThreadPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

 class WorkerThreadd implements Runnable {
	  
    private String command;
    
    public WorkerThreadd(String s){
        this.command=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
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
        return this.command;
    }
}
public class ThreadPollDemo {
public static void main(String[] args) {
	ThreadPollDemo obj= new ThreadPollDemo();
	ExecutorService execute=  Executors.newFixedThreadPool(10);
for (int i = 0; i < 10; i++) {
	Runnable work= new WorkerThreadd("thread"+i);
	execute.execute(work);
}
execute.shutdown();
while (!execute.isTerminated()) {
}
System.out.println("Finished all threads");
}
}

