package Questions;

import java.util.Arrays;
import java.util.Iterator;

// do from dp
//https://www.youtube.com/watch?v=l_nR5X9VmaI
public class CoinProblem {

	static void profitFun(int[] coins, int size, int total) {

		int amount[] = new int[total + 1];

		amount[0] = 1;
		for (int c = 0; c < size; c++) {
			System.out.println();
			for (int coinValue = coins[c]; coinValue <= total; coinValue++) {

				int temp = amount[coinValue - coins[c]];

				amount[coinValue] = temp + amount[coinValue];
			}

			System.out.println(Arrays.toString(amount));
		}

	}

	public static void main(String[] args) {
		int coin[] = new int[] { 2, 3, 5 };
		int W = 7;
		profitFun(coin, coin.length, W);

		totalWays(coin, coin.length, W);
	}

	static void totalWays(int[] coin, int length, int w) {

		int dp[][] = new int[length + 1][w + 1];

		for (int i = 1; i < length; i++) {
			for (int j = 0; j <= w; j++) {

				if (i == 0 && j == 0) {
					dp[i][j] = 1;
				} else if (j == 0) {
					dp[i][j] = 1;
				} else if (i == 0) {
					dp[i][j] = 0;
				} else if (i > j) {
					dp[i][j] = dp[i - 1][j];

				} else {

					dp[i][j] = dp[i - 1][j] + dp[i - 1][j - coin[i + 1]];

				}

			}
		}

		System.out.println();

	}
}
