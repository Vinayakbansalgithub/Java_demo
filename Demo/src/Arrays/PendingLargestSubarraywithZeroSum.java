package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// continious elements
public class PendingLargestSubarraywithZeroSum {

	static class Pair {

		int num;
		int index;

		public Pair(int num, int index) {
			super();
			this.num = num;
			this.index = index;
		}

		@Override
		public String toString() {
			return "Pair [num=" + num + ", index=" + index + "]";
		}

	}

	static int count = 0;

	static void subArrayExists(int arr[]) {

		// Creates an empty hashMap hM
		HashMap<Integer, Integer> hM = new HashMap<Integer, Integer>();

		int sum = 0; // Initialize sum of elements
		int max_len = 0; // Initialize result

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
			// Add current element to sum
			sum += arr[i];

			if (arr[i] == 0 && max_len == 0)
				max_len = 1;

			if (sum == 0)
				max_len = i + 1;

			// Look this sum in hash table
			Integer prev_i = hM.get(sum);

			// If this sum is seen before, then update max_len
			// if required
			if (prev_i != null)
				max_len = Math.max(max_len, i - prev_i);
			else // Else put this sum in hash table
				hM.put(sum, i);
		}
		System.out.println(max_len);

	}

	public static void main(String arg[]) {
//		int arr[] = { 4,2,-3,1,6};
		int arr[] = { 3, -1, -2, 0 };
//		int arr2[] = {1,2,0,3};

		// int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		// int arr[] = { 15, -15};

		subArrayExists(arr);

	}
}
