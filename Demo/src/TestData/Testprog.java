package TestData;

class DoubleNode {
	int value;
	DoubleNode prev;
	DoubleNode next;

//	@Override
//	public String toString() {
//		return "DoubleNode [value=" + value + ", prev=" + prev + ", next=" + next + "]";
//	}

	public Object getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public DoubleNode getPrev() {

		return prev;
	}

	public DoubleNode getNext() {

		return next;
	}

	public void setprev(DoubleNode prev) {
		this.prev = prev;
	}

	public void setNext(DoubleNode next) {
		this.next = next;
	}

	public DoubleNode(int value) {

		this.value = value;
	}

}

public class Testprog {

	DoubleNode head = null;

	Testprog() {
	}

	@Override
	public String toString() {
		return "Testprog [head=" + head + "]";
	}

	public DoubleNode getHead() {
		return head;
	}

	public void setNext(DoubleNode head) {
		this.head = head;
	}

	DoubleNode add(int value) {

		if (head == null) {
			DoubleNode d1 = new DoubleNode(value);
			head = d1;
			head.next = null;
			head.prev = null;
			return head;

		}

		DoubleNode newNode = new DoubleNode(value);

		DoubleNode temp = head;

		while (temp.next != null) {
			temp = temp.next;

		}

		temp.next = newNode;
		newNode.prev = temp;
		newNode.next = null;

		return head;

	}

	public static int getSize(DoubleNode head) {

		int counter = 0;
		DoubleNode temp = head;

		while (temp.next != null) {
			temp = temp.next;
			counter++;

		}

		return counter;
	}

	public static DoubleNode getLast(DoubleNode head) {

		int counter = 0;
		DoubleNode temp = head;

		while (temp.next != null) {
			temp = temp.next;
			counter++;

		}

		return temp;
	}

	public static void main(String[] args) {

		Testprog obj = new Testprog();
		obj.head = obj.add(10);
		obj.head = obj.add(20);
		obj.head = obj.add(30);
		obj.head = obj.add(40);
		obj.head = obj.add(50);

		System.out.println(obj.head);

		int size = getSize(obj.head);

		int k = 6;
		reverseN(obj.head, k, 0, size);

	}

	static DoubleNode getNodeAt(DoubleNode head, int index, boolean checkNext) {
		DoubleNode temp = head;

		if (checkNext) {
			for (int i = 0; i < index; i++) {
				temp = temp.next;
			}
		} else {
			for (int i = 0; i < index; i++) {
				temp = temp.prev;
			}

		}
		return temp;

	}

	private static void reverseN(DoubleNode node, int k, int start, int end) {
		DoubleNode startNode;
		DoubleNode endNode;

		if (k == end) {
			System.out.println("node: " + node.value);
			return;
		}
		// base
		if (k > end) {
			System.out.println("not possible");
			return;
		}
		// base
		if (k <= 0) {
			System.out.println("not possible k is zero or nagitive");
			return;
		}

		if (start == end) {
			return;
		}

		int mid = (end + start) / 2;

		if (k < mid) {
			startNode = getNodeAt(node, k - 1, true);
			endNode = getNodeAt(node, end - k + 1, true);

		} else {
			DoubleNode lastElement = getLast(node);
			startNode = getNodeAt(lastElement, k - 1, false);
			endNode = getNodeAt(lastElement, end - k + 1, false);
		}

		int tempData = startNode.value;
		startNode.value = endNode.value;
		endNode.value = tempData;

//		System.out.println("start " + startNode.value);
//		System.out.println("end " + endNode.value);

		DoubleNode temp = node;

		for (int i = 0; i <= end; i++) {

			System.out.println("val " + temp.value);
			temp = temp.next;

		}

	}
}
