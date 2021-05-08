package ArrayQuestions;

public class BuySellStock {

	static void buySell(int[] arr) {

		int buyAt = 0;
		int sellAt = 0;

		int buyAtLow = 0;
		int sellAtTop = 0;

		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			buyAt = arr[i];
			sellAt = arr[i];

			for (int j = i + 1; j < arr.length; j++) {
				int currentPrice = arr[j];

				if (currentPrice > sellAt) {
					sellAt = currentPrice;

				}

			}

			if (max < sellAt - buyAt) {
				max = sellAt - buyAt;
				buyAtLow = buyAt;
				sellAtTop = sellAt;
			}
		}

		System.out.println("buy at" + buyAtLow);
		System.out.println("sell at" + sellAtTop);

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 100, 200, 70, 100, 300, 200, 500 };
		buySell(arr);

	}

}
