package LinkList;

class Rnode {
	int data;
	Rnode next;

	public Rnode(int i) {

		data = i;
		next = null;

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Rnode getNext() {
		return next;
	}

	public void setNext(Rnode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "HNode [data=" + data + ", next=" + next + "]";
	}

}

public class ReverseLinkList {
	Rnode head;

	public Rnode getHead() {
		return head;
	}

	public void setHead(Rnode head) {
		this.head = head;
	}

	Rnode add(int i) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new Rnode(i);
			// System.out.println("head value is "+head);
			return head;

		}
		Rnode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Rnode(i);
		return head;

	}

	void reverse(Rnode a) {
		// TODO Auto-generated method stub
		Rnode prev = null;
		Rnode current = head;
		Rnode next = null;

		while (current != null) {

			next = current.next;
			current.next = prev;
			prev = current;

			current = next;

		}

		while (prev != null) {
			System.out.println(" value is  " + prev.data);
			prev = prev.next;
		}

	}

	public static void main(String[] args) {
		ReverseLinkList obj = new ReverseLinkList();
		Rnode a = obj.add(3);
		obj.add(5);
		obj.add(30);
		obj.add(65);
		obj.add(67);

		// obj.reverseData();
		obj.reversePointers();
	}

	int size() {
		Rnode temp = getHead();

		int counter = 0;

		while (temp.next != null) {

			counter++;

			temp = temp.next;

		}
		return counter;

	}

	Rnode getNodeAt(int index) {
		Rnode temp = getHead();
		for (int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}

	void reverseData() {
		// TODO Auto-generated method stub

		int size = size();
		int start = 0;
		int end = size;

		while (start < end) {

			Rnode left = getNodeAt(start);
			Rnode right = getNodeAt(end);

			int temp = right.data;

			right.data = left.data;
			left.data = temp;

			start++;
			end--;
		}

		Rnode temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}

	}

	// easy
	void reversePointers() {
		// TODO Auto-generated method stub

		Rnode prev = getHead();
		Rnode curr = prev.next;

		while (curr != null) {

			Rnode ahead = curr.next;

			curr.next = prev;
			prev = curr;
			curr = ahead;

		}

	}

}
