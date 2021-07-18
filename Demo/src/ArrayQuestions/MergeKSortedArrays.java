package ArrayQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
	int val;
	int rowIndex;
	int colIndex;

	public Pair(int val, int rowIndex, int colIndex) {
		super();
		this.val = val;
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
	}

	@Override
	public int compareTo(Pair o) {
		// TODO Auto-generated method stub
		return this.val - o.val;
	}

	@Override
	public String toString() {
		return "Pair [val=" + val + ", rowIndex=" + rowIndex + ", colIndex=" + colIndex + "]";
	}

}

public class MergeKSortedArrays {

	static PriorityQueue<Pair> queue = new PriorityQueue<>();

	private static void getresult(List<ArrayList<Integer>> lists) {
		// TODO Auto-generated method stub

		for (int i = 0; i < lists.size(); i++) {
			queue.add(new Pair(lists.get(i).get(0), i, 0));

		}

		while (queue.size() > 0) {
			Pair pair = queue.remove();
			System.out.println("  " + pair.val);
			pair.colIndex += 1;

			if (pair.colIndex < lists.get(pair.rowIndex).size())
				queue.add(new Pair(lists.get(pair.rowIndex).get(pair.colIndex), pair.rowIndex, pair.colIndex));
		}

	}

	public static void main(String[] args) {

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(30);
		l1.add(60);

		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(20);
		l2.add(40);
		l2.add(70);

		ArrayList<Integer> l3 = new ArrayList<Integer>();
		l3.add(25);
		l3.add(45);
		l3.add(90);

		List<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
		lists.add(l1);
		lists.add(l2);
		lists.add(l3);

		getresult(lists);
	}

}
