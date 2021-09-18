package Questions;

import java.util.HashMap;
import java.util.Map;

//Given a string, determine if a permutation of the string could form a palindrome.
//LeetCode 266.
public class PalindromPermutation {

	public static void main(String[] args) {

		String str = "aabcbaa";
		int count = 0;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char j = 0; j < str.length(); j++) {

			if (map.containsKey(str.charAt(j))) {
				map.put(str.charAt(j), map.get(str.charAt(j)) + 1);
			} else {
				map.put(str.charAt(j), 1);
			}

		}

		for (Character key : map.keySet()) {
			if (map.get(key) % 2 == 1)
				count++;
		}

		if (count > 1) {
			System.out.println("it can not form palindrom string");

		} else
			System.out.println("it can form palindrom");
	}

}
