package Arrays;

public class KadaneMaximumSumSubarrayContigious {
	static int findSubarrays(int[] arr) {
		// TODO Auto-generated method stub
		int maxSum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			int sumSoFar = arr[i];

			for (int j = i + 1; j < arr.length; j++) {

				sumSoFar = sumSoFar + arr[j];
				if (sumSoFar > maxSum) {
					maxSum = sumSoFar;
					continue;
				} else {
					break;
				}

			}

		}

		return maxSum;

	}

	static int findSubarraysMax(int[] arr) {
		// TODO Auto-generated method stub
		int maxSum = arr[0];
		int maxSumInclude = arr[0];

		for (int i = 1; i < arr.length; i++) {

			maxSumInclude = Math.max(maxSumInclude + arr[i], arr[i]);

			maxSum = Math.max(maxSumInclude, maxSum);


			System.out.println("maxSum        ::: " + maxSum);
			System.out.println("maxSumInclude ::: " + maxSumInclude);

		}

		return maxSum;

	}

	public static void main(String[] args) {
		//int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		 int[] arr = { -1, -2 };

		//System.out.println(findSubarrays(arr));
		System.out.println(findSubarraysMax(arr));

	}
}
