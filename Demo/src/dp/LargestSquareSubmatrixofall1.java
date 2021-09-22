package dp;
// 221. Maximal Square

public class LargestSquareSubmatrixofall1 {
	public static void main(String[] args) {

		int cost[][] = { { 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1, 0, 0, 1, 0 } };
		System.out.print(largest1Square(cost, 4, 5));

	}

	static int largest1Square(int[][] matrix, int i, int j) {
		// TODO Auto-generated method stub

		int[][] dp = new int[i][j];

		int max = 0;

		for (int x = matrix.length - 1; x >= 0; x--) {

			for (int y = matrix[x].length - 1; y >= 0; y--) {

				if (x == matrix.length - 1 && y == matrix[x].length - 1) {
					dp[x][y] = matrix[x][y];
				}
				// last row
				else if (x == matrix.length - 1) {
					dp[x][y] = matrix[x][y];
				}
				// last col
				else if (y == matrix[x].length - 1) {
					dp[x][y] = matrix[x][y];
				} else {
					if (matrix[x][y] == 0) {
						dp[x][y] = 0;
					} else
						dp[x][y] = Math.min(Math.min(dp[x + 1][y], dp[x][y + 1]), dp[x + 1][y + 1]) + 1;
				}

				if (dp[x][y] > max)
					max = dp[x][y];

			}

		}

		if (max == 1) {
			return max;
		} else
			return max * max;

	}
}
