package LinkList;

// leetcode 21
public class FlattenLinkedList {
	Node head; // head of list

	/* Linked list Node */
	class Node {
		int data;
		Node next;
		Node right;

		Node(int data) {
			this.data = data;
			next = null;
			right = null;
		}

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + ", right=" + right + "]";
		}

	}

	Node merge(Node a, Node b) {
		// if first linked list is empty then second
		// is the answer
		if (a == null)
			return b;

		// if second linked list is empty then first
		// is the result
		if (b == null)
			return a;

		// compare the data members of the two linked lists
		// and put the larger one in the result

		if (a.data < b.data) {
			a.next = merge(a.next, b);
			return a;
		}

		else {
			b.next = merge(a, b.next);
			return b;
		}

	}

	Node push(int value) {

		if (head == null) {
			Node n = new Node(value);
			head = n;
			head.next = null;
			return head;

		}

		Node newNode = new Node(value);

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;

		}

		temp.next = newNode;
		newNode.next = null;
		return head;

	}

	public static void main(String[] args) {
		FlattenLinkedList L = new FlattenLinkedList();

		L.head = L.push(10);
		L.head = L.push(20);
		L.head = L.push(30);
		L.head = L.push(40);

		FlattenLinkedList L2 = new FlattenLinkedList();

		L2.head = L2.push(25);
		L2.head = L2.push(35);

		FlattenLinkedList L3 = new FlattenLinkedList();

		L3.head = L3.push(125);
		L3.head = L3.push(135);

		L.head.right = L2.head;
		L2.head.right = L3.head;
		FlattenLinkedList LMerge = new FlattenLinkedList();

		Node res = LMerge.merge(L.head, L2.head);

		System.out.println(res);

	}
}
