package dp;


// do from pepcoding

//322. Coin Change


public class MinimumCoinProblem {

	static int[] dp;

	public static void main(String[] args) {

		int num[] = new int[] { 2,3,5};
		int sum = 7;

//		dp = new int[num.length + 1][sum + 1];

//		for (int i = 0; i <= num.length; i++) {
//
//			for (int j = 0; j <= sum; j++) {
//				if (j == 0) {
//					dp[i][j] = 0;
//				} else if (i == 0) {
//					dp[i][j] = Integer.MAX_VALUE - 1;
//				} else if (i == 1) {
//					if (j % num[i - 1] == 0) {
//						dp[i][j] = j / num[i - 1];
//					} else {
//						dp[i][j] = Integer.MAX_VALUE - 1;
//					}
//
//				}
//
//			}
//
//		}
//
//		isSubSetSum(num, num.length, sum);

		dp = new int[sum + 1];

		dp[0] = 1;

		for (int i = 0; i < num.length; i++) {
			for (int j = num[i]; j < dp.length; j++) {
				dp[j] += dp[j - num[i]];
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
