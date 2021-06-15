package Questions;

import java.util.HashMap;
import java.util.Iterator;

import SelFrDemo.strictfpDemo;

public class AllStringPermutationsUnique {

	private static void permutation(String str, HashMap<Character, Integer> map, String asf) {

		if (asf.length() == str.length()) {
			System.out.println(asf);
			return;

		}
		for (char c : map.keySet()) {

			if(map.get(c)>0) {
			map.put(c, map.get(c) - 1);

			permutation(str, map, asf + c);
			map.put(c, map.get(c) + 1);
			}

		}

	}

	public static void main(String[] args) {

		String input = "aab";
		int n = input.length();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);

			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);

			} else {
				map.put(ch, 1);
			}

		}

		permutation(input, map, "");
	}

}
