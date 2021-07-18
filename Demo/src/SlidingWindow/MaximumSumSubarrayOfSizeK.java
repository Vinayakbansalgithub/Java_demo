package SlidingWindow;

public class MaximumSumSubarrayOfSizeK {

	static void findSubarrays(int[] arr, int size) {
		// TODO Auto-generated method stub

		int arrstart = 0;
		int arrend = 0;

		int maxSum = 0;
		int sum = 0;

		while (arrend < arr.length) {

			sum += arr[arrend];

			if (arrend - arrstart + 1 < size) {
				arrend++;
			} else if (arrend - arrstart + 1 == size) {

				maxSum = Math.max(maxSum, sum);

				sum = sum - arr[arrstart];
				arrstart++;
				arrend++;
			}

		}

		System.out.println("max sum subarray " + maxSum);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 9, 20, 3, 3, 5, 1 };
		int size = 4;

		findSubarrays(arr, size);
	}
}
