package LinkList;

public class PairWiseSwip {
	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	Node pairWiseSwap(Node head) {
		// TODO Auto-generated method stub
		if (head == null || head.next == null) {
			return null;
		}
		Node nextNode = null, current = null, prev = null, nextnextNode = null;
		prev = head;

		current = head.next;
		head = current;

		while (true) {

			Node next = current.next;
			current.next = prev;

			if (next == null || next.next == null) {
				prev.next = next;
				break;
			}

			prev.next = next.next;

			prev = next;

			current = prev.next;

		}
		return head;
	}

	void printList(Node node) {
		// TODO Auto-generated method stub
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {

		System.out.println('a' == (int) 97.0);

		/*
		 * The constructed linked list is: 1->2->3->4->5->6->7
		 */
		PairWiseSwip list = new PairWiseSwip();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);
		list.head.next.next.next.next.next = new Node(6);
		list.head.next.next.next.next.next.next = new Node(7);

		System.out.println("Linked list before calling pairwiseSwap() ");
		list.printList(head);

		Node rt = list.swap(head);

		Node st = list.pairWiseSwap(head);
		System.out.println("");
		System.out.println("Linked list after calling pairwiseSwap() ");
		list.printList(st);
		System.out.println("");

	}

	Node reverse(Node head) {
		// TODO Auto-generated method stub
		Node prev = null;
		Node current = head;
		Node next = head.next;

		while (next != null) {

			current.next = prev;
			prev = current;
			current = next;
			next = next.next;

		}
		current.next = prev;
		prev = current;
		System.out.println(current);

		return null;
	}

	Node swap(Node head) {
		// TODO Auto-generated method stub
		Node prev = null;
		Node current = head;
		Node next = head.next;
		Node nextTonext = head.next.next;

		while (nextTonext != null || nextTonext.next != null) {

			next.next = current;
			current.next = prev;
			prev = next;

			current = nextTonext;
			next = nextTonext.next;
			nextTonext = next.next;

		}

		next.next = current;
		current.next = prev;
		prev = next;
		System.out.println(current);

		return null;

	}
}
