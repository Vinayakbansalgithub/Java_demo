package LinkList;
class Mnode{
	int data;
	Mnode next;
	

	
	public Mnode(int i) {
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
	public Mnode getNext() {
		return next;
	}
	public void setNext(Mnode next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "HNode [data=" + data + ", next=" + next + "]";
	}
	
	
}
public class MiddleOfLinkList {
	
	
	Mnode head;
static	int totalnode;
	
	 public Mnode getHead() {
		return head;
	}

	public void setHead(Mnode head) {
		this.head = head;
	}

	Mnode add(int i) {
		// TODO Auto-generated method stub
		if(head==null)
		{
			head=	new Mnode(i);
		//	System.out.println("head value is  "+head);
			return head;
			
		}		
		Mnode temp=head;
		
		
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=	new Mnode(i);
		return head;
			
		
		
		
		
	}

	private void getTotal() {
		// TODO Auto-generated method stub
		Mnode temp=head;
		while(temp!=null){
			temp=temp.next;
			totalnode++;
		}
		System.out.println("total node   "+totalnode);
	}
	
	
	private void getMiddle() {
		// TODO Auto-generated method stub
	int MiddleNodeindex=	(totalnode-1)/2;
	int i=0;
	
	Mnode temp=head;
	while(i<MiddleNodeindex)
	{
	temp=	temp.next;
		i++;
	}		 

		System.out.println("HNode [data=" + temp.data + ", next=" + temp.next + "]");
		
	}

	
	
	
	
	
	

	
	
	
	public static void main(String[] args) {
		MiddleOfLinkList obj = new MiddleOfLinkList();
		
		obj.add(12);
		obj.add(28);

		obj.add(22);
		obj.add(11);
	

		obj.add(56);
	

		
		obj.add(975);
		
		obj.getTotal();
		obj.getMiddle();
	//	obj.getMiddleUsingTwoPointer();

		
		
		Mnode val=obj.getHead();
		
		while(val!=null){
			System.out.println(" value is  "+val.data);
			val=val.next;
		}
}

	
	

	
	}
