package Questions;

import java.util.Iterator;

public class MimimumCostPath {

	public static void main(String args[]) {

		int cost[][] = { { 1, 2, 3 }, { 4, 8, 2 }, { 1, 5, 3 } };

		System.out.print(minCost(cost, 3, 3));
	}

	static int minCost(int[][] cost, int i, int j) {
		// TODO Auto-generated method stub

		int[][] dp = new int[i][j];

		for (int x = cost.length-1; x >= 0; x--) {

			for (int y = cost[x].length-1; y >= 0; y--) {

				if (x == cost.length-1 && y == cost[x].length-1) {
					dp[x][y] = cost[x][y];
				} else if (x == cost.length-1) {

					dp[x][y] = cost[x][y] + dp[x][y+1];

				} else if (y == cost[x].length-1) {

					dp[x][y] = cost[x][y] + dp[x+1][y];

				}else {
					dp[x][y]= Math.min(dp[x+1][y], dp[x][y+1])+cost[x][y];
				}

			}

		}
		
		return dp[0][0];

	}
}
