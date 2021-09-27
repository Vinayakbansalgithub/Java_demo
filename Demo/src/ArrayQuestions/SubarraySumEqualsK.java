package ArrayQuestions;

import java.util.HashMap;

// 560. Subarray Sum Equals K

public class SubarraySumEqualsK {

	static void find(int arr[], int k) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		int sum = 0;
		int count = 0;
		for (int val : arr) {
			sum += val;

			if (map.containsKey(sum - k)) {

				count += map.get(sum - k);
			}

			if (map.containsKey(sum)) {

				map.put(sum, map.get(sum) + 1);
			} else
				map.put(sum, 1);

		}

		System.out.println("count is " + count);

	}

	public static void main(String[] args) {

		int arr[] = { 10, 2, -2, -20, 10 };
		int k = -10;
		find(arr, k);
	}
}
