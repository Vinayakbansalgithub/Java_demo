package SelFrDemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {
public static void main(String[] args) {
	Queue<Integer> q= new LinkedList<>();
	for (int i = 0; i < 5; i++) {
		q.add(i);
	}
	System.out.println(q.peek());
System.out.println(q.poll());
System.out.println(q.element());
System.out.println(q.remove());
System.out.println(q.remove(2));

System.out.println(q.element());

}
}
