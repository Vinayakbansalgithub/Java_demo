package LinkList;

class Dupnode {
	int data;
	Dupnode next;

	public Dupnode(int i) {
		// TODO Auto-generated constructor stub

		data = i;
		next = null;

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Dupnode getNext() {
		return next;
	}

	public void setNext(Dupnode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "HNode [data=" + data + ", next=" + next + "]";
	}

}

public class RemoveduplicateelementfromsortedLinkedlist {

	static Dupnode head;
	static int totalnode;

	public Dupnode getHead() {
		return head;
	}

	public void setHead(Dupnode head) {
		this.head = head;
	}

	private void removeDup(Dupnode head) {
		// TODO Auto-generated method stub

		Dupnode temp = head;
		Dupnode current = head;
		Dupnode prev = null;
		Dupnode next = current.next;

		while (next != null) {

			while (next != null && current.data == next.data) {

				next = next.next;
			}

			prev = current;

			current = next;

			prev.next = current;

			if (current == null)
				break;

			next = current.next;

		}
		System.out.println("uu" + head);

	}

	Dupnode add(int i) {

		// TODO Auto-generated method stub
		if (head == null) {
			head = new Dupnode(i);
			// System.out.println("head value is "+head);
			return head;

		}
		Dupnode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Dupnode(i);
		return head;

	}

	public static void main(String[] args) {
		RemoveduplicateelementfromsortedLinkedlist obj = new RemoveduplicateelementfromsortedLinkedlist();

		obj.add(1);
		obj.add(2);

		// obj.add(3);
		// obj.add(3);

		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(5);
		obj.add(5);
		// obj.add(6);

		obj.removeDup(head);

	}

}
