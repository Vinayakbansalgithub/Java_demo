package SelFrDemo;

class CircularNode {
	CircularNode next;

	public CircularNode getNext() {
		return next;
	}

	public void setNext(CircularNode next) {
		this.next = next;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	Object value;

	CircularNode(Object value) {
		this.value = value;

		next = null;

	}

}

public class CircularLinkList {
	CircularNode head;
	int firsthash;

	CircularNode add(Object value) {
		// TODO Auto-generated method stub
		CircularNode temp = head;

		if (head == null) {

			CircularNode newNode = new CircularNode(value);
			// first=newNode;
			temp = newNode;
			temp.next = temp;
			head = temp;
			// firsthash= newNode.hashCode();
			// System.out.println("first hash code  "+firsthash);
			return head;
		}

		Object first = head.value;
		CircularNode newnode = new CircularNode(value);
		// while (temp.next.value != first) {
		while (temp.next != head) {
			temp = temp.next;
		}

		temp.next = newnode;
		newnode.next = head;

		/*
		 * current=temp.value; if(temp.next.value!=current){ temp = temp.next;
		 * last=temp;
		 * 
		 * } CircularNode newnode = new CircularNode(value); temp.next =
		 * newnode; last = newnode; //head.next=temp;
		 */

		// Object newHash= newnode.hashCode();
		// System.out.println("first hash code  "+newHash);
		return head;
	}

	private CircularNode addFirst(Object value) {
		// TODO Auto-generated method stub
		CircularNode temp = head;
		if(head==null){
			CircularNode newnode = new CircularNode(value);

			temp = newnode;
			temp.next = temp;
			head = temp;
			// firsthash= newNode.hashCode();
			// System.out.println("first hash code  "+firsthash);
			return head;
			
		}
		CircularNode newnode = new CircularNode(value);

		newnode.next = head;
		while (temp.next != head) {
			temp = temp.next;
		}
		temp.next = newnode;
		head = newnode;

		return head;
	}

	CircularNode addatIndex(int index, int value) {
		// TODO Auto-generated method stub
		CircularNode temp = head;

		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}

		CircularNode nextNode = temp.next;

		CircularNode newNode = new CircularNode(value);
		temp.next = newNode;
		newNode.next = nextNode;

		return head;
	}

	CircularNode deleteFirst() {
		// TODO Auto-generated method stub
		CircularNode temp = head;
		while (temp.next != head) {
			temp = temp.next;
		}
		head = head.next;
		temp.next = head;

		return head;
	}

	CircularNode deleteLast() {
		// TODO Auto-generated method stub
		CircularNode temp = head;
		while (temp.next.next != head) {
			temp = temp.next;
		}
		temp.next = head;

		return head;
	}

	CircularNode deleteatIndex(int index) {
		// TODO Auto-generated method stub
		CircularNode temp = head;
		CircularNode prev = head;
		for (int i = 0; i <= index; i++) {
			if (i == index - 1) {
				prev = temp;
			}
			temp = temp.next;
		}
		CircularNode nextNode = temp;
		prev.next = nextNode;

		return head;
	}

	public static void main(String[] args) {

		CircularLinkList obj = new CircularLinkList();
		CircularNode cn555 = obj.add(16);
		CircularNode cn1 = obj.add(2);
		CircularNode cn2 = obj.add(4);
		CircularNode cn3 = obj.add(6);
		CircularNode cn22 = obj.addFirst(4);
		CircularNode cn33 = obj.addFirst(6);
		CircularNode cn4 = obj.add(8);
		CircularNode cn5 = obj.add(10);
		CircularNode cn55555 = obj.addatIndex(2, 10);
		CircularNode cn333 = obj.add(12);
		CircularNode cn44 = obj.add(14);
		CircularNode cn55 = obj.add(16);
		CircularNode cn444 = obj.addFirst(141);
		CircularNode cn5555 = obj.addFirst(161);
		CircularNode cn44444 = obj.deleteFirst();
		CircularNode cn5555555 = obj.deleteLast();
		CircularNode cn11 = obj.deleteatIndex(3);
		CircularNode cn222 = obj.add(4);
		CircularNode cn6 = obj.add(18);
		CircularNode itr = cn6;
		while (itr.next != null) {
			System.out.println(itr.value);
			itr = itr.next;
		}

	}

}
