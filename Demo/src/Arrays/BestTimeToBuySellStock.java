package Arrays;

// imp question similar has been asking in hacker test
public class BestTimeToBuySellStock {

	// single transaction
	public static int maxProfit(int[] prices) {

		int min = Integer.MAX_VALUE;
		int profit = 0;

		for (int i = 0; i < prices.length; i++) {

			if (min > prices[i]) {
				min = prices[i];
			} else if (profit < prices[i] - min)
				profit = prices[i] - min;

		}

		return profit;
	}

// multiple transaction
	public static int maxProfitMultiple(int[] prices) {

		int profit = 0;

		for (int i = 0; i < prices.length - 1; i++) {

			if (prices[i] < prices[i + 1]) {

				profit += prices[i + 1] - prices[i];

			}
		}
		return profit;
	}

	// https://www.youtube.com/watch?v=37s1_xBiqH0&t=374s&ab_channel=TECHDOSE
	// 2 transaction
	public static int maxProfitTwoTransction(int[] prices) {
		int profit = 0;

		int lMin = prices[0];
		int RMax = prices[prices.length - 1];

		int left[] = new int[prices.length];
		int right[] = new int[prices.length];

		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i - 1], prices[i] - lMin);
			if (prices[i] < lMin)
				lMin = prices[i];
		}

		for (int i = right.length - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], RMax - prices[i]);
			if (prices[i] > RMax)
				RMax = prices[i];
		}

		profit = right[0];

		for (int i = 1; i < prices.length; i++) {

			profit = Math.max(profit, left[i - 1] + right[i]);
		}

		return profit;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(arr));
		System.out.println(maxProfitMultiple(arr));
		System.out.println(maxProfitTwoTransction(arr));

	}
}
