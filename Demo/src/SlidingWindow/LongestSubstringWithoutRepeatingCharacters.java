package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

// leetcode 3
public class LongestSubstringWithoutRepeatingCharacters {

	static void findSubstring(String str) {
		// TODO Auto-generated method stub

		int arrstart = 0;
		int arrend = 0;

		int max = 0;

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		while (arrend < str.length()) {

			if (map.containsKey(str.charAt(arrend))) {
				map.put(str.charAt(arrend), map.get(str.charAt(arrend)) + 1);
			} else {
				map.put(str.charAt(arrend), 1);
			}

			if (map.keySet().size() == arrend - arrstart + 1) {
				if (arrend - arrstart + 1 > max)
					max = arrend - arrstart + 1;
			} else if (map.keySet().size() < arrend - arrstart + 1) {

				while (map.keySet().size() != arrend - arrstart + 1) {

					map.put(str.charAt(arrstart), map.get(str.charAt(arrstart)) - 1);

					if (map.get(str.charAt(arrstart)) == 0) {
						map.remove(str.charAt(arrstart));

					}
					arrstart++;

				}

			}

			arrend++;
		}

		System.out.println(max);

	}

	public static void main(String[] args) {
		String s = "pwwkew";

		findSubstring(s);
	}
}
