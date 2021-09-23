package LinkList;

// right rotation
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
		obj.add(6);
		int times = 4;
		int size = obj.size();

		Node res = obj.rotate(times % size);

		System.out.println(res);

	}

	Node rotate(int k) {
		if (k == 0)
			return null;

		// Let us understand the below code for example k = 4
		// and list = 10->20->30->40->50->60.
		Node current = head;

		// current will either point to kth or NULL after this
		// loop. current will point to node 40 in the above example
		int count = 1;
		while (count < k && current != null) {
			current = current.next;
			count++;
		}

		// If current is NULL, k is greater than or equal to count
		// of nodes in linked list. Don't change the list in this case
		if (current == null)
			return null;

		// current points to kth node. Store it in a variable.
		// kthNode points to node 40 in the above example
		Node kthNode = current;

		// current will point to last node after this loop
		// current will point to node 60 in the above example
		while (current.next != null)
			current = current.next;

		// Change next of last node to previous head
		// Next of 60 is now changed to node 10

		current.next = head;

		// Change head to (k+1)th node
		// head is now changed to node 50
		head = kthNode.next;

		// change next of kth node to null
		kthNode.next = null;

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
