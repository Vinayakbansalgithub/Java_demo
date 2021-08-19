package StackandQueue;

import java.util.Stack;

public class LongestValidParanthis {
	public static void main(String[] args) {
		String str = "";
		find(str);
	}

	private static void find(String str) {

		Stack<Character> sChar = new Stack<>();
		Stack<Integer> iChar = new Stack<>();
		iChar.add(-1);
		
		int length=0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '(') {
				sChar.add(str.charAt(i));
				iChar.add(i);
			} else {
				
				if (!sChar.isEmpty() && str.charAt(i) == ')') {
					sChar.pop();
					iChar.pop();
					
					length=Math.max(length, i-iChar.peek());
				}else {
					iChar.add(i);
				}
				
				
			}

		}
		
		
		System.out.println("====="+length);
	}
	
}


