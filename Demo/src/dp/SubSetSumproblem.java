
package dp;

//KnapSackProblem variation  0/1

public class SubSetSumproblem {

	static boolean[][] dp;

	public static void main(String[] args) {

		// players score runs
		int num[] = new int[] { 2, 3, 6, 7 };
		// total runs to make
		int sum = 7;

		int count = 0;

		dp = new boolean[num.length + 1][sum + 1];

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < sum; j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = true;
				} else if (i == 0) {
					dp[i][j] = false;
				} else if (j == 0) {
					dp[i][j] = true;
				}
			}
		}

		isSubSetSum(num, num.length, sum);

	}

	static void isSubSetSum(int[] num, int length, int sum) {

		for (int i = 0; i <= length; i++) {

			for (int j = 0; j <= sum; j++) {

				if (i == 0 && j == 0) {
					dp[i][j] = true;
				} else if (i == 0) {
					dp[i][j] = false;
				} else if (j == 0) {
					dp[i][j] = true;
				} else if (i == j) {
					dp[i][j] = true;
				} else {
					// if team before you can make runs then we don't have to bat
					if (dp[i - 1][j] == true) {
						dp[i][j] = true;
					} else {
						int value = num[i - 1];
						// if runs to score is more or equal to a batsman score
						if (j >= value) {
							// j-value represent if i score runs then batsman before me should make runs
							// req-i
							dp[i][j] = dp[i - 1][j - value];

						}
					}

				}

			}
		}
		System.out.println(dp[length][sum]);
	}

}
