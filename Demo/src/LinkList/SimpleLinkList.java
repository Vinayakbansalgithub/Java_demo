package LinkList;

public class SimpleLinkList {

	private class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
			next = null;
		}
	}

	private static Node head;
	private static Node tail;

	void add(int value) {
		if (head == null) {
			head = new Node(value);
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = new Node(value);
			tail = temp.next;
		}
	}

	void addAt(int value, int index) {
		int count = 1;
		Node temp = head;
		while (count != index) {
			temp = temp.next;
			count++;
		}
		Node nextValue = temp.next;
		temp.next = new Node(value);
		temp.next.next = nextValue;

	}

	private void delete(int index) {
		// TODO Auto-generated method stub
		int count = 1;
		Node temp = head;
		while (count != index) {
			temp = temp.next;
			count++;
		}
		temp.next = temp.next.next;

	}

	void reverse() {
		// TODO Auto-generated method stub

		Node prev = null;
		Node current = head;
		Node next = current.next;

		while (next != null) {
			Node temp;
			current.next = prev;
			temp = next.next;
			next.next = current;
			prev = current;
			current = next;
			next = temp;
		}
		while (current != null) {

			System.out.println(current.value);
			current = current.next;
		}

	}

	private void reverseData(int size) {
		int left = 0;
		int right = size - 1;
		while (left < right) {
			Node l = getNodeAt(left);
			Node r = getNodeAt(right);
			
			int temp = r.value;
			r.value = l.value;
			l.value = temp;
			
			left++;
			right--;

		}
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	private static void reversePointers(int size) {
		Node prev = head;
		Node current = prev.next;
		while (current != null) {
			Node ahead = current.next;
			current.next = prev;
			prev = current;
			current = ahead;
		}
		Node t = head;
		head = tail;
		tail = t;
		tail.next = null;
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}

	static int size() {
		Node temp = head;
		int size = 0;
		while (temp != null) {
			size += 1;
			temp = temp.next;
		}
		return size;
	}

	static Node getNodeAt(int index) {
		Node temp = head;
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	static void getMid() {
		// TODO Auto-generated method stub

		Node normalSpeed = head;
		Node doubleSpeed = head;
		int index = 0;
		while (doubleSpeed.next != null && doubleSpeed.next.next != null) {

			normalSpeed = normalSpeed.next;
			doubleSpeed = doubleSpeed.next.next;
			index++;
		}

		System.out.println("Index of middle element is " + index);

		System.out.println("Element is " + getNodeAt(index).value);

	}

	public static void main(String[] args) {

		SimpleLinkList obj = new SimpleLinkList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(7);
		// obj.addAt(11, 2);
		// obj.delete(2);

		// obj.reverse();
		obj.reverseData(obj.size());
		reversePointers(obj.size());

		getMid();

//		while (head != null) {
//
//			System.out.println(head.value);
//			head = head.next;
//		}

	}

}
