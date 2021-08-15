package dp;


//https://www.youtube.com/watch?v=zQ6lx5tZ1Xw&ab_channel=jayatitiwari
public class UniquePaths {

	static int find(int row, int col) {

		int dp[][] = new int[row][col];

		for (int r = 0; r < row; r++) {
			for (int c = 0; c < col; c++) {

				if (c == 0) {
					dp[r][0] = 1;
				} else if (r == 0) {
					dp[0][c] = 1;
				} else
					dp[r][c] = dp[r - 1][c] + dp[r][c - 1];

			}
		}

		return dp[row - 1][col - 1];

	}

	public static void main(String[] args) {

		int res = find(3, 7);
		System.out.println(res);
	}

}
