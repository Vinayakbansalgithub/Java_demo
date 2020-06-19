package LinkList;

class Anode {
	int data;
	Anode next;

	public Anode(int i) {
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

	public Anode getNext() {
		return next;
	}

	public void setNext(Anode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "HNode [data=" + data + ", next=" + next + "]";
	}

}

public class AddTwoLinkList {

	Anode head;

	public Anode getHead() {
		return head;
	}

	public void setHead(Anode head) {
		this.head = head;
	}

	Anode add(int i) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new Anode(i);
			// System.out.println("head value is  "+head);
			return head;

		}
		Anode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Anode(i);
		return head;

	}

	int findLength(Anode a1) {
		// TODO Auto-generated method stub

		Anode temp = a1;
		int totalnode = 0;

		while (temp != null) {
			temp = temp.next;
			totalnode++;
		}

		return totalnode;
	}

	static Anode addZero(Anode c, int diff) {
		// TODO Auto-generated method stub
		int counter = 0;
		while (counter < diff) {
			Anode newNode = new Anode(0);
			newNode.next = c;
			c = newNode;
			counter++;

		}
		return c;
	}

	static Anode reverse(Anode c) {
		// TODO Auto-generated method stub
		Anode prev = null;
		Anode current = c;
		Anode next = null;

		while (current != null) {

			next = current.next;
			current.next = prev;
			prev = current;

			current = next;

		}

		return prev;
	}
	private static Anode AddLinklist(Anode a1, Anode b1) {
		// TODO Auto-generated method stub
		
		
		Anode p=a1;
		Anode q=b1;
		
		Anode z=null;
		
		int add=0;
		int div=0;
		int remender=0;
		int carry=0;
		
		
		while(p!=null && q!=null){
			
		int pdata=	p.data;
		int qdata=q.data;
		
		add=pdata+qdata;
			add=add+carry;
		div=add/10;
		
		if(div!=0){
			carry=div;
			remender=add%10;
		}
		else{
			remender=add%10;
			carry=0;
		}
		
	
		Anode temp=new Anode(remender);
		if(z==null)
			z=temp;
		
		else{
			
			
			Anode store = z;

			while (store.next != null) {
				store = store.next;
			}
			store.next = new Anode(remender);
		}
		
		
		p=p.next;
		q=q.next;
		}
		
		return z;
		
		
		
	}
	public static void main(String[] args) {
		AddTwoLinkList obj = new AddTwoLinkList();

		Anode a1 = obj.add(1);
		Anode a2 = obj.add(2);
		Anode a3 = obj.add(3);
		Anode a4 = obj.add(4);
		Anode a5 = obj.add(5);

		AddTwoLinkList obj2 = new AddTwoLinkList();

		Anode b1 = obj2.add(9);
		Anode b2 = obj2.add(6);
		Anode b3 = obj2.add(3);

		int lengthlist1 = obj.findLength(a1);
	//	System.out.println("  length of list 1 " + lengthlist1);
		int lengthlist2 = obj.findLength(b1);
		//System.out.println("  length of list 2 " + lengthlist2);

		int difference = Math.abs(lengthlist1 - lengthlist2);
		//System.out.println(difference);

		int i = 0;
		if (lengthlist1 > lengthlist2) {

			b1 = addZero(b1, difference);
		} else
			a1 = addZero(a1, difference);

		a1 = reverse(a1);
		b1 = reverse(b1);
		
	Anode addedList=	AddLinklist(a1,b1);
	addedList = reverse(addedList);
		
	while(addedList!=null){
		System.out.println(" value is  "+addedList.data);
		addedList=addedList.next;
	}
	}

	

}
