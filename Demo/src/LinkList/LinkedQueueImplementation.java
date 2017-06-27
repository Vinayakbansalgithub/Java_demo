package LinkList;

class LQNode {
	Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public LQNode getNext() {
		return next;
	}

	public void setNext(LQNode next) {
		this.next = next;
	}

	LQNode next;

	LQNode(Object value) {

		this.value = value;
		next = null;
	}
}

class LinkedQueueOperations {
	static int MAXSIZE = 10;
	int front = 0;
	int rear = 0;

	LQNode head;

	boolean isFull() {
		if (rear == MAXSIZE) {
			return true;
		} else
			return false;
	}

	boolean isEmpty() {
		if (front < 1) {
			return true;
		} else
			return false;
	}

	LQNode enqueue(Object value) {
		// TODO Auto-generated method stub

		if (isEmpty()) {
			if (head == null) {
				head = new LQNode(value);
				head.next = null;
				front = front + 1;
				rear = rear + 1;
				return head;
			}
		} else if (!isFull()) {
			LQNode tempNode = head;
			LQNode newNode = new LQNode(value);
			for (int i = 1; i < rear; i++) {
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
			rear = rear + 1;

		}

		return head;
	}

	 LQNode dequeue() {
		// TODO Auto-generated method stub
		 head=head.next;
		 front=front-1;
		return head;
	}

	public LQNode peek() {
		
		return head;
		
	}
}

public class LinkedQueueImplementation {
	public static void main(String[] args) {
		LinkedQueueOperations lqo = new LinkedQueueOperations();
		LQNode enq1 = lqo.enqueue(50);
		LQNode enq2 = lqo.enqueue(03);
		LQNode enq3 = lqo.enqueue(36);
		LQNode enq4 = lqo.enqueue(893);
		LQNode enq5 = lqo.enqueue(76);
		LQNode enq6 = lqo.enqueue(567);
		LQNode enq7 = lqo.enqueue(11);
		LQNode listt = enq7;
		System.out.println("-----------------------------");
		while (listt != null) {
			System.out.print(listt.value + " ");
			listt = listt.next;
		}
		System.out.println("");
		System.out.println("------------------------------");
		LQNode deq1 = lqo.dequeue();
		LQNode listd = deq1;
		System.out.println("-----------------------------");
		while (listd != null) {
			System.out.print(listd.value + " ");
			listd = listd.next;
		}
		System.out.println("");
		System.out.println("------------------------------");
		LQNode peekElement=lqo.peek();
		System.out.println("peek element is  "+peekElement.value);

	}
	

}
