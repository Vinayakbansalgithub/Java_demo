package SlidingWindow;


//209. Minimum Size Subarray Sum

public class MinimumSizeSubarraySum {

	static void findSubarrays(int[] arr, int target) {
		// TODO Auto-generated method stub

		int arrstart = 0;
		int arrend = 0;

		int size = Integer.MAX_VALUE;
		int sum = 0;

		while (arrend < arr.length) {

			sum += arr[arrend];

			if (sum < target) {
				arrend++;

			} else {

				while (sum > target) {

					sum = sum - arr[arrstart];
					arrstart++;

				}

				int currentSize = arrend - arrstart + 1;

				size = Math.min(size, currentSize);

				arrend++;
			}

		}

		if (size == Integer.MAX_VALUE)
			size = 0;
		System.out.println("MinimumSizeSubarraySum " + size);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 1, 1, 1, 1, 1 };
		int target = 11;

		findSubarrays(arr, target);
	}
}
