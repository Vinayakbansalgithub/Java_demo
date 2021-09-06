package LinkList;

public class RotateaLinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}

	}

	public static void main(String[] args) {
		RotateaLinkedList obj = new RotateaLinkedList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);

		int times = 19;
		int size = obj.size();

		Node res = obj.rotate(times % size);

		System.out.println(res);

	}

	Node rotate(int times) {
		int size = size();
		Node temp = null;

		temp = head;

		for (int j = 0; j < size - times - 1; j++) {

			temp = temp.next;

		}

		head = temp.next;
		temp.next = null;

		Node curr = head;

		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = temp;

		return head;
	}

	int size() {
		int count = 0;
		Node temp = head;
		while (temp != null) {

			temp = temp.next;
			count++;
		}
		return count;
	}

	void add(int i) {
		// TODO Auto-generated method stub

		if (head == null) {
			head = new Node(i);
		} else {

			Node temp = head;
			while (temp.next != null) {

				temp = temp.next;

			}
			temp.next = new Node(i);
		}

	}
}
