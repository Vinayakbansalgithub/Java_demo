package Questions;

import java.util.ArrayList;
import java.util.List;

//134. Gas Station
public class GasSatation {
	private static int find(int[] gas, int[] gasNeeded) {

		int gasTotal = 0;

		for (int i = 0; i < gasNeeded.length; i++) {
			gasTotal += gas[i] - gasNeeded[i];
		}

		if (gasTotal < 0)
			return -1;

		int Currentcost = 0;
		int index = 0;

		List<Integer> list = new ArrayList<Integer>();

		while (list.size() < gas.length) {

			Currentcost += gas[index] - gasNeeded[index];

			if (Currentcost < 0) {
				Currentcost = 0;
				list.clear();
			} else {
				boolean isAdd = list.add(index);
				if (!isAdd) {
					System.out.println("already moved here");
					return list.get(0);
				}
			}
			index++;
			index = index % gas.length;

		}
		if (list.get(0) != null)
			return list.get(0);
		else
			return -1;

	}

	public static void main(String[] args) {
		int[] gas = { 5, 1, 2, 3, 4 };
		int[] cost = { 4, 4, 1, 5, 1 };

//		int[] gas = { 1, 2, 3, 4, 5 };
//		int[] cost = { 3, 4, 5, 1, 2 };

		int index = find(gas, cost);
		System.out.println(index);

	}
}
