package LinkList;

class CirNode {
	int data;
	CirNode next;

	public CirNode(int i) {
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

	public CirNode getNext() {
		return next;
	}

	public void setNext(CirNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "CirNode [data=" + data + ", next=" + next + "]";
	}

}

public class CircularLinkList {
	static CirNode head;

	public CirNode getHead() {
		return head;
	}

	public void setHead(CirNode head) {
		this.head = head;
	}

	static int count = 0;

	CirNode add(int i) {
		// TODO Auto-generated method stub
		CirNode temp = head;
		if (temp == null) {

			temp = new CirNode(i);
			temp.next = temp;
			count++;
			head = temp;
			return head;
		}

		else if (temp.data >= i) {
			CirNode newNode = new CirNode(i);
			newNode.next = temp;

			while (temp.next != head) {
				temp = temp.next;

			}
			temp.next = newNode;
			head = newNode;
			count++;
			return head;
		}

		else if (temp.data <= i) {

			CirNode newNode = new CirNode(i);
			CirNode nextNode = null;

			while (temp.next != head && temp.next.data < i) {
				temp = temp.next;
				nextNode = temp.next;

			}

			temp.next = newNode;

			newNode.next = nextNode;

			count++;

			// newNode.next= head;
			return head;
		}

		return temp;

		/*
		 * int tempcount = 1; while (tempcount != count) { temp = temp.next;
		 * tempcount++; }
		 * 
		 * CirNode newNode = new CirNode(i); temp.next = newNode; newNode.next = head;
		 * count++; return head;
		 */
	}

	static void printlist(CirNode head) {
		// TODO Auto-generated method stub

		CirNode temp = head;

		do {
			System.out.print(temp.data + "  ");
			temp = temp.next;
		} while (temp != head);

	}

	// divide the linklist in two half
	static void halfCircularLL(CirNode head) {
		// TODO Auto-generated method stub
		CirNode headOne = head;
		CirNode headTwo = head;
		CirNode temp = head;

		// this will work when list is of odd size

		if (count % 2 != 0) {
			while (headTwo.next != head && headOne.next != head) {
				headOne = headOne.next;
				headTwo = headTwo.next.next;

			}

			System.out.println("list one last element  " + headOne.data);
			System.out.println("list two last element  " + headTwo.data);

			CirNode headTwoLast = headTwo;

			headTwo = headOne.next;
			headOne.next = head;

			headOne = head;
			CirNode tempTwo = headTwo;

			while (tempTwo != headTwoLast) {

				tempTwo = tempTwo.next;

			}

			// the variable which has been locally defined will change
			tempTwo.next = headTwo;

			CirNode one = headOne;

			CirNode two = headTwo;

			do {
				System.out.print(one.data + "  ");
				one = one.next;
			} while (one != headOne);

			System.out.print("---------------");
			do {
				System.out.print(two.data + "  ");
				two = two.next;
			} while (two != headTwo);

		}

		else {
			System.out.println("even");

			if (headTwo.next.next == head) {
				headTwo = headTwo.next;
			}

			System.out.println(headTwo);

		}

	}

	public static void main(String[] args) {

		CircularLinkList list = new CircularLinkList();

		list.add(7);
		list.add(4);
		list.add(3);
		list.add(8);
		list.add(10);
		list.add(5);
		list.add(1);
		list.add(9);
		list.add(6);
		list.add(-1);
		list.add(33);
		// list.add(-11);

		printlist(head);
		System.out.println();

		halfCircularLL(head);

	}

}
