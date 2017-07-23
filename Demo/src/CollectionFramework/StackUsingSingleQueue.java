package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {
	
	static Queue<Integer> queue= new LinkedList<Integer>();
	
	

 void dequeue() {
	// TODO Auto-generated method stub
	 
	 int size=queue.size();
	 
	 for (int i = 0; i < size-1; i++) {
		 queue.add(queue.poll());
	}
	 
	 System.out.println("pop value  "+queue.poll());
	
}

 void enqueue(int value) {
	// TODO Auto-generated method stub
	 queue.add(value);
}
	
	
	
public static void main(String[] args) {
	StackUsingSingleQueue obj= new StackUsingSingleQueue();
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
