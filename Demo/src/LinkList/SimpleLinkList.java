package LinkList;

class SimpleNode {

	int value;

	SimpleNode next;

	SimpleNode(int value) {
		this.value = value;
		next = null;

	}

}

public class SimpleLinkList {

	static SimpleNode head;

	void add(int value) {
		// TODO Auto-generated method stub
		if (head == null) {

			head = new SimpleNode(value);

		} else {
			SimpleNode temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = new SimpleNode(value);

		}

	}

	void addAt(int value, int index) {
		// TODO Auto-generated method stub

		int count = 1;
		SimpleNode temp = head;

		while (count != index) {

			temp = temp.next;

			count++;

		}

		SimpleNode nextValue = temp.next;
		temp.next = new SimpleNode(value);
		temp.next.next = nextValue;

	}

	private void delete(int index) {
		// TODO Auto-generated method stub
		int count = 1;
		SimpleNode temp = head;

		while (count != index) {

			temp = temp.next;

			count++;

		}

		temp.next = temp.next.next;

	}

	void reverse() {
		// TODO Auto-generated method stub

		SimpleNode prev = null;

		SimpleNode current = head;
		SimpleNode next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		head = prev;

	}

	public static void main(String[] args) {

		SimpleLinkList obj = new SimpleLinkList();
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.addAt(11, 2);
		obj.delete(2);

		obj.reverse();

		while (head != null) {

			System.out.println(head.value);
			head = head.next;
		}

	}

}
