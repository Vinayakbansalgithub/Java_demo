package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	static int[] fun(int arr[], int sum) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int complement = sum - arr[i];

				if (complement == arr[j])
					return new int[] { arr[i], arr[j] };

			}
		}

		return new int[] {};
	}

	static int[] funMap(int arr[], int sum) throws Exception {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			int complement = sum - arr[i];

			if (map.containsKey(complement)) {
				System.out.println("adding " + complement);
				return new int[] { complement, arr[i] };
			}

			map.put(arr[i], i);

		}

		throw new Exception("not found");
	}

	public static void main(String[] args) throws Exception {

		int arr[] = { 0, -1, 2, -3, 1 };
		int sum = -2;

		int res[] = fun(arr, sum);

		System.out.println(Arrays.toString(res));

		int ress[] = funMap(arr, sum);
		System.out.println(Arrays.toString(ress));

	}
}
