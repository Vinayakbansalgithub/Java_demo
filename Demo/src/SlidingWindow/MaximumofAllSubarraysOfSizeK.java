package SlidingWindow;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumofAllSubarraysOfSizeK {

	static void findSubarrays(int[] arr, int size) {
		// TODO Auto-generated method stub

		int arrstart = 0;
		int arrend = 0;

		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;

		while (arrend < arr.length) {

			if (arr[arrend] > max) {
				secondMax = max;
				max = arr[arrend];
			} else if (arr[arrend] < max && arr[arrend] > secondMax) {
				secondMax = arr[arrend];
			}

			if (arrend - arrstart + 1 < size) {
				arrend++;
			} else if (arrend - arrstart + 1 == size) {

				System.out.println(" " + max);

				if (max == arr[arrstart]) {
					max = secondMax;

				}
				arrstart++;
				arrend++;
			}

		}

	}

	// when start is 18 it will fail

	public static void main(String[] args) {
		int[] arr = { 18, 5, 10, 7, 9, 4, 15, 12, 90, 13 };
		int size = 4;

		findSubarrays(arr, size);
	}

}
