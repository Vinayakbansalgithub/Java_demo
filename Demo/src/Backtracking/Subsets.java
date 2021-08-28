package Backtracking;

import java.util.ArrayList;
import java.util.List;

// leetcode 78
public class Subsets {
	public static void subsets(int[] arr) {
		List<Integer> curr = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<>();
		backtrack(arr, 0, curr, ans);
		System.out.println(ans);

	}

	public static void backtrack(int[] arr, int i, List<Integer> curr, List<List<Integer>> ans) {
		if (i == arr.length) {
			ans.add(new ArrayList<Integer>(curr));
			return;
		}

		// include element in our decision
		curr.add(arr[i]);
		backtrack(arr, i + 1, curr, ans);

		// not include element in our decision
		curr.remove(curr.size() - 1);
		backtrack(arr, i + 1, curr, ans);

	}

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, };
		subsets(num);
	}

	static void PrintSubstring(String ques, String ans) {
		// TODO Auto-generated method stub

		if (ques.length() == 0) {
			System.out.println("=" + ans);
			return;
		}

		char ch = ques.charAt(0);
		PrintSubstring(ques.substring(1), ans + ch);

		PrintSubstring(ques.substring(1), ans + "");

	}
}
