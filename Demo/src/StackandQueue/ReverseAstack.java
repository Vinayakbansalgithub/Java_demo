package StackandQueue;

import java.util.Stack;

public class ReverseAstack {

	static Stack<Integer> stack = new Stack<Integer>();

	public static void main(String[] args) {
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);

		System.out.println(stack);

		System.out.println();
		reverse(stack);

		System.out.println(stack);

	}

	static void insert_at_bottom(int x) {

		if (stack.isEmpty()) {
			stack.add(x);
		} else {
			int data = stack.peek();
			stack.pop();
			insert_at_bottom(x);
			stack.add(data);
		}

	}

	private static void reverse(Stack<Integer> stack) {
		// TODO Auto-generated method stub

		if (stack.isEmpty()) {
			return;
		}

		int data = stack.peek();

		stack.pop();
		reverse(stack);

		insert_at_bottom(data);

	}

}
