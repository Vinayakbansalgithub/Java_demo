package dp;

import java.util.Arrays;
import java.util.Iterator;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 49, 80, 1 };
		int res1[] = findLIS(arr);

		System.out.println(Arrays.toString(res1));
	}

	private static int[] findLIS(int[] arr) {
		// TODO Auto-generated method stub

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
		}
		return dp;
	}
}
