package LinkList;
class QNode {
	Object value;
	QNode next;
	public String data;

	QNode(Object val) {
		value = val;
		next = null;

	}

	QNode() {
		value = null;
		next = null;

	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public QNode getNext() {
		return next;
	}

	public void setNext(QNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "QNode [value=" + value + ", next=" + next + "]";
	}

}
public class QueueUsingLinklist {

	QNode head;
	static int totalnode;

	public QNode getHead() {
		return head;
	}

	public void setHead(QNode head) {
		this.head = head;
	}

	QNode enque(int i) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new QNode(i);
			// System.out.println("head value is  "+head);
			return head;

		}
		QNode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new QNode(i);
		return head;

	}
	
	

	 void deque() {
		// TODO Auto-generated method stub
		head=head.next;
	
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		QueueUsingLinklist obj = new QueueUsingLinklist();
	
		obj.enque(7);
		obj.enque(6);
		obj.enque(87);
		
		obj.deque();

		QNode ptr=obj.getHead();
		while(ptr!=null){
			System.out.println(" value is  "+ptr.value);
			ptr=ptr.next;
		}
		
}
}