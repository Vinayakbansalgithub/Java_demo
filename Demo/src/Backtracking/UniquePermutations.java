package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


// leetcode 47
public class UniquePermutations {
	static void permutation(int[] input, HashMap<Integer, Integer> map, List<Integer> curr, List<List<Integer>> res) {

		if (curr.size() == input.length) {
			res.add(new ArrayList(curr));
			return;

		}
		for (int c : map.keySet()) {

			if (map.get(c) > 0) {

				map.put(c, map.get(c) - 1);
				curr.add(c);
				permutation(input, map, curr, res);

				curr.remove(curr.size() - 1);
				map.put(c, map.get(c) + 1);

			}

		}

	}

	public static void main(String[] args) {

		int[] input = { 1, 1, 2 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {

			int ch = input[i];

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);
			}

		}

		List<List<Integer>> res = new ArrayList<>();
		List<Integer> curr = new ArrayList<Integer>();
		permutation(input, map, curr, res);

		System.out.println(res);
	}

}
