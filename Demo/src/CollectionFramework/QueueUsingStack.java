package CollectionFramework;

import java.util.Stack;

public class QueueUsingStack {
	
static	Stack<Integer> stack= new Stack<Integer>();
	static Stack<Integer> tempstack= new Stack<Integer>();


	 void push(int item) {
		// TODO Auto-generated method stub
		 stack.push(item);
		 

		 
		 
	}
	 
	 
	 private void pop() {
			// TODO Auto-generated method stub
		 
		 
		 if(!tempstack.isEmpty()){
			   System.out.println(tempstack.pop());
			   return;
			  }
		 
		 
		 int size=stack.size();
		 for (int i = 0; i < size; i++) {
			 tempstack.push(stack.pop());			
		}
		 
		 System.out.println("deque value is "+tempstack.pop());
		
		// stack=tempstack;
		 
		}

public static void main(String[] args) {
	
	
	QueueUsingStack obj= new QueueUsingStack();
	obj.push(1);
	obj.push(2);
	obj.push(3);
	obj.push(4);
	obj.push(5);
	obj.push(6);
	obj.pop();

	obj.push(7);
	
	
	obj.pop();

	obj.push(11);
	obj.push(12);
	obj.push(13);
	obj.push(14);
	obj.push(15);
	
	obj.push(114);
	obj.push(115);
	
	obj.pop();
	//obj.pop();
	//obj.pop();
	obj.pop();
	obj.pop();
	
	

	
	
	System.out.println("===========");
	
	for (Integer val : tempstack) {
		System.out.println(val);
	}	
	
	System.out.println("----------------");
	for (Integer val : stack) {
		System.out.println(val);
	}	
}



}
