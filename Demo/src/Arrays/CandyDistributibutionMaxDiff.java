package Arrays;

import java.util.Arrays;

/*Chocolate Distribution Problem


Given an array of n integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 

Each student gets one packet
The difference between the number of chocolates in the packet with maximum chocolates and packet with minimum chocolates given to the students is minimum.
*/

public class CandyDistributibutionMaxDiff {
	public static void main(String[] args) {
		int arr[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };

		int m = 7; // Number of students

		int n = arr.length;
		System.out.println("Minimum difference is " + findMinDiff(arr, n, m));
	}

	private static int findMinDiff(int[] arr, int n, int m) {
		// TODO Auto-generated method stub

		System.out.println("total pack " + n);

		if (m > n) {
			return -1;
		}

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		int min_diff = Integer.MAX_VALUE;

		for (int i = 0; i <= (n - m); i++) {

			System.out.println("from " + i + "  to  " + (i + m - 1));

			int diff = arr[m + i - 1] - arr[i];

			System.out.println("current min diff " + diff);

			if (diff < min_diff)
				min_diff = diff;

		}

		return min_diff;
	}
}
