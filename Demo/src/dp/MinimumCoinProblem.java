   package dp;


// do from pepcoding

//322. Coin Change


public class MinimumCoinProblem {

	static int[] dp;

	public static void main(String[] args) {

		int coins[] = new int[] { 2,3,5};
		int sum = 7;


		
		
		// here we need not need  permutations but all combinations
		dp = new int[sum + 1];

		dp[0] = 1;

		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j < dp.length; j++) {
				dp[j] += dp[j - coins[i]];
			}

		}

		System.out.println(dp[sum]);

	}

//	static void isSubSetSum(int[] num, int length, int sum) {
//
//		for (int i = 1; i <= length; i++) {
//
//			for (int j = 1; j <= sum; j++) {
//
//				if (num[i - 1] <= j) {
//
//					// ... in unbound insted opf i-1 we use i
//					dp[i][j] = Math.min(dp[i][j - num[i - 1]] + 1, dp[i - 1][j]);
//				} else {
//
//					dp[i][j] = dp[i - 1][j];
//				}
//
//			}
//		}
//
//		System.out.println(dp[length][sum]);
//
//	}

}
