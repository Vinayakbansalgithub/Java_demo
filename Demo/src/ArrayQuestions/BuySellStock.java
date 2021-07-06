package ArrayQuestions;



// leetCode 121,122
public class BuySellStock {

	static void buySell(int[] arr) {

		int lsf = Integer.MAX_VALUE;
		int op = 0;
		int pist = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] < lsf) {
				lsf = arr[i];
			}
			pist = arr[i] - lsf;
			if (pist > op) {
				op = pist;
			}

		}
		System.out.println("total profit " + op);
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 100, 200, 70, 100, 300, 200, 500 };
		buySell(arr);

		buySellInfiniteTransactions(arr);

	}

	private static void buySellInfiniteTransactions(int[] arr) {
		// TODO Auto-generated method stub

		int bd = 0;
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
