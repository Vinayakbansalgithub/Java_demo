package ThreadPackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SimpleThread implements Executor {
	
	@Override
	public void execute(Runnable command) {
		// TODO Auto-generated method stub
		
		System.out.println("override execute method is called");
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.execute(command);
		
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable runn= new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("ussing anno");
			}
		};
		Thread t1= new Thread(runn);
		t1.start();
		
		
		Thread t2= new Thread(()->System.out.println("lamda with runnable"));
		t2.start();
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Map> future = executorService.submit(()->new HashMap<String,String>());
        System.out.println(future.get().size());
       

        
        new SimpleThread().execute(()->System.out.println("Executor iterface executen method is called"));
        
        executorService.shutdown();

	}

	
}
