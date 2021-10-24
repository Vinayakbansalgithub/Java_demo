package Arrays;

import java.util.HashMap;
import java.util.Iterator;

public class CountofSubarrayswithEqual0and1 {
	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 1, 0, 1, 1 };
		find(arr);

	}

	private static void find(int[] arr) {
		// TODO Auto-generated method stub

		int sum = 0;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				sum = sum - 1;
			} else if (arr[i] == 1) {

				sum = sum + 1;

			}

			if (map.containsKey(sum)) {
				count = count + map.get(sum);
				map.put(sum, map.get(sum) + 1);

			} else
				map.put(sum, 1);

		}

		System.out.println("count is " + count);

	}
}
