package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

class UnderFlowException extends Exception {

	UnderFlowException(String ex) {
		super(ex);
	}

}

class OverFlowException extends Exception {

	OverFlowException(String ex) {
		super(ex);
	}

}

public class StackUsingQueue<T> {

	static Queue<Integer> queue = new LinkedList<Integer>();
	Queue<Integer> tempQueue = new LinkedList<Integer>();

	void enqueue(Integer value) {
		// TODO Auto-generated method stub
		queue.add(value);

	}

	void dequeue() throws Exception {
		// TODO Auto-generated method stub

		if (queue.size() < 1) {
			throw new UnderFlowException("underflow exception");
		}

		while (queue.size() > 1) {

			tempQueue.add(queue.poll());

		}
		System.out.println("value has been pooped " + queue.poll());

		queue = tempQueue;
		tempQueue = new LinkedList<Integer>();

	}

	public static void main(String[] args) throws Exception {
		StackUsingQueue<String> obj = new StackUsingQueue<String>();
		obj.enqueue(1);
		obj.enqueue(2);
		obj.dequeue();

		obj.enqueue(3);
		obj.enqueue(4);
		obj.enqueue(5);

		obj.dequeue();

		obj.enqueue(7);
		obj.enqueue(8);
		obj.dequeue();

		obj.enqueue(9);
		obj.dequeue();

		for (Integer val : queue) {
			System.out.println(val);
		}

	}

}
