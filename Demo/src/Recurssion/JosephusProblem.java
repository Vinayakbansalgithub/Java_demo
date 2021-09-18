package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {

	static class Pair {

		int index;
		boolean present;

		public Pair(int index, boolean present) {
			super();
			this.index = index;
			this.present = present;
		}

		@Override
		public String toString() {
			return "Pair [index=" + index + ", present=" + present + "]";
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

		public boolean isPresent() {
			return present;
		}

		public void setPresent(boolean present) {
			this.present = present;
		}

	}

	public static void main(String[] args) {
		int n = 14;
		int k = 2;

		// int res = find(n, k);
		// because initially it was zero based indexing and we need one based indexing
		// System.out.println(res + 1);

		List<Pair> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			list.add(new Pair(i, true));

		}

		find2(list, k);

	}

	static int find(int n, int k) {
		// TODO Auto-generated method stub

		if (n == 1) {
			return 0;
		}

		return (find(n - 1, k) + k) % n;

	}

	static void find2(List<Pair> list, int k) {
		// TODO Auto-generated method stub

		int start = k - 1;

		while (list.size() != 1 && list.size() > start) {

			list.get(start).setPresent(false);
			start = start + k;

			if (list.size() <= start) {

				List<Pair> removelist = new ArrayList<>();

				for (Pair pair : list) {
					if (pair.present == false)
						removelist.add(pair);
				}

				start = start % list.size();
				list.removeAll(removelist);

			}

		}

		System.out.println(list.get(0).index);

	}

}
