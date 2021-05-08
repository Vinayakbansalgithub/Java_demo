package ThreadPackage;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BlockingQueueImpl {

	private List<Object> queue = new LinkedList();
	// default
	private int limit = 3;

	public BlockingQueueImpl(int limit) {
		this.limit = limit;
	}

	public synchronized void put(Object item) {
		while (this.queue.size() == this.limit) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("adding using"+Thread.currentThread().getName());
		this.queue.add(item);
		System.out.println("added using "+Thread.currentThread().getName());

		if (this.queue.size() == 1) {
			notifyAll();
		}
	}

	public synchronized void take() {
		while (this.queue.size() == 0) {
			System.out.println("need to wait on "+Thread.currentThread().getName());
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		this.queue.remove(0);
		System.out.println("removed using "+Thread.currentThread().getName());

		if (this.queue.size() == 0) {
			notifyAll();
		}

	}

	public static void main(String[] args) {

		BlockingQueueImpl obj = new BlockingQueueImpl(3);

		ExecutorService es = Executors.newCachedThreadPool();

		es.execute(() -> {obj.take();});
		es.execute(() -> {obj.take();});

		es.execute(() -> {obj.put(1);});
		es.execute(() -> {obj.put(1);});

		es.execute(() -> {obj.take();});
		es.execute(() -> {obj.put(1);});
		
		es.execute(() -> {obj.take();});
		es.execute(() -> {obj.put(1);});



	}

}
