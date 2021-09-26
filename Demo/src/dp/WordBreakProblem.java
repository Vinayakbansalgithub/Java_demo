package dp;

import java.util.ArrayList;
import java.util.List;


// leetcode 139
public class WordBreakProblem {

	static public boolean wordBreak(String s, String ans, List<String> wordDict) {

		int dp[] = new int[s.length()];

		for (int i = 0; i < s.length(); i++) {

			for (int j = 0; j <= i; j++) {

				String wordToCheck = s.substring(j, i + 1);
				System.out.println("==" + wordToCheck);

				if (wordDict.contains(wordToCheck)) {

					System.out.println("found  " + wordToCheck);

					if (i == 0) {
						dp[i] = 1;
					} else
						dp[i] += dp[j - 1];
				}
			}

			System.out.println("----------------------------------");
		}
		return dp[s.length() - 1] > 0;
	}

	public static void main(String[] args) {

		String s = "ipepcodinglovesmango";

		List<String> list = new ArrayList<String>();
		list.add("i");
		list.add("pep");
		list.add("coding");
		list.add("pepcoding");
		list.add("loves");
		list.add("man");
		list.add("mango");
		System.out.println(wordBreak(s, "", list));

	}
}
