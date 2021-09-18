package ArrayQuestions;

// leetCode 121,122
public class BuySellStock {

	// single transaction
	static void buySell(int[] arr) {

		// buying price
		int bp = arr[0];
		// overall profit
		int profit = 0;
		// profit if sell today
		int pist = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < bp) {
				bp = arr[i];
			}
			pist = arr[i] - bp;
			if (pist > profit) {
				profit = pist;
			}

		}
		System.out.println("total profit " + profit);
	}

	private static void buySellInfiniteTransactions(int[] arr) {

		// buying date
		int bd = 0;
		// selling date
		int sd = 0;
		int profit = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > arr[sd]) {
				sd++;
			} else {
				profit += arr[sd] - arr[bd];
				bd = i;
				sd = i;
			}

		}
		// for last day
		profit += arr[sd] - arr[bd];
		System.out.println("profit is " + profit);
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 100, 200, 70, 100, 300, 200, 500, 100 };
		buySell(arr);

		buySellInfiniteTransactions(arr);

	}

}
