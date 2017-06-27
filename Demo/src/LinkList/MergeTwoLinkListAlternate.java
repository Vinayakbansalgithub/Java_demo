package LinkList;

class MergeTwoNode {
	Object value;
	MergeTwoNode next;

	MergeTwoNode(Object val) {
		value = val;
		next = null;

	}

	MergeTwoNode() {
		value = null;
		next = null;

	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public MergeTwoNode getNext() {
		return next;
	}

	public void setNext(MergeTwoNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "MergeTwoNode [value=" + value + ", next=" + next + "]";
	}

}

public class MergeTwoLinkListAlternate {
	MergeTwoNode head;
	static int totalnode;

	public MergeTwoNode getHead() {
		return head;
	}

	public void setHead(MergeTwoNode head) {
		this.head = head;
	}

	MergeTwoNode add(int i) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new MergeTwoNode(i);
			// System.out.println("head value is  "+head);
			return head;

		}
		MergeTwoNode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new MergeTwoNode(i);
		return head;

	}

	static void mergeTwoList(MergeTwoNode l1, MergeTwoNode l2) {
		// TODO Auto-generated method stub
		MergeTwoNode Ahead = l1;

		MergeTwoNode Bhead = l2;
		MergeTwoNode Anext;
		MergeTwoNode Bnext;
		MergeTwoNode temp=null;
		MergeTwoNode strore;
		while (Ahead != null & Bhead != null) {
			Anext = Ahead.next;
			Bnext = Bhead.next;
			Ahead.next=Bhead;
			Bhead.next=Anext;

		
			Bhead = Bnext;
			Ahead=Anext;

		}
		//Ahead=Bhead;
		while(l1!=null){
			System.out.println(" value is  "+l1.value);
			l1=l1.next;
		}
	}

	
	 static void mergeTwoListAlter(MergeTwoNode l1, MergeTwoNode l2) {
		// TODO Auto-generated method stub
		
		 MergeTwoNode temp=l1;
		 MergeTwoNode q=l2;
		while(temp!=null){
			MergeTwoNode data=temp.next;
			temp.next=q;
			temp=temp.next;
			q=data;
		}
		
		while(l1!=null){
			System.out.println(" value is  "+l1.value);
			l1=l1.next;
		}
	}

	
	
	public static void main(String[] args) {
		MergeTwoLinkListAlternate list1 = new MergeTwoLinkListAlternate();
		MergeTwoNode l1 = list1.add(9);
		list1.add(7);
		list1.add(6);
		list1.add(87);

		MergeTwoLinkListAlternate list2 = new MergeTwoLinkListAlternate();
		MergeTwoNode l2 = list2.add(2);
		list2.add(55);
		list2.add(5);
		list2.add(654);
		//list2.add(3);

		//mergeTwoList(l1, l2);
		
		mergeTwoListAlter(l1,l2);
	}

	
}
