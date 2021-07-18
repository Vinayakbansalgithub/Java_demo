package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {
	static void findSubstring(String str, String key) {
		// TODO Auto-generated method stub

		int arrstart = 0;
		int arrend = 0;

		int min = 999999;

		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int i = 0;
		while (i < key.length()) {

			if (map.containsKey(key.charAt(i))) {
				map.put(key.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(key.charAt(i), 1);
			}
			i++;

		}

		int count = map.size();
		while (arrend < str.length()) {

			if (map.containsKey(str.charAt(arrend))) {
				map.put(str.charAt(arrend), map.get(str.charAt(arrend)) - 1);

				if (map.get(str.charAt(arrend)) == 0)
					count--;

			}

			while (count == 0) {

				if ((arrend - arrstart + 1) < min)
					min = arrend - arrstart + 1;

				if (!map.containsKey(str.charAt(arrstart))) {
					arrstart++;
				} else if (map.containsKey(str.charAt(arrstart)) && map.get(str.charAt(arrstart)) < 0) {
					map.put(str.charAt(arrstart), map.get(str.charAt(arrstart)) + 1);
					arrstart++;
				} else {
					map.put(str.charAt(arrstart), map.get(str.charAt(arrstart)) + 1);
					arrstart++;
					count++;

				}

			}
			arrend++;
		}

		System.out.println(min);

	}

	public static void main(String[] args) {
		String str = "ADOBECODEBANC";
		String key = "ABC";
		findSubstring(str, key);
	}
}
