package LinkList;

class Inode {
	int data;
	Inode next;

	public Inode(int i) {
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

	public Inode getNext() {
		return next;
	}

	public void setNext(Inode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "HNode [data=" + data + ", next=" + next + "]";
	}

}

public class IntersectionOfTwoLinklist {

	Inode head;

	public Inode getHead() {
		return head;
	}

	public void setHead(Inode head) {
		this.head = head;
	}

	Inode add(int i) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new Inode(i);
			// System.out.println("head value is  "+head);
			return head;

		}
		Inode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Inode(i);
		return head;

	}

	int findLength(Inode a1) {
		// TODO Auto-generated method stub

		Inode temp = a1;
		int totalnode = 0;

		while (temp != null) {
			temp = temp.next;
			totalnode++;
		}

		return totalnode;
	}

	static Inode findIntersection(Inode a1, Inode b1) {
		// TODO Auto-generated method stub

		Inode intesectionNode = null;
		boolean flag = true;
		while (a1 != null && b1 != null) {

			if (a1.data == b1.data) {
				if (flag)
					intesectionNode = a1;

				a1 = a1.next;
				b1 = b1.next;
				flag = false;

			}

			else {
				intesectionNode = null;
				a1 = a1.next;
				b1 = b1.next;
				flag = true;
			}

		}

		return intesectionNode;

	}

	static Inode merge(IntersectionOfTwoLinklist obj,
			IntersectionOfTwoLinklist obj2) {
		// TODO Auto-generated method stub

		Inode p = obj.getHead();
		Inode q = obj2.getHead();
		Inode temp=null;
		if(p.data>q.data){
			temp=q;
			p=q;
		}
		
		else{
			temp=p;
		}
		
		
		while(temp.next!=null ){
			
			if(temp.next.data>q.data){
			Inode data=temp.next;
				temp.next=q;
				q=data;
			
				
			}
			
			else{
			}
			temp=temp.next;
			
			
			
		}
		
		temp.next=q;
		
		return p;
	}

	public static void main(String[] args) {
		IntersectionOfTwoLinklist obj = new IntersectionOfTwoLinklist();

		  Inode a1= obj.add(14);
		  Inode a222= obj.add(23);
		  Inode a11= obj.add(12);
		  Inode a2= obj.add(28);
		  Inode a3= obj.add(22);
		  Inode a4= obj.add(11);
		  Inode a5= obj.add(56);
		  Inode a6= obj.add(975);
		  
		  IntersectionOfTwoLinklist obj2 = new IntersectionOfTwoLinklist();
		  Inode a21= obj2.add(66);
		  Inode a215= obj2.add(22);
		  Inode a22= obj2.add(11);
		  Inode a23= obj2.add(56);
		  Inode a24= obj2.add(975);
		  
		  
		  
		  
		  
		  
		  
		
		/*obj.add(10);
		obj.add(30);
		obj.add(50);
		obj.add(60);

		IntersectionOfTwoLinklist obj2 = new IntersectionOfTwoLinklist();
		obj2.add(20);
		obj2.add(40);
		obj2.add(80);

		Inode val=merge(obj, obj2);
		
		while(val!=null)
		{
			System.out.println("value "+val.data);
			val=val.next;
		}*/

		
		/*  Inode b1= obj2.add(543); Inode b2= obj2.add(23); Inode b3=
		  obj2.add(33); Inode b4= obj2.add(12); Inode b5= obj2.add(28); Inode
		  b6= obj2.add(56); Inode b7= obj2.add(111); Inode b8= obj2.add(56);
		  Inode b9= obj2.add(975);*/
		  
		  int lengthlist1= obj.findLength(a1);
		  System.out.println("  length of list 1 "+lengthlist1); int
		  lengthlist2= obj.findLength(a21);
		  System.out.println("  length of list 2 "+lengthlist2);
		  
		  int difference= Math.abs(lengthlist1-lengthlist2);
		  System.out.println(difference);
		  
		  int i=0; if(lengthlist1>lengthlist2){
		  
		  while(i<difference){ a1=a1.next; i++; } } else{ while(i<difference){
			  a21=a21.next; i++; } }
		  
		  Inode node=findIntersection(a1,a21);
		  
		  System.out.println("intersetion node is  "+node.data);
		  
		 }
		 

	}


