package dp;

// https://www.youtube.com/watch?v=XmSOWnL6T_I&ab_channel=Pepcoding
public class CountPalindromicSubstrings {
	public static void main(String[] args) {
		String str = "abcbbc";
		find(str);
	}

	private static void find(String str) {
		// TODO Auto-generated method stub

		// starting at and ending at
		boolean dp[][] = new boolean[str.length()][str.length()];

		int count = 0;

		// base case for single char
		for (int i = 0; i < str.length(); i++) {
			dp[i][i] = true;
			count++;
		}

		// base case for 2 length
		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				dp[i][i + 1] = str.charAt(i) == str.charAt(i + 1);
				count++;
			}
		}

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1]) {
					dp[i][j] = true;
					count++;

				}
			}
		}

		System.out.println("count " + count);

	}
}
