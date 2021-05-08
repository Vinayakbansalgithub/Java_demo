package ThreadPackage;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class LoopTask implements Runnable {
    private String taskName;

    public LoopTask(String taskName) {
        super();
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("Starting " + taskName);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Executing " + taskName + " with " + Thread.currentThread().getName() + " => " + i);
        }
        System.out.println("Ending " + taskName);
    }
}
public class CachedThreadPoolMain {
	public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            LoopTask task = new LoopTask("task" + i);
            executorService.submit(task);
        }
        executorService.shutdown();
    }
}
