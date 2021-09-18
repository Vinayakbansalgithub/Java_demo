package LinkList;
// Add Two Numbers  leetcode 2
class MergeNode {
	int data;
	MergeNode next;

	public MergeNode(int i) {
		data = i;
		next = null;

	}

	public MergeNode() {
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public MergeNode getNext() {
		return next;
	}

	public void setNext(MergeNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "HNode [data=" + data + ", next=" + next + "]";
	}

}

public class AddtwoNumbersLinkList {

	MergeNode head;

	public MergeNode getHead() {
		return head;
	}

	public void setHead(MergeNode head) {
		this.head = head;
	}

	MergeNode add(int i) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new MergeNode(i);
			// System.out.println("head value is "+head);
			return head;

		}
		MergeNode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new MergeNode(i);
		return head;

	}

	static void add(MergeNode a1, MergeNode b1) {
		// TODO Auto-generated method stub

		MergeNode dummy = new MergeNode();
		MergeNode temp = dummy;


		int carry = 0;
		while (a1 != null || b1 != null || carry!=0) {

			int sum = 0;
			sum = sum + carry;

			if (a1 != null) {
				sum += a1.data;
				a1 = a1.next;
			}

			if (b1 != null) {
				sum += b1.data;
				b1 = b1.next;
			}

			MergeNode node = new MergeNode(sum % 10);

			System.out.println(node.data);

			temp.next = node;
			temp=temp.next;
			carry = sum / 10;

		}

		 System.out.println(dummy.next);

	}

	public static void main(String[] args) {
		AddtwoNumbersLinkList obj = new AddtwoNumbersLinkList();

		obj.add(9);
		obj.add(9);
		obj.add(9);
		obj.add(9);
		obj.add(9);
		obj.add(9);
		obj.add(9);

		AddtwoNumbersLinkList obj2 = new AddtwoNumbersLinkList();

		obj2.add(9);
		obj2.add(9);
		obj2.add(9);
		obj2.add(9);

		add(obj.head, obj2.head);

	}

}
