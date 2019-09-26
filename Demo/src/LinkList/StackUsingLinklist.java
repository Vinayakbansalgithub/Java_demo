package LinkList;

class SNode {
	Integer data;
	SNode next;

	public SNode(int i) {
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

	public SNode getNext() {
		return next;
	}

	public void setNext(SNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "SNode [data=" + data + ", next=" + next + "]";
	}

}

public class StackUsingLinklist {

	SNode head;

	public SNode getHead() {
		return head;
	}

	public void setHead(SNode head) {
		this.head = head;
	}

	SNode push(int i) {
		// TODO Auto-generated method stub

		if (head == null) {
			head = new SNode(i);
		}

		else {
			SNode next = new SNode(i);

			next.next = head;
			head = next;
		}
		return head;

	}

	void pop() {
		// TODO Auto-generated method stub
		head = head.next;

	}

	public static void main(String[] args) {
		StackUsingLinklist obj = new StackUsingLinklist();

		SNode node = obj.push(1);
		obj.push(2);

		obj.push(3);
		obj.push(4);
		obj.push(5);

		obj.pop();
		obj.pop();
		obj.pop();

		SNode ptr = obj.getHead();
		while (ptr != null) {
			System.out.println(" value is  " + ptr.data);
			ptr = ptr.next;
		}

	}

}
