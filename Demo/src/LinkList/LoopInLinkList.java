package LinkList;

class LNode {
	int data;
	LNode next;

	public LNode(int i) {
		data = i;
		next = null;

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public LNode getNext() {
		return next;
	}

	public void setNext(LNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "LNode [data=" + data + ", next=" + next + "]";
	}

}

public class LoopInLinkList {

	static LNode head;

	public static LNode getHead() {
		return head;
	}

	public void setHead(LNode head) {
		this.head = head;
	}

	LNode add(int i) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new LNode(i);
			// System.out.println("head value is "+head);
			return head;

		}
		LNode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new LNode(i);
		return temp.next;

	}

	static LNode IsLoop(LNode val) {
		LNode slow = head, fast = head;
		while (fast.next != null && fast != null) {
			slow = slow.next;
			fast = fast.next.next;

			System.out.println("slow is " + slow.data + " ==== fast is " + fast.data);
			if (slow == fast) {
				return slow;
			}
		}
		return null;
	}

	static LNode LoopStart(LNode slow, LNode head) {

		LNode value;

		while (slow.next != head.next) {
			slow = slow.next;
			head = head.next;
		}

		value = slow.next;
		slow.next = null;

		System.out.println(" loop remove node is  " + getHead());

		return value;

	}

	public static void main(String[] args) {
		LoopInLinkList obj = new LoopInLinkList();

		obj.add(1);
		obj.add(2);

		obj.add(3);

		LNode p = obj.add(4);
		obj.add(5);

		obj.add(6);
		LNode l = obj.add(7);

		l.next = p;
		LNode loopstartNode = null;
		LNode head = obj.getHead();

		LNode slow = IsLoop(head);

		if (slow == null) {
			System.out.println("no loop found");
			return;
		}

		else
			System.out.println("isloop node " + slow.data);

		if (slow != null) {

			loopstartNode = LoopStart(slow, head);
		} else {
			System.out.println("no loop in list");
		}

		System.out.println(" loop start node is  " + loopstartNode.data);

	}

}
