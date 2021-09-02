package Questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GasSatation {
	private static int find(int[] gas, int[] cost) {
		// TODO Auto-generated method stub

		int gasTotal = 0;

		for (int i = 0; i < cost.length; i++) {
			gasTotal += gas[i] - cost[i];
		}

		if (gasTotal < 0)
			return -1;

		int Currentcost = 0;
		int startIndex = 0;
		int index = 0;

		List<Integer> list = new ArrayList<Integer>();

		while (list.size() < gas.length) {

			Currentcost += gas[index] - cost[index];

			if (Currentcost < 0) {
				Currentcost = 0;
				startIndex = startIndex + 1;

			} else {
				list.add(index);
			}
			index++;
			index = index % gas.length;

		}

		return startIndex;

	}

	public static void main(String[] args) {
		int[] gas = { 5, 1, 2, 3, 4 };

		int[] cost = { 4, 4, 1, 5, 1 };

		int index = find(gas, cost);
		System.out.println(index);

	}
}
