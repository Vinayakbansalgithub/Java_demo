package ArrayQuestions;

import java.util.ArrayList;
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

}

public class MergeKSortedArrays {

	static PriorityQueue<Pair> queue = new PriorityQueue<>();

	private static void getresult(ArrayList<ArrayList<Integer>> lists) {
		// TODO Auto-generated method stub

		for (int i = 0; i < lists.size(); i++) {
			queue.add(new Pair(lists.get(i).get(0), i, 0));

		}

		while (queue.size() > 0) {

			Pair pair=queue.remove();
			System.out.println("  "+pair.val);
			pair.colIndex+=1;
			
			
			if(pair.colIndex<lists.get(pair.rowIndex).size())
			queue.add(new Pair(lists.get(pair.rowIndex).get(pair.colIndex+1), pair.rowIndex, pair.colIndex+1));
			
			
		}

	}

	public static void main(String[] args) {
		
		getresult(null);
	}

}
