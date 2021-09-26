package dp;

public class EqualSumPartition {

	static boolean[][] dp;

	public static void main(String[] args) {

		int num[] = new int[] { 1, 5, 11, 5 };
		boolean res = isEqualSumPartition(num, num.length);
		System.out.println(res);

	}

	static boolean isEqualSumPartition(int[] num, int length) {

		int cursum = 0;
		for (int i = 0; i < length; i++) {
			cursum += num[i];
		}

		if (cursum % 2 == 1)
			return false;
		else {
			return isSubSetSum(num, length, cursum / 2);
		}

	}

	static boolean isSubSetSum(int[] num, int length, int sum) {

		dp = new boolean[num.length + 1][sum + 1];

		for (int i = 0; i <= length; i++) {

			for (int j = 0; j <= sum; j++) {

				if (i == 0 && j == 0) {
					dp[i][j] = true;
				}
				// no player, not possible to make score
				else if (i == 0) {
					dp[i][j] = false;
				}
				// np run req
				else if (j == 0) {
					dp[i][j] = true;
				}
				// i make j runs
				else if (i == j) {
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

						} else {
							dp[i][j] = false;
						}
					}

				}

			}
		}
		return dp[length][sum];
	}

}
