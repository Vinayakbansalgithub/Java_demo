package LinkList;

class SortNode {
	Object value;
	SortNode next;
	//public Node nextNode;

	SortNode(Object val) {
		value = val;
		next = null;

	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public SortNode getNext() {
		return next;
	}

	public void setNext(SortNode next) {
		this.next = next;
	}

}

public class LinklistSort {
	SortNode head;
	int size=0;

	SortNode add(Object val) {
		// TODO Auto-generated method stub
		if (head == null) {
			SortNode SNode = new SortNode(val);
			head = SNode;
			size++;
			return head;
		}
		SortNode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		SortNode newnode = new SortNode(val);
		temp.setNext(newnode);
		newnode.setNext(null);
		size++;
		return head;
	}

	   public void sort() {
		    if (size > 1) {
		        for (int i = 0; i < size; i++ ) {
		            SortNode currentNode = head;
		            SortNode next = head.next;
		            int value1=(int)currentNode.value;
		            int value2= (int)next.value;
		            
		            for (int j = 0; j < size - 1; j++) {
		                if (value1 > value2) {
		                    int temp = (int) currentNode.value;
		                    currentNode.value = next.value;
		                    next.value = temp;
		                } 
		                currentNode = next;
		                next = next.next;                   
		            } 
		        }
		    }
		}
	public static void main(String[] args) {
		LinklistSort objsort = new LinklistSort();
		SortNode nl1 = objsort.add(9);
		SortNode nl2 = objsort.add(71);
		SortNode nl3 = objsort.add(6);
		SortNode nl4 = objsort.add(81);
		SortNode nl5 = objsort.add(2);
		SortNode NodeList = nl5;

		System.out
				.println("--------------------------  sort a link list linklist start ----------------------------------");
		objsort.sort();

		System.out
				.println("--------------------------  sort a link list linklist emds ----------------------------------");

	}

}