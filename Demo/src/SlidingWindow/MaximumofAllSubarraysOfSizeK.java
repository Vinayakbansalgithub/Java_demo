package SlidingWindow;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumofAllSubarraysOfSizeK {

	static void findSubarrays(int[] arr, int size) {
		// TODO Auto-generated method stub

		int arrstart = 0;
		int arrend = 0;

		int max = Integer.MIN_VALUE;

		Queue<Integer> queue = new LinkedList<Integer>();

		while (arrend < arr.length) {

			if (arr[arrend] > max) {
				max=	arr[arrend] ;
			}
			queue.add(arr[arrend]);


			if (arrend - arrstart + 1 < size) {
				arrend++;
			} else if (arrend - arrstart + 1 == size) {

				System.out.println(" " + max);

				if (queue.peek() == arr[arrstart]) {
					queue.poll();
				}
				arrstart++;
				arrend++;
			}

		}

	}

	public static void main(String[] args) {
		int[] arr = { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
		int size = 4;

		findSubarrays(arr, size);
	}

}
