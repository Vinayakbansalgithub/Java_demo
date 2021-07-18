

package ArrayQuestions;



// leetCode 121,122
public class BuySellStock {

	static void buySell(int[] arr) {

		
		// buying price
		int bp = Integer.MAX_VALUE;
		// overall profit
		int op = 0;
		// profit if sell today
		int pist = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < bp) {
				bp = arr[i];
			}
			pist = arr[i] - bp;
			if (pist > op) {
				op = pist;
			}

		}
		System.out.println("total profit " + op);
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 100, 200, 70, 100, 300, 200, 500 ,100};
		buySell(arr);

		buySellInfiniteTransactions(arr);

	}

	private static void buySellInfiniteTransactions(int[] arr) {
		// TODO Auto-generated method stub

		
		// buying date
		int bd = 0;
		// selling date
		int sd = 0;
		int profit = 0;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] > arr[i - 1]) {
				sd++;
			} else {
				profit += arr[sd] - arr[bd];
				bd = i;
				sd = i;
			}

		}
		profit += arr[sd] - arr[bd];
		System.out.println("profit is " + profit);
	}

}
