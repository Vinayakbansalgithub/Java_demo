package Recurssion;

public class IMPKnapSackProblem {

	public static void main(String[] args) {
		int price[] = new int[] { 60, 100, 120 };
		int wt[] = new int[] { 10, 20, 30 };
		int W = 50;

//		int price[] = new int[] { 1, 5, 8, 9, 10, 17, 17, 20 };
//
//		int wt[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
//		int W = 8;

		System.out.println(profitFun(wt, price, wt.length - 1, W));
	}

	static int profitFun(int[] wt, int[] price, int size, int w) {
		// TODO Auto-generated method stub

		if (w == 0 || 0 == size) {
			return 0;
		}

		if (wt[size] <= w) {
			int i = price[size] + profitFun(wt, price, size - 1, w - wt[size]);
			int e = profitFun(wt, price, size - 1, w);
			return Math.max(i, e);
		} else {
			int e = profitFun(wt, price, size - 1, w);
			return e;
		}

	}
}
