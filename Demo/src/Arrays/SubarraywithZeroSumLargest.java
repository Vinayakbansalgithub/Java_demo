package Arrays;

import java.util.HashMap;

// continious elements
public class SubarraywithZeroSumLargest {

	static int findLargestSubArray(int arr[]) {
		// Creates an empty hashset hs
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		// Initialize sum of elements
		int sum = 0;
		int mlength = 0;

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (map.containsKey(sum)) {
				if (mlength < (i - map.get(sum))) {
					mlength = i - map.get(sum);
				}
			} else {
				map.put(sum, i);
			}

		}
		return mlength;
	}

	public static void main(String arg[]) {
		int arr[] = { 2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4 };

		int len = findLargestSubArray(arr);
		System.out.println("ans " + len);
	}
}
