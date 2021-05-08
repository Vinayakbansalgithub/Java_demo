package Arrays;

public class ShareMaxProfit {

	static int portal(int[] arr) {
		int n = arr.length;
		int profit = 0;

		for (int i = 1; i < n; ++i) {
			if (arr[i] > arr[i - 1])
				profit += arr[i] - arr[i - 1];
		}
		return profit;

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 7, 1, 5, 3, 6, 4 };

		int profit = portal(arr);
		System.out.println(profit);
	}

}
