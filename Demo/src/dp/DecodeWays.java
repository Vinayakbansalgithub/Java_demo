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

		rec(str);
		System.out.println("---------");
		return count;

	}

	static void rec(String str) {

		if (str.startsWith("0")) {
			return;
		} else if (str.length() == 1) {
			count++;
			return;
		} else {

			for (int i = 0; i < str.length(); i++) {

				int value = Integer.parseInt(str.substring(0, i + 1));

				System.out.println(value + " call");

				if (value >= 1 && value <= 26) {

					System.out.println(str.substring(i + 1));

					// System.out.println(value);
					rec(str.substring(i + 1));

					System.out.println();
				}

			}

		}

	}

	public static void main(String[] args) {

		// 1234

		Scanner scan = new Scanner(System.in);

		String input = scan.nextLine();
		int res = findRecurssion(input);
		System.out.println(res);
	}

}
