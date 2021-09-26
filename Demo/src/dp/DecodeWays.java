package dp;

import java.util.Scanner;

// 91
public class DecodeWays {

	static int find(String str) {

		int[] dp = new int[str.length()];

		dp[0] = 1;

		for (int i = 1; i < str.length(); i++) {

			if (str.charAt(i - 1) == '0' && str.charAt(i) == '0') {
				dp[i] = 0;
			} else if (str.charAt(i - 1) == '0' && str.charAt(i) != '0') {
				dp[i] = dp[i - 1];
			} else if (str.charAt(i - 1) != '0' && str.charAt(i) == '0') {
				if (str.charAt(i - 1) == '1' || str.charAt(i - 1) == '2') {
					dp[i] = i >= 2 ? dp[i - 2] : 1;
				} else {
					dp[i] = 0;
				}
			} else {
				if (Integer.parseInt(str.substring(i - 1, i + 1)) <= 26) {
					dp[i] = dp[i - 1] + (i >= 2 ? dp[i - 2] : 1);
				} else {
					dp[i] = dp[i - 1];

				}

			}

		}
		return dp[str.length() - 1];

	}

	static int count = 0;

	// easy
	static int findRecurssion(String str) {

		count=helper(str, str.length());
		return count;

	}

	static int helper(String str, int k) {

		if (k == 0) {
			return 1;
		}

		int index = str.length() - k;

		if (str.charAt(index) == '0') {
			return 0;
		}

		int result = helper(str, k - 1);

		if (k >= 2 && Integer.parseInt(str.substring(0, 2)) <= 26) {
			result = result + helper(str, k - 2);

		}
		return result;

	}

	public static void main(String[] args) {

		// 12345

		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		int res = findRecurssion(input);
		System.out.println(res);
	}

}
