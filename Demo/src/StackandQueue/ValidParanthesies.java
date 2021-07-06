package StackandQueue;

import java.util.Stack;

public class ValidParanthesies {

	static boolean check(String str) {

		if (str.length() % 2 != 0)
			return false;

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {

				stack.add(str.charAt(i));

			} else if (str.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (str.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (str.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else
				return false;

		}

		return true;
	}

	public static void main(String[] args) {
		String str = "){{([])}}{";
		boolean result = check(str);
		System.out.println(result);
	}
}
