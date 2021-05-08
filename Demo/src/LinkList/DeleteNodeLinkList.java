package LinkList;

class DNode {
	int data;
	DNode next;

	public DNode(int i) {
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

	public DNode getNext() {
		return next;
	}

	public void setNext(DNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "HNode [data=" + data + ", next=" + next + "]";
	}

}

public class DeleteNodeLinkList {

	Mnode head;

	public Mnode getHead() {
		return head;
	}

	public void setHead(Mnode head) {
		this.head = head;
	}

	Mnode add(int i) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new Mnode(i);
			// System.out.println("head value is "+head);
			return head;

		}
		Mnode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Mnode(i);
		return head;

	}

	Mnode delete(int value) {
		// TODO Auto-generated method stub

		Mnode temp = head;
		Mnode prev = null;

		while (temp.getData() != value) {
			prev = temp;
			temp = temp.next;

		}
		prev.next = temp.next;
		return head;

	}

	void deleteLast() {
		// TODO Auto-generated method stub
		Mnode temp = head;
		if (temp.next == null) {

			head = null;
		}
		while (temp.next.next != null) {
			temp = temp.next;

		}
		temp.next = null;

	}

	void deleteFirst() {
		// TODO Auto-generated method stub
		head = head.next;

	}

	public static void main(String[] args) {
		DeleteNodeLinkList obj = new DeleteNodeLinkList();

		obj.add(12);
		obj.add(28);

		obj.add(22);
		obj.add(11);
		obj.delete(11);

		obj.add(56);
		obj.delete(28);
		obj.deleteFirst();
		obj.deleteLast();

		obj.add(975);

		Mnode val = obj.getHead();

		while (val != null) {
			System.out.println(" value is  " + val.data);
			val = val.next;
		}
	}

}
