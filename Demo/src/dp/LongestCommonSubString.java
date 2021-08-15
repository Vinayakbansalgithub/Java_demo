package dp;

import java.util.Arrays;

//https://www.youtube.com/watch?v=4Urd0a0BNng&ab_channel=AdityaVermaAdityaVerma

// abc acd
public class LongestCommonSubString {

	static int[][] dp;

	
	
	static int max=0;

	static void getLCSTopDown(String str1, String str2, int l1, int l2) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= l1; i++) {

			for (int j = 1; j <= l2; j++) {

				if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
					
					if(dp[i][j]>max) {
						max=dp[i][j];
					}
				} else {

					dp[i][j] = 0;
				}

			}
		}

		System.out.println(max);

	}

	public static void main(String[] args) {
		String str1 = "GeeksforGeeks";
		String str2 = "GeeksQuiz";
		dp = new int[str1.length() + 1][str2.length() + 1];

//		int res = getLCS(str1, str2, str1.length(), str2.length());
//		System.out.println(res);

		 getLCSTopDown(str1, str2, str1.length(), str2.length());

	}

}
