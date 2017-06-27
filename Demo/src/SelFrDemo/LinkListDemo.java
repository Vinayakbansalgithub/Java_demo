/*package SelFrDemo;


class Node {
	StackNode next;

	Object data;
	
	public StackNode getNext() {
		return next;
	}

	public void setNext(StackNode next) {
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node(Object dataValue) {
		next = null;
		data = dataValue;
	}

}

public class LinkListDemo {
	StackNode head;

	public StackNode getHead() {
		return head;
	}

	public void setHead(StackNode head) {
		this.head = head;
	}

	LinkListDemo add(LinkListDemo linkedList, Object i) {
		StackNode head = linkedList.getHead();
		StackNode current = new StackNode(i);
		// TODO Auto-generated method stub
		if (head == null) {

			head = current;
			linkedList.setHead(head);
			return linkedList;
		}
		
		StackNode temp= head;
		while(temp.next !=null){
			
			temp = temp.next;
			
		}
		
		StackNode newNode = new StackNode(i);
		temp.setNext(newNode);
		newNode.setNext(null);
		linkedList.setHead(head);
		return linkedList;
		
	}

	public static void main(String[] args) {
		LinkListDemo obj = new LinkListDemo();
		LinkListDemo h1 = obj.add(obj, 1);
		StackNode n1 = h1.getHead();
		while(n1!=null){
			System.out.println(n1.getData());
			n1 = n1.getNext();
		}
		
		LinkListDemo h2 = obj.add(obj, 5);
		StackNode n2 = h2.getHead();
		while(n2!=null){
			System.out.println(n2.getData());
			n2 = n2.getNext();
		}

	}

}
*/