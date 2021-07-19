package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class WordBreakProblem {

	static public boolean wordBreak(String s, String ans, List<String> wordDict) {

		if (s.length() == 0) {
			System.out.println(ans);
			return true;
		}

		for (int i = 0; i < s.length(); i++) {

			String left = s.substring(0, i + 1);
			System.out.println("left =" + left);
			if (wordDict.contains(left)) {
				String right = s.substring(i + 1);
				System.out.println("right =" + right);
				return wordBreak(right, ans + " " + left, wordDict);
			}

		}
		return false;
	}

	public static void main(String[] args) {

		String s = "leetcode";

		List<String> list = new ArrayList<String>();
		list.add("leet");
		list.add("code");
		System.out.println(wordBreak(s, "", list));

	}
}
