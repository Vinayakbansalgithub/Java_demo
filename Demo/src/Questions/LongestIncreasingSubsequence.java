package Questions;

import java.util.Arrays;
import java.util.Iterator;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 49, 80, 1 };
		int res1[] = findLIS(arr);

		int res2[] = findLDS(arr);
		System.out.println(Arrays.toString(res1));
		System.out.println(Arrays.toString(res2));

		int max = 0;
		for (int i = 0; i < res2.length; i++) {

			if (res1[i] + res2[i] > max)
				max = res1[i] + res2[i];

		}

		System.out.println(max - 1);

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

	private static int[] findLDS(int[] arr) {
		// TODO Auto-generated method stub

		int dp[] = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			int max = 0;

			for (int j = arr.length - 1; j > i; j--) {
				if (arr[i] > arr[j]) {

					if (max < dp[j])
						max = dp[j];
				}
			}
			dp[i] = max + 1;
		}
		return dp;
	}
}
