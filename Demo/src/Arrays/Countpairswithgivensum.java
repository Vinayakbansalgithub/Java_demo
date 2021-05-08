package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Countpairswithgivensum {
	static int arr[] = new int[] { 1, 5, 7, -1, 5 };

	// Returns number of pairs in arr[0..n-1] with sum equal
	// to 'sum'
	public static void getPairsCount(int[] arr, int sum) {

		int count = 0;// Initialize result

		// Consider all possible pairs and check their sums
		for (int i = 0; i < arr.length; i++)
			for (int j = i + 1; j < arr.length; j++)
				if ((arr[i] + arr[j]) == sum)
					count++;

		System.out.printf("Count of pairs is :::" + count);
	}

	
	
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
		getPairsCount(arr, sum);
		getPairsCountHash(arr, sum);

	}
}
