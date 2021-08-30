package dp;

import java.util.Arrays;

//https://www.youtube.com/watch?v=4Urd0a0BNng&ab_channel=AdityaVermaAdityaVerma

// abc acd
public class LongestCommonSubString {

	static int[][] dp;

	static int max = 0;

	static void getLCSTopDown(String str1, String str2, int l1, int l2) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= l1; i++) {

			for (int j = 1; j <= l2; j++) {

				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];

					if (dp[i][j] > max) {
						max = dp[i][j];
					}
				} else {

					dp[i][j] = 0;
				}

			}
		}

		System.out.println(max);

	}

	static int maxLength;

	static int getLCS(String str1, String str2, int n1, int n2) {

		// base
		if (n1 == 0 || n2 == 0)
			return 0;

		if (dp[n1][n2] != -1)
			return dp[n1][n2];

		char s1 = str1.charAt(n1 - 1);
		char s2 = str2.charAt(n2 - 1);

		int length = 0;
		if (s1 == s2) {
			length = getLCS(str1, str2, n1 - 1, n2 - 1) + 1;
			dp[n1][n2] = length;

			maxLength = Math.max(length, maxLength);
		} else {
			length = 0;
			dp[n1][n2] = length;

			maxLength = Math.max(length, maxLength);

		}

		return maxLength;
	}

	public static void main(String[] args) {
		String str1 = "GeeksforGeeks";
		String str2 = "Gerkkks";
		dp = new int[str1.length() + 1][str2.length() + 1];

//		for (int i = 0; i < dp.length; i++) {
//			Arrays.fill(dp[i], -1);  
//		}
//
//		int res = getLCS(str1, str2, str1.length(), str2.length());
//		System.out.println(res);

		getLCSTopDown(str1, str2, str1.length(), str2.length());

	}

}
