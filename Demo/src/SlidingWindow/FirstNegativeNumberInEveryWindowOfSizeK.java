package SlidingWindow;

import java.util.LinkedList;
import java.util.List;

public class FirstNegativeNumberInEveryWindowOfSizeK {
	static void findSubarrays(int[] arr, int size) {
		// TODO Auto-generated method stub

		int arrstart = 0;
		int arrend = 0;

		int maxSum = 0;
		int sum = 0;

		List<Integer> list = new LinkedList<Integer>();

		while (arrend < arr.length) {

			if (arr[arrend] < 0)
				list.add(arr[arrend]);

			if (arrend - arrstart + 1 < size) {
				arrend++;
			} else if (arrend - arrstart + 1 == size) {

				if (list.isEmpty()) {
					System.out.println("0");
				} else {
					System.out.println(" " + list.get(0));
				}
				if (list.get(0) == arr[arrstart]) {
					list.remove(0);
				}
				arrstart++;
				arrend++;
			}

		}


	}

	public static void main(String[] args) {
		int[] arr = { 1, -9, -20, 3, -3, 5, -1 };
		int size = 4;

		findSubarrays(arr, size);
	}
}
