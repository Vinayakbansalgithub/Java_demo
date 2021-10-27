package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MyTestProgram {
	public static void main(String args[]) {

		int res = find("vinayakbansal", "nasa");
		System.out.println("iiii" + res);
	}

	private static int find(String String1, String String2) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = String2.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);

			} else {

				map.put(ch[i], 1);
			}

		}

		// keysize
		int size = map.size();

		int startIndex = 0;
		int endIndex = 0;

		int min = 99999;

		while (endIndex < String1.length()) {

			if (map.containsKey(String1.charAt(endIndex))) {
				map.put(String1.charAt(endIndex), map.get(String1.charAt(endIndex)) - 1);

				if (map.get(String1.charAt(endIndex)) == 0) {
					size = size - 1;

				}
			}

			while (size == 0) {

				// brackets are missing here (Issue 1)
				if ((endIndex - startIndex + 1) < min) {
					min = endIndex - startIndex + 1;
				}

				if (!map.containsKey(String1.charAt(startIndex))) {
					startIndex++;
				} else if (map.containsKey(String1.charAt(startIndex)) && map.get(String1.charAt(startIndex)) < 0) { // insted
																														// of
																														// contains
																														// i
																														// need
																														// get
																														// (Issue
					map.put(String1.charAt(startIndex), map.get(String1.charAt(startIndex)) + 1); // 2)
					startIndex++;
				} else {
					map.put(String1.charAt(startIndex), map.get(String1.charAt(startIndex)) + 1);

					startIndex++;
					// endIndex++; this should no be here (Issue 3)
					size++;

				}

			}
			// this should be after while loop (Issue 4)
			endIndex++;

		}
		return min;
	}
}
