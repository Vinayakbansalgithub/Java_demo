package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {

	static int[] funMap(int arr[], int sum) throws Exception {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {

			int complement = sum - arr[i];

			if (set.contains(complement)) {
				System.out.println("adding " + complement);
				return new int[] { complement, arr[i] };
			}

			set.add(arr[i]);

		}

		throw new Exception("not found");
	}

	public static void main(String[] args) throws Exception {

		int arr[] = { 0, -1, 2, -3, 1 };
		int sum = -2;

		int ress[] = funMap(arr, sum);
		System.out.println(Arrays.toString(ress));

	}
}
