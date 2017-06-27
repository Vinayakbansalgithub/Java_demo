package LinkList;

import java.util.Stack;

class PNode{
	Integer data;
	PNode next;
	

	
	public PNode(int i) {
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
	public PNode getNext() {
		return next;
	}
	public void setNext(PNode next) {
		this.next = next;
	}
	@Override
	public String toString() {
		return "PNode [data=" + data + ", next=" + next + "]";
	}
	
	
}
public class PalindromeLinkList {
	static PNode head;
	
	
	 public PNode getHead() {
		return head;
	}

	public void setHead(PNode head) {
		this.head = head;
	}

	PNode add(int i) {
		// TODO Auto-generated method stub
		if(head==null)
		{
			head=	new PNode(i);
		//	System.out.println("head value is  "+head);
			return head;
			
		}		
		PNode temp=head;
		
		
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=	new PNode(i);
		return head;
			
		
		
		
		
	}
	

	
	private static Boolean isPalindrome(PNode node) {
		Stack<Integer> stack= new Stack<Integer>();
		
		while(node!=null){
			
			
			Integer current=node.data;
		stack.push(current);
		
		node=node.next;
			
			
		}
		PNode compare =head;
		while(compare!=null){
		
			while(compare!=null){
				
				Integer value=compare.data;
				
				if(value==stack.peek())
				{
					stack.pop();
					compare=compare.next;
				}
				else
				return false;
				
				
				
			}
			return true;
			
		}
		
		
		
		
		return null;
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		PalindromeLinkList obj = new PalindromeLinkList();
		
PNode node=obj.add(12);
		obj.add(28);

		obj.add(22);
		obj.add(11);
		obj.add(56);
		obj.add(56);
		obj.add(11);
		obj.add(22);
		obj.add(28);
		obj.add(12);
		obj.add(12);
		boolean pal=isPalindrome(node);
		System.out.println("given linklist is a palindrome  "+pal);
	}

	
}
