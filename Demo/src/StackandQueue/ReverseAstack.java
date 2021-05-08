package StackandQueue;

import java.util.Stack;

public class ReverseAstack {

	static Stack<Integer> stack = new Stack<Integer>();

	public static void main(String[] args) {
		ReverseAstack obj = new ReverseAstack();
		obj.stack.add(1);
		obj.stack.add(2);
		obj.stack.add(3);
		obj.stack.add(4);

		System.out.println(obj.stack);

		System.out.println();
		reverse(obj.stack);

		System.out.println(obj.stack);

	}
	
	
	static void insert_at_bottom(int x) 
    { 
		
		
		if(stack.isEmpty()) {
			stack.add(x);
		}else {
			
			int data = stack.peek();
			stack.pop();
			insert_at_bottom(x);
			stack.add(data);
			
		}
		
		
  
       
    } 

	private static void reverse(Stack<Integer> stack) {
		// TODO Auto-generated method stub

		if (stack.isEmpty()) {
			return ;

		}

		int data = stack.peek();
		


		stack.pop();
		reverse(stack);

		insert_at_bottom(data);
		

	}

}
