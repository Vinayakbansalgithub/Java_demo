package LinkList;
 

class HNode{
	int data;
	HNode next;
	

	
	public HNode(int i) {
		// TODO Auto-generated constructor stub
		
		data=i;
		next=null;
		
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public HNode getNext() {
		return next;
	}
	public void setNext(HNode next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "HNode [data=" + data + ", next=" + next + "]";
	}
	
	
}


public class LinkListImpl {
	
	HNode head;
	
	
	 public HNode getHead() {
		return head;
	}

	public void setHead(HNode head) {
		this.head = head;
	}

	HNode add(int i) {
		// TODO Auto-generated method stub
		if(head==null)
		{
			head=	new HNode(i);
		//	System.out.println("head value is  "+head);
			return head;
			
		}		
		HNode temp=head;
		
		
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=	new HNode(i);
		return head;
			
		
		
		
		
	}
	
	
	 HNode insertAt(int value, int index) {
		// TODO Auto-generated method stub
		
		 HNode temp=head;
		int counter=0;
		HNode prev=head;
		
		while(counter<index){
			
			prev=temp;
			temp=temp.next;
			counter++;
		}
		 
		HNode newnode=	new HNode(value);
		prev.next=newnode;
		newnode.next=temp;
		
		 return head;
	}
	
	public static void main(String[] args) {
		LinkListImpl obj = new LinkListImpl();
		
		obj.add(12);
		obj.add(28);

		obj.add(22);
		
		obj.add(12);
		obj.add(28);

		obj.add(22);
		obj.insertAt(88,1);
		obj.insertAt(44,3);

		
		
		
		HNode val=obj.getHead();
		
		while(val!=null){
			System.out.println(" value is  "+val.data);
			val=val.next;
		}
	}

	

	
}
