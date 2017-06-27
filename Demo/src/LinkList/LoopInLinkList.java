package LinkList;

class LNode {
	int data;
	LNode next;

	public LNode(int i) {
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
			// System.out.println("head value is  "+head);
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
		// TODO Auto-generated method stub

		LNode slow = head, fast = head;

		while (slow != null || fast != null) {

			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return slow;
			}

		}
		return null;

	}

	 static LNode LoopStart(LNode slow, LNode val) {
		// TODO Auto-generated method stub
		 
		 while(slow!=val)
		 {
			 			 
			 slow=slow.next;
			 val=val.next;
			 
		 }
		return slow;
		 
		 

	}

	public static void main(String[] args) {
		LoopInLinkList obj = new LoopInLinkList();

		obj.add(11);
		obj.add(14);

		obj.add(18);

		LNode p = obj.add(22);
		obj.add(19);

		obj.add(18);
		obj.add(17);
		obj.add(22);
		obj.add(55);

		obj.add(9);

		LNode l = obj.add(8);

		l.next = p;
		LNode loopstartNode = null;
		LNode val = obj.getHead();

		LNode slow = IsLoop(val);
		
		if(slow!=null){

			loopstartNode=LoopStart(slow, val);
		}else{
			System.out.println("no loop in list");
		}
	
			System.out.println(" loop start node is  " + loopstartNode.data);
		
	}

}