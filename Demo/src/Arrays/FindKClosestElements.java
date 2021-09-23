package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import java.lang.Math;

// leetcode 658
public class FindKClosestElements {

	static class Pair implements Comparable<Pair> {

		int value;
		int diff;

		public Pair(int value, int diff) {
			super();
			this.value = value;
			this.diff = diff;
		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.diff - o.diff;
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		int x = 5;

		int[] res = find(arr, x, k);

		System.out.println(Arrays.toString(res));

	}

	static int[] find(int[] arr, int x, int k) {
		// TODO Auto-generated method stub

		PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {

			if (i < k) {
				pq.add(new Pair(arr[i], Math.abs(arr[i] - x)));
			} else {
				Pair last = pq.peek();

				if (last.diff > Math.abs(arr[i] - x)) {
					pq.remove();
					pq.add(new Pair(arr[i], Math.abs(arr[i] - x)));

				}

			}

		}

		for (Pair pair : pq) {
			list.add(pair.value);

		}

		Collections.sort(list);

		int[] array = list.stream().mapToInt(i -> i).toArray();

		return array;
	}

}
