package dp;

import java.util.Scanner;

public class EggDroppingproblem {

	static int eggDrop(int e, int f) {

		int[][] dp = new int[e + 1][f + 1];

		for (int i = 1; i <= e; i++) {
			for (int j = 1; j <= f; j++) {

				if (i == 1) {
					dp[i][j] = j;
				} else if (j == 1) {
					dp[i][j] = 1;
				} else {

					// break e-1/j-1

					// not break e/f-j

					int min = Integer.MAX_VALUE;

					for (int mj = j - 1, pj = 0; mj >= 0; mj--, pj++) {

						int v1 = dp[i][mj];
						int v2 = dp[i - 1][pj];

						min = Math.min(min, Math.max(v1, v2));

					}
					dp[i][j] = min + 1;

				}
			}

		}

		return dp[e][f];

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int egg = scan.nextInt();
		int floor = scan.nextInt();

		int res = eggDrop(egg, floor);

		// int res = eggDrop(3, 7);
		System.out.println("====" + res);

	}
}
