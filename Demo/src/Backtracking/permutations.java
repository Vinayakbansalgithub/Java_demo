package Backtracking;

import java.util.ArrayList;
import java.util.List;

// leetcode 46
public class permutations {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, };
		permute(num);
	}

	public static void permute(int[] nums) {

		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

		boolean[] visited = new boolean[nums.length];
		ArrayList<Integer> curr = new ArrayList<Integer>();

		backtrack(res, nums, curr, visited);
		System.out.println(res);
		System.out.println("end");
	}

	static void backtrack(ArrayList<ArrayList<Integer>> res, int[] nums, ArrayList<Integer> curr, boolean[] visited) {
		if (curr.size() == nums.length) {
			res.add(new ArrayList<Integer>(curr));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (visited[i] == false) {
				curr.add(nums[i]);
				visited[i] = true;
				backtrack(res, nums, curr, visited);
				curr.remove(curr.size() - 1);
				visited[i] = false;
			}
		}
	}

	static void PrintPermutations(String str, String asf) {

		if (str.length() == 0) {
			System.out.println(asf);
			return;
		}

		for (int i = 0; i <= str.length() - 1; i++) {

			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			PrintPermutations(ros, asf + ch);
		}

	}

}
