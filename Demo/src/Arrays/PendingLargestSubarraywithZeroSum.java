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

		HashMap<Integer, Integer> map = new HashMap<>();

		// Initialize sum of elements
		int sum = 0;

		int largest = 0;

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				largest = 1;
			}

			sum += arr[i];

			if (!map.containsKey(sum))
				map.put(arr[i], i);
			else {

				int currLen = i - map.get(sum);
				if (currLen > largest)
					largest = currLen;

			}

		}

		System.out.println(largest);

	}

	public static void main(String arg[]) {
//		int arr[] = { 4,2,-3,1,6};
//		int arr1[] = {3,-1,-2,5};
//		int arr2[] = {1,2,0,3};

		//int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
		int arr[] = { 15, -15};


		subArrayExists(arr);

	}
}
