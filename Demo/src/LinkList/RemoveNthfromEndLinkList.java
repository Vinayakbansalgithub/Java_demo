package LinkList;

public class RemoveNthfromEndLinkList {

	Node head;

	/* Linked list Node */
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
		RemoveNthfromEndLinkList obj = new RemoveNthfromEndLinkList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);

		System.out.println(obj.head);

//		Node res = obj.removeFromEnd1(2);
//		System.out.println(res);

		Node res = obj.removeFromEnd2(2);
		System.out.println(res);
	}

	Node removeFromEnd2(int n) {

		Node temp = head;

		Node fast = temp;
		Node slow = temp;

		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}

		while (fast.next != null) {
			fast = fast.next;
			slow = slow.next;

		}

		slow.next = slow.next.next;

		return temp;
	}

	Node removeFromEnd(int n) {
		int size = size();
		System.out.println("size is " + size);
		Node temp = head;
		Node prev = null;

		for (int i = 0; i <= size - n; i++) {

			prev = temp;
			temp = temp.next;
		}

		prev.next = temp.next;

		return head;
	}

	int size() {
		int count = 0;
		Node temp = head;
		while (temp.next != null) {

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
