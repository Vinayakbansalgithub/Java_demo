package Arrays;

import java.util.HashSet;
import java.util.Set;


// continious elements
public class SubarraywithZeroSum {

	static int count=0;
	static Boolean subArrayExists(int arr[]) {
		// Creates an empty hashset hs
		Set<Integer> hs = new HashSet<Integer>();

		// Initialize sum of elements
		int sum = 0;

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
			// Add current element to sum
			sum += arr[i];

			// Return true in following cases
			// a) Current element is 0
			// b) sum of elements from 0 to i is 0
			// c) sum is already present in hash map
			if (arr[i] == 0 || sum == 0 || hs.contains(sum)) {
				count++;
			}

			// Add sum to hash set
			hs.add(sum);
		}

		
		
		
		System.out.println("total subarrays are "+count);
		if(count>1)
			return true;
		// We reach here only when there is
		// no subarray with 0 sum
		return false;
	}

	// driver code
	public static void main(String arg[]) {
//		int arr[] = { 4,2,-3,1,6};
//		int arr1[] = {3,-1,-2,5};
//		int arr2[] = {1,2,0,3};

		int arr[] = {2,8,-3,-5,2,-4,6,1,2,1,-3,4};

		if (subArrayExists(arr))
			System.out.println("Found a subarray with 0 sum");
		else
			System.out.println("No Such Sub Array Exists!");
		
		System.out.println(count);
	}
}
