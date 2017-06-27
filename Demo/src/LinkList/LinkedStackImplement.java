package LinkList;

/*
 * Java Program to Implement Stack using Linked List
 */
class LStackNode{
	LStackNode next;
	int value;
	LStackNode(int value){
		this.value=value;
		next=null;
	}
	
}

class linkedStackOperations{
	static int top;
	LStackNode head;

	
	static boolean  isEmpty(){
		if(top==0)
		{
			return true;
		}
		else
		return false;
		
	}
	LStackNode push(int value){
		if(isEmpty()){
			
			head= new LStackNode(value);
			head.next=null;
			top=top+1;
			return head;
		}
	
			LStackNode tempNode=head;
			LStackNode newNode= new LStackNode(value);
			newNode.next=tempNode;
			head=newNode;
			top=top+1;
		
		return head;
	
}
	public LStackNode pop() {
		// TODO Auto-generated method stub
		head=head.next;
		top=top-1;
		
		
		
		return head;
		
	}
}
/* Class LinkedStackImplement */
public class LinkedStackImplement {

	public static void main(String[] args) {
		linkedStackOperations ls = new linkedStackOperations();
		LStackNode listt1=ls.push(12);
		LStackNode listt2=	ls.push(5);
		LStackNode listt11=ls.push(121);
		LStackNode listt12=	ls.push(65);
		LStackNode listt14=ls.push(123);
		LStackNode listt25=	ls.push(95);
		LStackNode listt=	ls.push(87);
		while(listt!=null){
			System.out.print(listt.value +" ");
			listt=listt.next;
		}
		System.out.println("");
		System.out.println("top is "+linkedStackOperations.top);
		
		LStackNode pop1=ls.pop();
		while(pop1!=null){
			System.out.print(pop1.value +" ");
			pop1=pop1.next;
		}
		System.out.println("");
		System.out.println("top is "+linkedStackOperations.top);
		
			
		}
		

	}
