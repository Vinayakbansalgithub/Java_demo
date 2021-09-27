package dp;

// linear dp

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 49, 80, 1 };
		int res = findLIS(arr);

		System.out.println(res);
	}

	private static int findLIS(int[] arr) {

		int oMax = 0;
		int dp[] = new int[arr.length];
		dp[0] = 1;

		// start at index
		for (int i = 1; i < arr.length; i++) {
			int max = 0;

			// end at index
			for (int j = 0; j < i; j++) {
				if (arr[j] < arr[i]) {

					if (max < dp[j])
						max = dp[j];
				}
			}
			dp[i] = max + 1;

			oMax = Math.max(oMax, dp[i]);
		}
		return oMax;
	}
}
