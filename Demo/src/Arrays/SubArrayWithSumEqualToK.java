package Arrays;

import java.util.HashMap;

//Number of subarrays having sum exactly equal to k

public class SubArrayWithSumEqualToK {

	static int find(int arr[], int si, int ei, int sumGiven) {

		int count = 0;
		int sum = 0;

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		map.put(0, 1);

		for (int i = 0; i < arr.length; i++) {

			sum += arr[i];

			if (map.containsKey(sum - sumGiven)) {

				count += map.get(sum - sumGiven);
			}

			map.put(sum, map.getOrDefault(sum - sumGiven, 0) + 1);
		}

		return count;

	}

	public static void main(String[] args) {

		int arr[] = { 2, 8, -3, -5, 2, -4, 6, 1, 2, 1, -3, 4 };
		int k = 5;
		int n = arr.length;

		int res = find(arr, 0, n, k);
		System.out.println(res);
	}
}
