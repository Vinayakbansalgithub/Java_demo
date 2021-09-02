package ArrayQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class ActivitySelectionProblem {
	public static void main(String[] args) {

		int intervel[][] = { { 1, 2 }, { 3, 4 }, { 0, 6 }, { 5, 7 }, { 8, 9 }, { 5, 9 } };

		int n = intervel.length;

		Stack<int[]> result = nonOverlappinIntervals(intervel, n);

		for (int i = 0; i < result.size(); i++)
			System.out.println(result.get(i)[0] + " ======= " + result.get(i)[1]);
	}

	private static Stack<int[]> nonOverlappinIntervals(int[][] intervel, int n) {
		// TODO Auto-generated method stub

		Arrays.sort(intervel, Comparator.comparingInt(a -> a[1]));

		Stack<int[]> stack = new Stack<int[]>();

		stack.add(intervel[0]);

		for (int i = 1; i < intervel.length; i++) {

			int[] prev = stack.peek();
			int[] curr = intervel[i];

			if (prev[1] < curr[0]) {
				stack.add(intervel[i]);
			}

		}

		return stack;

	}
}
