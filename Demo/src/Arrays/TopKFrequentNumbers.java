package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

// leetcode 347
public class TopKFrequentNumbers {

	static class Pair implements Comparable<Pair> {

		Integer frequency;
		Integer value;

		public Pair(Integer frequency, Integer value) {
			super();
			this.frequency = frequency;
			this.value = value;
		}

		@Override
		public int compareTo(Pair o) {
			// TODO Auto-generated method stub
			return this.frequency - o.frequency;
		}

		@Override
		public String toString() {
			return "Pair [frequency=" + frequency + ", value=" + value + "]";
		}

	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 3 };
		int k = 2;

		int[] res = find(arr, k);

		System.out.println(Arrays.toString(res));

	}

	static int[] find(int[] arr, int k) {
		// TODO Auto-generated method stub

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (!map.containsKey(arr[i])) {

				map.put(arr[i], 1);

			} else
				map.put(arr[i], map.get(arr[i]) + 1);
		}
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());

		int counter = 0;

		for (Map.Entry<Integer, Integer> entry : map.entrySet())

		{

			if (counter < k) {
				pq.add(new Pair(entry.getValue(), entry.getKey()));
			} else {
				Pair last = pq.peek();

				if (last.frequency < entry.getValue()) {
					pq.remove();
					pq.add(new Pair(entry.getValue(), entry.getKey()));

				}

			}

			counter++;
		}

		for (Pair pair : pq) {
			list.add(pair.value);

		}

		Collections.sort(list);

		int[] array = list.stream().mapToInt(i -> i).toArray();

		return array;
	}

}
