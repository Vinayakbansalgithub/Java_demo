package LinkList;

public class MergeTwoSortedLinkedList {
	Node head; // head of list

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
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
		Node result = null;

		if (a.data < b.data) {
			
				result = a;
				result.next = merge(a.next, b);

			

		}

		else {
			
				result = b;
				result.next = merge(a, b.next);

			
		}

		result.next = null;
		return result;
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
		MergeTwoSortedLinkedList L = new MergeTwoSortedLinkedList();

		L.head = L.push(10);
		L.head = L.push(20);
		L.head = L.push(30);
		L.head = L.push(40);

		MergeTwoSortedLinkedList L2 = new MergeTwoSortedLinkedList();

		L2.head = L2.push(25);
		L2.head = L2.push(35);

		
		L.
		L.head = L.merge(L.head, L2.head);

		
		
		System.out.println(L.head);

	}
}
