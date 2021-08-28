package Questions;

import java.util.HashMap;
import java.util.Iterator;


//128. Longest Consecutive Sequence

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		int arr[] = { 100,4,200,1,3,2 };
		find(arr);
	}

	private static void find(int[] arr) {
		// TODO Auto-generated method stub

		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], true);
		}

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i] - 1))
				map.put(arr[i], false);
		}

		int overallMax = 0;
		for (int i = 0; i < arr.length; i++) {

			if (map.get(arr[i]) == true) {

				int current = arr[i];
				int counter = 1;

				System.out.println("look for " + arr[i]);

				while (map.containsKey(current + counter)) {
					counter++;
				}

				System.out.println("max is " + counter);
				if (overallMax < counter)
					overallMax = counter;

			}
		}

		System.out.println("overall max is " + overallMax);

	}

}
