package Recurssion;

import java.util.Iterator;


// leet 1219. Path with Maximum Gold

public class IMPGoldMine {
//
//	private static int getMaxGoldAtLevel(int[][] gold, int r, int c) {
//		// TODO Auto-generated method stub
//
//		if (c == 4)
//			return 0;
//
//		if (r == -1 || r == 4)
//			return 0;
//
//		int aa = getMaxGoldAtLevel(gold, r - 1, c + 1);
//		int bb = getMaxGoldAtLevel(gold, r, c + 1);
//		int cc = getMaxGoldAtLevel(gold, r + 1, c + 1);
//
//		return Math.max(Math.max(aa, bb), cc) + gold[r][c];
//
//	}
//
//	static int getMaxGold(int[][] gold, int m, int n) {
//		// TODO Auto-generated method stub
//		int max = 0;
//
//		for (int i = 0; i < m; i++) {
//			int res = getMaxGoldAtLevel(gold, i, 0);
//			if (res > max)
//				max = res;
//
//		}
//		return max;
//	}

	private static void getMaxGoldAtLevel(int[][] arr, int r, int c) {

		int[][] dp = new int[r][c];

		for (int j = arr.length - 1; j >= 0; j--) {

			for (int i = arr.length - 1; i >= 0; i--) {

				
				// last col
				if (j == arr.length - 1) {
					dp[i][j] = arr[i][j];
				} else if (i == arr.length - 1) {

					// last row
					int r1 = dp[i][j + 1];

					int r2 = dp[i - 1][j + 1];

					dp[i][j] = arr[i][j] + Math.max(r1, r2);

				} else if (i == 0) {
					// first row

					int r1 = dp[i][j + 1];

					int r2 = dp[i + 1][j + 1];

					dp[i][j] = arr[i][j] + Math.max(r1, r2);

				} else {

					int r1 = dp[i][j + 1];

					int r2 = dp[i + 1][j + 1];

					int r3 = dp[i - 1][j + 1];

					dp[i][j] = arr[i][j] + Math.max(Math.max(r1, r2), r3);
				}

			}
		}

		System.out.println(dp);

	}

	public static void main(String arg[]) {

		int gold[][] = { { 1, 3, 1, 5 }, { 2, 2, 4, 1 }, { 5, 0, 2, 3 }, { 0, 6, 1, 2 } };

		int m = 4, n = 4;

		getMaxGoldAtLevel(gold, m, n);
	}

}
