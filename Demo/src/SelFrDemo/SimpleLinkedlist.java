package SelFrDemo;


class Nodee {
	Object value;
	Nodee next;

	Nodee(Object val) {
		value = val;
		next = null;

	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public Nodee getNext() {
		return next;
	}

	public void setNext(Nodee next) {
		this.next = next;
	}

}

public class SimpleLinkedlist {
	Nodee head;

	/*
	 * public Nodee getHead() { return head; }
	 * 
	 * public void setHead(Nodee head) { this.head = head; }
	 */

	Nodee add(Object val) {
		// TODO Auto-generated method stub
		if (head == null) {
			Nodee nodee = new Nodee(val);
			head = nodee;
			return head;
		}
		Nodee temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		Nodee newnode = new Nodee(val);
		temp.setNext(newnode);
		newnode.setNext(null);

		return head;
	}

	Nodee addfirst(Object val) {
		// TODO Auto-generated method stub
		if (head == null) {
			Nodee nodee = new Nodee(val);
			head = nodee;
			return head;
		}
		Nodee temp = head;
		if (head != null) {
			Nodee newnode = new Nodee(val);
			head = newnode;
			head.next = temp;

		}
		return head;
	}

	private Nodee addAtIndex(int index, int value) {
		// TODO Auto-generated method stub

		Nodee temp = head;
		for (int i = 0; i < index; i++) {

			temp = temp.next;
		}

		Nodee newnode = new Nodee(value);
		newnode.next = temp.next;
		temp.next = newnode;
		// newnode.next=head;

		return head;
	}

	Nodee delete(Object value) {
		// TODO Auto-generated method stub
		Nodee temp = head;
		while (temp.next.value != value) {
			temp = temp.next;
		}
		Nodee var = temp.next;
		temp.next = var.next;

		return head;
	}

	private Nodee deleteFirst() {
		// TODO Auto-generated method stub
		head = head.next;
		return head;
	}

	private Nodee deleteLast() {
		// TODO Auto-generated method stub
		Nodee temp = head;

		while (temp.next != null) {
			if (temp.next.next == null) {
				temp.next = null;
				break;
			}
			temp = temp.next;
		}
		return head;
	}

	int searchNode(Object value) {
		int counter = 1;
		Nodee temp = head;

		while (temp.value != value) {
			counter++;
			temp = temp.next;
		}

		// TODO Auto-generated method stub
		return counter;
	}

	Nodee reverse() {

		Nodee current = head;

		Nodee pre = null;
		Nodee temp = null;
		// TODO Auto-generated method stub

		while (current.next != null) {
			temp = current.next;
			current.next = pre;
			pre = current;
			current = temp;
		}
		temp.next = pre;
		head = temp;
		return head;

	}
	Nodee sort(Nodee nodeSort) {
		//Nodee nodeSortlocal=nodeSort ;
		Nodee tempNode=nodeSort;
		Object temp=null;
		//for (int i = 0; i < 20 && nodeSort!=null; i++) {
		for (int i = 6; i >=1; i--) {
			

		for (int j = 0; j <= i; j++) {
			
			Nodee counterNode;
			int val1=(int)nodeSort.value;
			Nodee nextnode=nodeSort.next;
			int val2=(int)nextnode.value;
			if (val1 >  val2) {
				temp = val2;
				Nodee CurrentNext=nodeSort.next.next;
				nextnode.next=nodeSort;
				nextnode.next.next=CurrentNext;
				tempNode.next=nextnode;
				nextnode=tempNode;
				nodeSort=tempNode;
				val2 = val1;
				val1 =  (int) temp;
				
			}
			for (int k = 0; k <= j; k++) {
			nodeSort=nodeSort.next;
			}
			counterNode=nodeSort;
				}	
		
		}
		return nodeSort;
		
		
			
		
	}

