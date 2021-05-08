package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ImpPairwithGivenSumSorted {
	// Naive method to find a pair in an array with given sum
	public static void findPair(int[] A, int sum) {
		// sort the array in ascending order
		Arrays.sort(A);

		// maintain two indices pointing to end-points of the array
		int low = 0;
		int high = A.length - 1;

		// reduce search space arr[low..high] at each iteration of the loop

		// loop till low is less than high
		while (low < high) {
			// sum found
			if (A[low] + A[high] == sum) {
				System.out.println("pair values are " + A[low] + " and " + A[high]);
			}

			// increment low index if total is less than the desired sum
			// decrement high index is total is more than the sum
			if (A[low] + A[high] < sum) {
				low++;
			} else {
				high--;
			}
		}

	}

	public static void findPairHash(int[] A, int sum) {
		// create an empty Hash Map
		Map<Integer, Integer> map = new HashMap<>();

		// do for each element
		for (int i = 0; i < A.length; i++) {
			// check if pair (A[i], sum-A[i]) exists

			// if difference is seen before, print the pair
			if (map.containsKey(sum - A[i])) {
				System.out.println("Pair found " + map.get(sum - A[i]) + " and " + (sum - A[i]));
				//return;
			}

			map.put(A[i],sum - A[i]);
		}

		
	}

	// Find pair with given sum in the array
	public static void main(String[] args) {
		int[] A = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;

		//findPair(A, sum);
		System.out.println("===============");

		findPairHash(A, sum);

	}
}
