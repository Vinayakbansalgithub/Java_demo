package ArrayQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MettingRooms {
	public static void main(String[] args) {

		int lectures[][] = { { 5, 10 }, { 0, 30 }, { 15, 20 } };
		int n = lectures.length;

		System.out.println(minHalls(lectures, n));
	}

	private static int minHalls(int[][] lectures, int n) {
		// TODO Auto-generated method stub

		Arrays.sort(lectures, Comparator.comparingInt(a -> a[0]));

		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(Comparator.comparingInt(a -> a[1]));

		pq.add(lectures[0]);

		for (int i = 1; i < lectures.length; i++) {

			int[] prev = pq.poll();

			int[] curr = lectures[i];

			if (prev[1] > curr[0]) {

				pq.add(prev);
				pq.add(curr);
			} else {
				pq.add(curr);
			}

		}
		
		return pq.size();

	}
}
