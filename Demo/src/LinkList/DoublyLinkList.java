package LinkList;

class DoubleNode {
	Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public DoubleNode getPrev() {
		return prev;
	}

	public void setPrev(DoubleNode prev) {
		this.prev = prev;
	}

	public DoubleNode getNext() {
		return next;
	}

	public void setNext(DoubleNode next) {
		this.next = next;
	}

	DoubleNode prev;
	DoubleNode next;

	public DoubleNode(Object value) {
		// TODO Auto-generated constructor
		this.value = value;
		//next=null;
		 //prev=null;
	}

}

public class DoublyLinkList {

	DoubleNode head = null;

	public DoubleNode getHead() {
		return head;
	}

	public void setHead(DoubleNode head) {
		this.head = head;
	}

	DoubleNode add(Object value) {
		// TODO Auto-generated method stub
		if (head == null) {
			DoubleNode n1 = new DoubleNode(value);
			head = n1;
			head.prev=null;
			head.next=null;
			return head;
		}
		DoubleNode temp = head;
	
	
		DoubleNode newNode = new DoubleNode(value);
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
		newNode.next = null;

		return head;
	}

	DoubleNode addFirst(Object value) {
		// TODO Auto-generated method stub
		DoubleNode temp = head;
		DoubleNode newNode = new DoubleNode(value);
		newNode.next = temp;
		temp.prev = newNode;
		temp = newNode;
		head = temp;

		return head;
	}

	DoubleNode addatIndex(int index, Object value) {
		// TODO Auto-generated method stub
		DoubleNode temp = head;
		DoubleNode nextNode = null;

		if (index == 0) {
			DoubleNode newNode = new DoubleNode(value);
			newNode.next = temp;
			temp.prev = newNode;
			temp = newNode;
			head = temp;

			return head;
		}

		for (int j = 1; j < index; j++) {
			temp = temp.next;
		}
		if (temp.next == null) {
			System.out.println("there is no index  " + index
					+ "  so placeing value " + value
					+ " at current last place ");
			DoubleNode newNode = new DoubleNode(value);
			temp.next = newNode;
			newNode.prev = temp;
			newNode.next = null;

			return head;

		}

		nextNode = temp.next;
		DoubleNode newNode = new DoubleNode(value);
		temp.next = newNode;
		newNode.next = nextNode;
		newNode = nextNode.prev;

		head = temp;

		return head;
	}

	DoubleNode deleteFirst() {
		// TODO Auto-generated method stub
		DoubleNode temp = head;
		temp = temp.next;
		head = temp;

		return head;
	}

	DoubleNode deleteLast() {
		// TODO Auto-generated method stub
		DoubleNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp = temp.prev;
		temp.next = null;

		return head;
	}

	DoubleNode deleteatIndex(int index) {
		// TODO Auto-generated method stub
		DoubleNode temp = head;
		DoubleNode nextNode = null;

		for (int i = 0; i < index; i++) {
			temp = temp.next;

		}

		nextNode = temp.next;
		temp = temp.prev;
		temp.next = nextNode;
		nextNode.prev = temp;
		return head;
	}
	 int search(Object value) {
		// TODO Auto-generated method stub
		DoubleNode temp=head;
		int counter=0;
		
		 while(temp!=null){
			if(temp.value!=value){
			 temp=temp.next;

			 counter++;
			} 
		 }
		
		 return counter;
	}
	 
	 private void getMiddleusingPointer() {
			// TODO Auto-generated method stub
		 
			DoubleNode fastpointer = head;
			DoubleNode temp = head;

			DoubleNode slowpointer = head;
			
			while(temp.next!=null){
			temp=	temp.next;
			}
			slowpointer=temp;
		 
		/*	while(first!=last)
			{
				first=first.next;
				last=last.prev;
				
			}*/
			
			while(fastpointer!=null && fastpointer.next!=null ){
				
				fastpointer=fastpointer.next.next;
				slowpointer=slowpointer.prev;
				
			}
			
			System.out.println("middle node is "+slowpointer.getValue());
			
			
			
			
			
		}

	public static void main(String[] args) {
		DoublyLinkList obj = new DoublyLinkList();
		DoubleNode dn1 = obj.add(3);
		DoubleNode dn2 = obj.add(5);
	//	DoubleNode dn3 = obj.add(71);
		DoubleNode dn11 = obj.add(30);
		DoubleNode dn21 = obj.add(65);
		DoubleNode dn31 = obj.add(67);
		obj.getMiddleusingPointer();
		
		
		DoubleNode dn22 = obj.addatIndex(1, 51);
		DoubleNode dn222 = obj.deleteFirst();
		DoubleNode dn2222 = obj.deleteFirst();
		DoubleNode dn33 = obj.addatIndex(2, 78);
		DoubleNode dn4 = obj.add(9);
		DoubleNode dn444 = obj.deleteatIndex(2);
		DoubleNode dn5 = obj.add(11);
		DoubleNode dn55 = obj.deleteLast();
		DoubleNode dn5555 = obj.deleteLast();
		DoubleNode dn44 = obj.addFirst(91);
		DoubleNode dn555 = obj.addFirst(111);
		int dn55555 = obj.search(13);
		System.out.println("found at index "+dn55555);
		DoubleNode dn6 = obj.add(13);
		
		
		DoubleNode itr = dn6;

		while (itr != null) {
			System.out.println(itr.value);
			itr = itr.next;

		}

	}

	

	

}
