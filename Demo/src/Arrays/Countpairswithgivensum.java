package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Countpairswithgivensum {
	static int arr[] = new int[] { 1, 5, 7, -1, 5 };

	// complexity is O(n)
	public static void getPairsCountHash(int[] arr, int sum) {

		Set<Integer> set = new HashSet<Integer>();

		int count = 0;

		// Consider all possible pairs and check their sums
		for (int i = 0; i < arr.length; i++) {

			if (!set.contains(sum - arr[i])) {
				set.add(arr[i]);
			} else
				count++;

		}
		System.out.println();
		System.out.printf("Count of pairs is :::" + count);

	}

	// Driver method to test the above function
	public static void main(String[] args) {
		int sum = 6;
		getPairsCountHash(arr, sum);

	}
}