	public static void main(String[] args) {
		boolean IsPalindrome = false;
		Object intersection[] = new Object[20];

		SimpleLinkedlist obj = new SimpleLinkedlist();
		Nodee n1 = obj.add(2);
		Nodee n2 = obj.add(21);
		Nodee n3 = obj.add(6);
		Nodee n4 = obj.add(21);
		Nodee n5 = obj.add(1);
		Nodee listone = n5;

		// //////////////////////////////
		SimpleLinkedlist obj2 = new SimpleLinkedlist();
		Nodee nl1 = obj2.add(9);
		Nodee nl2 = obj2.add(71);
		Nodee nl3 = obj2.add(6);
		Nodee nl4 = obj2.add(81);
		Nodee nl5 = obj2.add(2);

		Nodee listTwo = nl5;
		Nodee listTwoInter = nl5;

		System.out
				.println("===================== List two =====================");
		while (listTwo != null) {
			System.out.println(listTwo.getValue());
			listTwo = listTwo.getNext();
		}

		// //////////////////////////////
		/*
		 * Nodee n4 = obj.add(281);Nodee n5 = obj.add(7);Nodee n55
		 * =obj.addAtIndex(3, 72);Nodee n6 = obj.add(77);Nodee n7 =obj.add(11);
		 * Nodee n77 = obj.delete(21);Nodee n71 = obj.add("vinayak");Nodee n8 =
		 * obj.addfirst(24);
		 */
		/*
		 * Nodee n47 = obj.delete(72); Nodee n81 = obj.deleteLast(); Nodee n99 =
		 * obj.deleteFirst(); int n111 = obj.searchNode(77);
		 */
		// System.out.println("value is node " + n111);

		Nodee list = n5;

		/*
		 * while (head != null) { System.out.println(head.getValue()); head =
		 * head.getNext(); }
		 */
		System.out
				.println("===================== List one =====================");
		while (list != null) {
			System.out.println(list.getValue());
			list = list.getNext();
		}

	/*	Nodee rev = obj.reverse();
		Nodee listrev = rev;
		Nodee postrev = listrev;
		System.out.println("============= reverse list of one ===============");
		while (listrev != null) {
			System.out.println(listrev.getValue());
			listrev = listrev.getNext();

		}

		// palindrome check

		if (n5.value == postrev.value) {
			n5 = n5.next;
			postrev = postrev.next;
			IsPalindrome = true;
		} else {
			IsPalindrome = false;
		}

		System.out.println("  list is palindrome " + IsPalindrome);
*/
		/*System.out
				.println("--------------------- intersection of list one and list two  -------------------------");
		int counter = 0;
		Nodee repeat=listTwoInter;
		while (listone != null) {
			listTwoInter=repeat;
			while (listTwoInter != null) {
			if (listone.value == listTwoInter.value) {
				
				intersection[counter] = (int) listone.value;
				counter++;
				listTwoInter = listTwoInter.next;
			}
			else
				listTwoInter = listTwoInter.next;
			
			}
			listone = listone.next;
		}
		for (int i = 0; i < 10; i++)
			System.out.println(" common elements are " + intersection[i]);
		System.out
		.println("--------------------- intersection of list ends  -------------------------");
		*/
		System.out.println("--------------------- Union of list one and list two  -------------------------");
int counter = 0;
Nodee repeat=listTwoInter;
while (listTwoInter!=null) {
	intersection[counter] = (int) listTwoInter.value;
	listTwoInter=listTwoInter.next;
	counter++;
}
int index=0;
/*while(intersection[index]!=(int)listone.value && listone!=null){
	//intersection[counter] = (int) listone.value;
	counter++;
	//index++;
	listone=listone.next;
	
}*/
Object temp=null;
while(listone!=null){
	for (int i = 0; i < intersection.length && intersection[i]!=null; i++) {
		if(listone.value!=intersection[i]){
			temp=listone.value;
			//listone=listone.next;
		}
		else{
			temp=null;
		break;}
	}
	if(temp!=null){
		intersection[counter] =  temp;
		counter++;
	}
	listone=listone.next;
}

for (int i = 0; i < 10 && intersection[i]!=null; i++)
	System.out.println(" common elements are " + intersection[i]);
System.out
.println("--------------------- Union of list ends  -------------------------");
System.out.println("--------------------------  array to linklist  ----------------------------------");
SimpleLinkedlist arrobj=new SimpleLinkedlist();
Nodee arrnode=null;
Nodee arrhead;
for (int i = 0; i < 10 && intersection[i]!=null; i++){
	arrnode=arrobj.add(intersection[i]);
}
Nodee NodeSort=arrnode;
while (arrnode != null) {
	System.out.println(arrnode.getValue());
	arrnode = arrnode.getNext();
}

System.out.println("--------------------------  array to linklist ends ----------------------------------");
System.out.println("--------------------------  sort a link list linklist start ----------------------------------");
SimpleLinkedlist sortobj=new SimpleLinkedlist();
Nodee finalsort=sortobj.sort(NodeSort);
while (finalsort != null) {
	System.out.println(finalsort.getValue());
	finalsort = finalsort.getNext();
}
System.out.println("--------------------------  sort a link list linklist ends ----------------------------------");


}
	}


