package ArrayQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeIntervels {
	public static void main(String[] args) {

		// int lectures[][] = { { 5, 10 }, { 0, 30 }, { 15, 20 } };

		int intervel[][] = { { 1, 3 }, { 8, 10 }, { 15, 18 } , { 2, 6 }};

		int n = intervel.length;

		Stack<int[]> result = nonOverlappinIntervals(intervel, n);

		for (int i = 0; i < result.size(); i++)
			System.out.println(result.get(i)[0] + " ======= " + result.get(i)[1]);
	}

	private static Stack<int[]> nonOverlappinIntervals(int[][] intervel, int n) {
		// TODO Auto-generated method stub

		Arrays.sort(intervel, Comparator.comparingInt(a -> a[0]));

		Stack<int[]> stack = new Stack<int[]>();

		stack.add(intervel[0]);

		for (int i = 1; i < intervel.length; i++) {

			int[] prev = stack.peek();
			int[] curr = intervel[i];

			if (prev[1] >= curr[0]) {
				prev[1] = curr[1];
			} else {
				stack.add(intervel[i]);
			}

		}

		return stack;

	}
}
