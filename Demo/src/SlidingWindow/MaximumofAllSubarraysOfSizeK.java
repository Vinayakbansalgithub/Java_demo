package SlidingWindow;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumofAllSubarraysOfSizeK {

	static void findSubarrays(int[] arr, int size) {
		// TODO Auto-generated method stub

		int arrstart = 0;
		int arrend = 0;

		int max = 0;

		Queue<Integer> queue = new LinkedList<Integer>();

		while (arrend < arr.length) {

			if (arr[arrend] > max)
				queue.add(arr[arrend]);

			if (arrend - arrstart + 1 < size) {
				arrend++;
			} else if (arrend - arrstart + 1 == size) {

				System.out.println(" " + queue.peek());

				if (queue.peek() == arr[arrstart]) {
					queue.poll();
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
