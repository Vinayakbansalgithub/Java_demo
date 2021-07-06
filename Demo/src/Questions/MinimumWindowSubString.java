package Questions;

import java.util.HashMap;

public class MinimumWindowSubString {
	public static void main(String[] args) {
		String data = "ggthisisateststring";
		String find = "tist";

		String ans = findWindow(data, find);
		System.out.println(ans);
	}

	private static String findWindow(String data, String find) {
		// TODO Auto-generated method stub

		HashMap<Character, Integer> dataMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> findMap = new HashMap<Character, Integer>();

		String ans = "";

		for (int i = 0; i < find.length(); i++) {

			if (findMap.containsKey(find.charAt(i))) {
				findMap.put(find.charAt(i), findMap.get(find.charAt(i)) + 1);
			} else {
				findMap.put(find.charAt(i), 1);
			}
		}

		int desiredCount = find.length();
		int matchCount = 0;
		int i = -1;
		int j = -1;

		while (true) {

			while (i < data.length() && matchCount < desiredCount) {

				if (i >= data.length()-1) {
					break;
				}
				i++;
				if (dataMap.containsKey(data.charAt(i))) {
					dataMap.put(data.charAt(i), dataMap.get(data.charAt(i)) + 1);
				} else {
					dataMap.put(data.charAt(i), 1);
				}

				if (dataMap.getOrDefault(data.charAt(i), 0) <= findMap.getOrDefault(data.charAt(i), 0)) {
					matchCount++;
				}

			}

			while (matchCount == desiredCount) {

				if (i >= data.length()-1) {
					break;
				}
				String possibleAnswer = data.substring(j + 1, i + 1);

				if (ans.length() == 0 || possibleAnswer.length() < ans.length()) {
					ans = possibleAnswer;
				}
				j++;
				char ch = data.charAt(j);
				dataMap.put(ch, dataMap.get(ch) - 1);

				if (dataMap.getOrDefault(data.charAt(j), 0) < findMap.getOrDefault(data.charAt(j), 0)) {
					matchCount--;
				}

			}

			if (i >= data.length()-1) {
				break;
			}

		}
		return ans;

	}
}
