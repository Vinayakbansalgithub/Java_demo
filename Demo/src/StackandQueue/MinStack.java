package StackandQueue;

import java.util.Stack;

//https://www.youtube.com/watch?v=KAH2VlReNKQ&t=391s&ab_channel=ProgrammingTutorials

public class MinStack extends Stack<Integer> {

	static Stack<Integer> minStack1 = new Stack<Integer>();

	int max = -1;

	void push1(int x) {
		super.push(x);
		if (minStack1.isEmpty()) {
			minStack1.push(x);
		} else if (minStack1.peek() > x) {
			minStack1.push(x);
		}
	}

	public Integer pop1() {
		int x = super.pop();
		if (minStack1.peek() == x) {
			minStack1.pop();
		}
		return x;
	}

	static int getMin1() {
		int x = minStack1.pop();
		return x;
	}

	static Stack<Integer> minStack2 = new Stack<Integer>();
	int min = -1;

	void push2(int x) {
		if (minStack2.isEmpty()) {
			minStack2.push(x);
			min = x;
		} else if (x > min) {
			minStack2.push(x);

		} else if (x < min) {
			minStack2.push((2 * x) - min);
			min = x;

		}
	}

	public int pop2() {
		if (minStack2.isEmpty()) {
			return -1;
		} else if (minStack2.peek() >= min) {
			return minStack2.pop();

		} else if (minStack2.peek() < min) {
			int oldmin = min;
			int value = minStack2.pop();
			min = 2 * min - value;
			return oldmin;
		}
		return -1;

	}

	int getMin2() {

		if (minStack2.isEmpty()) {
			return -1;
		}

		return min;

	}

	public static void main(String[] args) {
		MinStack stack = new MinStack();

//		stack.push1(18);
//		stack.push1(19);
//		stack.push1(29);
//		stack.push1(15);
//		stack.push1(16);
//		stack.pop1();
//		stack.pop1();
//
//		int result1 = getMin1();
//		System.out.println(result1);

		// pending Minimum Element in Stack in O(1) Space

		stack.push2(18);
		stack.push2(19);
		stack.push2(29);
		stack.push2(15);
		stack.push2(16);
		stack.pop2();
		stack.pop2();
		stack.pop2();

		int min2 = stack.getMin2();

		System.out.println(min2);

	}

}
