package Questions;

import java.util.Arrays;
import java.util.Iterator;

// Pending
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
	}
}
