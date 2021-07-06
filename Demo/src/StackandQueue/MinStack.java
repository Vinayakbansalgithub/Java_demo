package StackandQueue;

import java.util.Stack;

public class MinStack extends Stack<Integer> {

	static Stack<Integer> minStack = new Stack<Integer>();

	void push(int x) {
		super.push(x);
		if (minStack.isEmpty()) {
			minStack.push(x);
		} else if (minStack.peek() > x) {
			minStack.push(x);
		}
	}

	public Integer pop() {
		int x = super.pop();
		if (minStack.peek() == x) {
			minStack.pop();
		}
		return x;
	}

	static int getMin() {
		int x = minStack.pop();
		return x;
	}

	public static void main(String[] args) {
		MinStack stack = new MinStack();

		stack.push(18);
		stack.push(19);
		stack.push(29);
		stack.push(15);
		stack.push(16);
		stack.pop();
		stack.pop();

		int result = getMin();
		System.out.println(result);
		
		// pending Minimum Element in Stack in O(1) Space

	}

}
