package Questions;

import java.util.HashMap;

public class LongestSubStringWithoutRepeating {
	public static void main(String[] args) {
		String data = "geeksforgeeksabcgfds";

		int ans = findWindow(data);
		System.out.println(ans);
	}

	private static int findWindow(String data) {
		// TODO Auto-generated method stub

		HashMap<Character, Integer> dataMap = new HashMap<Character, Integer>();

		int ans = 0;
		int currentMax = 0;
		int i = -1;
		int j = -1;

		while (true) {

			// add
			while (i < data.length()) {

				if (i >= data.length() - 1) {
					break;
				}
				i++;

				char ch = data.charAt(i);

				if (dataMap.containsKey(ch)) {
					dataMap.put(ch, dataMap.get(ch) + 1);
				} else {
					dataMap.put(ch, 1);
				}

				if (dataMap.get(ch) == 2) {
					// break if count is more then 1
					break;
				} else {
					dataMap.put(data.charAt(i), 1);
					currentMax = i - j;
					if (ans < currentMax) {
						ans = currentMax;
					}
				}

			}

			while (j < i) {

				if ((i >= data.length() - 1)) {
					break;
				}

				j++;
				char ch = data.charAt(j);

				dataMap.put(ch, dataMap.get(ch) - 1);

				int rr = dataMap.get(ch);

				System.out.println(rr == 1);

				if (rr == 1) {
					break;
				}

			}

			if (i >= data.length() - 1) {
				break;
			}

		}
		return currentMax;

	}
}
