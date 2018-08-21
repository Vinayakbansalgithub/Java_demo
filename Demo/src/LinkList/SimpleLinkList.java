package LinkList;

class SimpleNode {

	int value;

	SimpleNode next;

	SimpleNode(int value) {
		this.value = value;
		next = null;

	}

}

public class SimpleLinkList {

	static SimpleNode head;

	void add(int value) {
		// TODO Auto-generated method stub
		if (head == null) {

			head = new SimpleNode(value);

		} else {
			SimpleNode temp = head;
			while (temp.next != null) {
				temp = temp.next;

			}
			temp.next = new SimpleNode(value);

		}

	}

	void addAt(int value, int index) {
		// TODO Auto-generated method stub

		int count = 1;
		SimpleNode temp = head;

		while (count != index) {

			temp = temp.next;

			count++;

		}

		SimpleNode nextValue = temp.next;
		temp.next = new SimpleNode(value);
		temp.next.next = nextValue;

	}

	private void delete(int index) {
		// TODO Auto-generated method stub
		int count = 1;
		SimpleNode temp = head;

		while (count != index) {

			temp = temp.next;

			count++;

		}

		temp.next = temp.next.next;

	}

	void reverse() {
		
		SimpleNode current = head;

		SimpleNode prev=null;
		SimpleNode next=current.next;
		
		
		while(next!=null){
			current.next=prev;
			prev=current;
			current=next;
			next= next.next;
			
			
			
		}
		current.next=prev;
		head=current;
		
		
	}

	public static void main(String[] args) {

		SimpleLinkList obj = new SimpleLinkList();
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		obj.add(6);
		/*obj.add(7);
		obj.addAt(11, 2);
		obj.delete(2);*/

		obj.reverse();

		while (head != null) {

			System.out.println(head.value);
			head = head.next;
		}

	}

}
