package dp;

public class KnapSackProblem {

	static int[][] dp;

	public static void main(String[] args) {
		int price[] = new int[] { 60, 100, 120 };
		int wt[] = new int[] { 1, 2, 3 };
		int W = 5;

		dp = new int[wt.length + 1][W + 1];

//		for (int i = 0; i < dp.length; i++) {
//
//			Arrays.fill(dp[i], -1);
//		}
//
//		 System.out.println(profitFun(wt, price, wt.length, W));

		for (int i = 0; i < wt.length ; i++) {

			for (int j = 0; j < W ; j++) {
				if (i == 0 || j == 0) {
					dp[i][j] = 0;
				}
			}
		}

		profitFunTodDown(wt, price, wt.length, W);

	}

	static void profitFunTodDown(int[] wt, int[] price, int length, int w) {

		for (int i = 1; i <= length; i++) {

			for (int j = 1; j <= w; j++) {

				if (wt[i - 1] <= j) {
					dp[i][j] = Math.max(price[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
				} else {

					dp[i][j] = dp[i - 1][j];
				}

			}
		}

		System.out.println(dp[length][w]);

	}

	static int profitFun(int[] wt, int[] price, int size, int w) {

		// base
		if (w == 0 || 0 == size) {
			return 0;
		}

		if (dp[size][w] != -1)
			return dp[size][w];

		if (wt[size - 1] <= w) {
			int i = price[size - 1] + profitFun(wt, price, size - 1, w - wt[size - 1]);
			int e = profitFun(wt, price, size - 1, w);

			dp[size][w] = Math.max(i, e);
			return Math.max(i, e);
		} else {
			int e = profitFun(wt, price, size - 1, w);
			dp[size - 1][w] = e;
			return e;
		}

	}
}

//int price[] = new int[] { 1, 5, 8, 9, 10, 17, 17, 20 };
//
//int wt[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
//int W = 8;