package ThreadPackage;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueueImpl {

	private List queue = new LinkedList();
	//default
	private int limit = 10;

	public BlockingQueueImpl(int limit) {
		this.limit = limit;
	}

	public synchronized void put(Object item) throws InterruptedException {
		while (this.queue.size() == this.limit) {
			wait();
		}
		this.queue.add(item);
		if (this.queue.size() == 1) {
			notifyAll();
		}
	}

	public synchronized Object take() throws InterruptedException {
		while (this.queue.size() == 0) {
			wait();
		}
		if (this.queue.size() == this.limit) {
			notifyAll();
		}

		return this.queue.remove(0);
	}

	public static void main(String[] args) throws InterruptedException {

		BlockingQueueImpl obj = new BlockingQueueImpl(3);
		obj.put(1);
		obj.put(1);
		obj.put(1);
		System.out.println("====");
		obj.take();
		obj.put(1);
		obj.take();

		obj.put(1);
		System.out.println("====");

	}

}
