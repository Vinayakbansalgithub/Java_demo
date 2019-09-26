package LinkList;

class RoPairNode {

	int value;

	RoPairNode next;

	RoPairNode(int value) {
		this.value = value;
		next = null;

	}

}

public class RotateNodePairwise {
	static RoPairNode head;

	void add(int value) {
		// TODO Auto-generated method stub
		if (head == null) {

			head = new RoPairNode(value);

		} else {
			RoPairNode temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = new RoPairNode(value);

		}

	}

	public static RoPairNode reverseinpair(RoPairNode head, int k) {

		RoPairNode current = head;
		RoPairNode prev = null;
		RoPairNode next = current.next;

		if (next == null)
			return head;

		int counter = 0;
		while (counter < k && next != null) {

			current.next = prev;
			prev = current;
			current = next;
			next = next.next;
			counter++;

		}

		if (current != null) {
			head.next = reverseinpair(current, 2);

		}

		return prev;

	}

	public static void main(String[] args) {

		RotateNodePairwise obj = new RotateNodePairwise();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(8);
		obj.add(9);

		head = obj.reverseinpair(head, 2);

		while (head != null) {

			System.out.println(head.value);
			head = head.next;
		}
	}
}
