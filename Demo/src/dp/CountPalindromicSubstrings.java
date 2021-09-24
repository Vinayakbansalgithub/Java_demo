package dp;

// https://www.youtube.com/watch?v=XmSOWnL6T_I&ab_channel=Pepcoding

// leetcode 5
public class CountPalindromicSubstrings {
	public static void main(String[] args) {
		String str = "forgeeksskeegfor";

		find(str);
	}

	private static void find(String str) {
		// TODO Auto-generated method stub

		// starting at and ending at
		boolean dp[][] = new boolean[str.length()][str.length()];

		int count = 0;

		int longest = 0;

		String longestString = "";

		// base case for single char
		for (int i = 0; i < str.length(); i++) {
			dp[i][i] = true;
			count++;
			longest = 1;
			System.out.println("string " + str.substring(i, i + 1));

		}

		// base case for 2 length
		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				dp[i][i + 1] = str.charAt(i) == str.charAt(i + 1);
				count++;
				longest = 2;
				System.out.println("string " + str.substring(i, i + 2));

			}
		}

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1]) {
					dp[i][j] = true;
					count++;

					int left = i;
					int right = j;
					while (str.charAt(left) == str.charAt(right)) {
						String s = str.substring(left, right + 1);
						System.out.println("string " + s);
						longest = Math.max(longest, str.substring(left, right + 1).length());
						if (longestString.length() < s.length())
							longestString = s;

						left--;
						right++;
					}

				}
			}
		}

		System.out.println("count " + count);
		System.out.println("longest " + longest);
		System.out.println("longestString " + longestString);

	}
}
