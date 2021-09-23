package LinkList;

import java.util.LinkedList;

// 328. Odd Even Linked List

public class OddEvenLinklist {
	class Inode {
		int data;
		Inode next;

		public Inode(int i) {
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

		public Inode getNext() {
			return next;
		}

		public void setNext(Inode next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return "HNode [data=" + data + ", next=" + next + "]";
		}

	}

	Inode head;

	public Inode getHead() {
		return head;
	}

	public void setHead(Inode head) {
		this.head = head;
	}

	Inode add(int i) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new Inode(i);
			// System.out.println("head value is "+head);
			return head;

		}
		Inode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Inode(i);
		return head;

	}

	public static void main(String[] args) {

		OddEvenLinklist obj = new OddEvenLinklist();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(8);

		LinkedList odd = new LinkedList();
		LinkedList even = new LinkedList();

		Inode temp = obj.head;

		while (temp != null) {

			int value = temp.data;

			if (value % 2 == 0)
				even.add(value);
			else
				odd.add(value);

			temp = temp.next;

		}

		odd.addLast(even);

		System.out.println(odd);

	}

}
