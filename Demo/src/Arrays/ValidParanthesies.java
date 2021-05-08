package Arrays;

import java.util.Stack;

public class ValidParanthesies {
	
	static boolean check(String str) {
		
		
		if(str.length()%2!=0)
			return false;
		
		
		Stack<Character> stack = new Stack<Character>();
		
	for (int i = 0; i < str.length(); i++) {
		
		if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{'){
			
			stack.add(str.charAt(i));
			
		}
		else if(str.charAt(i)==')' && !stack.isEmpty() && stack.peek()=='(') {stack.pop();}
		else if(str.charAt(i)=='}' && !stack.isEmpty() && stack.peek()=='{') {stack.pop();}
		else if(str.charAt(i)==']' && !stack.isEmpty() && stack.peek()=='[') {stack.pop();}
		else
			return false;
		
		
		
	}
		
		
	return true;
	}
	
public static void main(String[] args) {
	String str="){{([])}}{";
	boolean result = check(str);
	System.out.println(result);
}
}
//
//
//int arr[];
//int top1;
//int top2;
//
//TwoStack(int size) {
//	// TODO Auto-generated constructor stub
//
//	arr = new int[size];
//
//	top1 = -1;
//	top2 = size;
//
//}
//
//void push1(int value) {
//	arr[top1 + 1] = value;
//	top1 = top1 + 1;
//
//}
//
//void push2(int value) {
//
//	arr[top2 - 1] = value;
//	top2 = top2 - 1;
//}
//
//
//
//
//public static void main(String[] args) {
//
////	TwoStack obj = new TwoStack(6);
////	obj.push1(4);
////	obj.push2(5);
////	System.out.println();
//
//	System.out.println("dd");
//
//}

