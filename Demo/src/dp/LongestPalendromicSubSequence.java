package dp;

public class LongestPalendromicSubSequence {
	static int[][] dp;

	public static void main(String[] args) {
		String str = "agbcba";

		StringBuilder input = new StringBuilder();

		input.append(str);
		String strRev = input.reverse().toString();

		dp = new int[str.length() + 1][str.length() + 1];

		getLPSTopDown(str, strRev, str.length(), strRev.length());

	}

	static void getLPSTopDown(String str1, String str2, int l1, int l2) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= l1; i++) {

			for (int j = 1; j <= l2; j++) {

				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {

					dp[i][j] = Integer.max(dp[i][j - 1], dp[i - 1][j]);
				}

			}
		}

		System.out.println(dp[l1][l2]);

	}

}
