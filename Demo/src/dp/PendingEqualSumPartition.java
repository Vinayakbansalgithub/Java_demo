package dp;

//KnapSackProblem variation  0/1
public class PendingEqualSumPartition {

	static boolean[][] dp;

	public static void main(String[] args) {

		int num[] = new int[] { 1, 5, 3 };
		boolean res = isEqualSumPartition(num, num.length);
		System.out.println(res);

	}

	static boolean isEqualSumPartition(int[] num, int length) {

		int cursum = 0;
		for (int i = 0; i < length; i++) {
			cursum += num[i];
		}

		dp = new boolean[num.length + 1][cursum / 2 + 1];

		for (int i = 0; i < num.length; i++) {

			for (int j = 0; j < cursum / 2; j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = true;
				} else if (i == 0) {
					dp[i][j] = false;
				} else if (j == 0) {
					dp[i][j] = true;
				}
			}
		}

		if (cursum % 2 == 0) {
			return isSubSetSum(num, length, cursum / 2);

		} else {
			return false;
		}

	}

	static boolean isSubSetSum(int[] num, int length, int sum) {

		for (int i = 1; i <= length; i++) {

			for (int j = 1; j <= sum; j++) {

				if (num[i - 1] <= j) {
					dp[i][j] = dp[i - 1][j - num[i - 1]] || dp[i - 1][j];
				} else {
					dp[i][j] = dp[i - 1][j];
				}

			}
		}

		return dp[length][sum];

	}

}
