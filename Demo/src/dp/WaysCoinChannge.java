package dp;

//KnapSackProblem variation  unbounded

// 518. Coin Change 2

public class WaysCoinChannge {

	static int[] dp;

	public static void main(String[] args) {

		int coins[] = new int[] { 1, 2, 3 };
		int sum = 4;

		dp = new int[sum + 1];

		dp[0] = 1;

		for (int i = 1; i <= sum; i++) {
			for (int n : coins) {

				if (i >= n) {
					dp[i] += dp[i - n];
				}
			}

		}

		System.out.println(dp[sum]);

	}

}
