package LinkList;
class Cnode {
	int data;
	Cnode next,random;

	public Cnode(int i) {
		// TODO Auto-generated constructor stub

		data = i;
		next = null;
		random =null;

	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Cnode getNext() {
		return next;
	}

	public void setNext(Cnode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "HNode [data=" + data + ", next=" + next + ", random=" + random+ "]";
	}

}
public class CloneLinklistRandom {
	
	Cnode head;

	public Cnode getHead() {
		return head;
	}

	public void setHead(Cnode head) {
		this.head = head;
	}

	Cnode add(int i) {
		// TODO Auto-generated method stub
		if (head == null) {
			head = new Cnode(i);
			// System.out.println("head value is  "+head);
			return head;

		}
		Cnode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Cnode(i);
		return temp.next;

	}
	
	public static void main(String[] args) {
		CloneLinklistRandom obj = new CloneLinklistRandom();

		Cnode a1 = obj.add(1);
		Cnode a2 = obj.add(2);
		Cnode a3 = obj.add(3);
		Cnode a4 = obj.add(4);
		Cnode a5 = obj.add(5);
		
		
		Cnode original=obj.getHead();
		
		a1.random=a3;
		a2.random=a1;
		a3.random=a5;
		a4.random=a2;
		a5.random=a4;
		
		
		
		CloneLinklistRandom obj2 = new CloneLinklistRandom();

		Cnode c1 = obj2.add(1);
		Cnode c2 = obj2.add(2);
		Cnode c3 = obj2.add(3);
		Cnode c4 = obj2.add(4);
		Cnode c5 = obj2.add(5);
		
		
		Cnode clone=obj2.getHead();
		
		
		Cnode p=original;
		Cnode q=clone;
		
		while(q!=null){
			Cnode nextstore=p.next;
			p.next=q;
			p=nextstore;
			q=q.next;
			
		}
		p=obj.getHead();
		q=clone;
		while(q!=null){
			Cnode nextstore=p.next;
			q.random=p;
			q=q.next;
			p=p.next;
			
		}
		
		q=clone;
		while(q.next!=null){
			
			q.random=q.random.random.next;
			q=q.next;
		}
		
		
		while(clone!=null){
			System.out.println(" value is  "+clone.random.data);
			clone=clone.next;
		}
		

	
	
	}}
