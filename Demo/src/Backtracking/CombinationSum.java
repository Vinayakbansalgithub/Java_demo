package Backtracking;

import java.util.Stack;

// leetcode 39 40

public class CombinationSum {

	static int[][] dp;

	public static void main(String[] args) {
		int wt[] = new int[] { 2, 3, 6, 7 };
		int W = 7;

		Stack<Integer> stack = new Stack<Integer>();

		sum(wt, 0, W, stack);

		System.out.println("============================");

		int wt2[] = new int[] { 10, 1, 2, 7, 6, 1, 5 };
		int W2 = 8;

		Stack<Integer> stack2 = new Stack<Integer>();

		sum2(wt2, 0, W2, stack2);

	}

	// repeat is allowed
	static void sum(int[] wt, int start, int target, Stack<Integer> stack) {

		if (target == 0) {
			System.out.println(stack);
		}

		if (target < 0) {

			return;
		}

		for (int i = start; i < wt.length; i++) {
			stack.add(wt[i]);
			sum(wt, i, target - wt[i], stack);
			stack.remove(stack.size() - 1);
		}

	}

	// repeat not allowed
	static void sum2(int[] wt, int start, int target, Stack<Integer> stack) {

		if (target == 0) {
			System.out.println(stack);
		}

		if (target < 0) {
			return;
		}

		for (int i = start; i < wt.length; i++) {
			stack.add(wt[i]);
			sum2(wt, i + 1, target - wt[i], stack);
			stack.remove(stack.size() - 1);
		}

	}

}
