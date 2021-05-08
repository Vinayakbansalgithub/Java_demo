package Recurssion;

public class IMPKnapSackProblem {

	public static void main(String[] args) {
		int[] wt = { 1, 3, 4, 5 };

		int[] price = { 1, 5, 5, 7 };

		int capacity = 7;

		System.out.println(profitFun(wt, price, 0, capacity));
	}

	static int profitFun(int[] wt, int[] price, int vi, int capacity) {
		// TODO Auto-generated method stub

		if (capacity == 0 || vi == wt.length) {
			return 0;
		}

		// exclude
		int e = profitFun(wt, price, vi + 1, capacity);

		// include
		int i = 0;

		if (capacity >= wt[vi])
			i = profitFun(wt, price, vi + 1, capacity - wt[vi]) + price[vi];

		int ans = Math.max(e, i);

		return ans;

	}
}
