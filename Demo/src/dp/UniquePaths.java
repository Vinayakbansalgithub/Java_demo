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
		System.out.println("unique path "+res);

		int M[][] = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		res=count(M);
		System.out.println("unique path with obsticals "+res);

	}

	static int count(int[][] m) {
		// TODO Auto-generated method stub

		int dp[][] = new int[m.length][m[0].length];

		for (int r = 0; r < m.length; r++) {
			for (int c = 0; c < m[r].length; c++) {

				
				// 0 is obstical
				if (m[r][c] == 0) {
					dp[r][c] = 0;
				} else if (r == 0 && c == 0) {
					dp[r][c] = m[r][c];
				} else if (r == 0) {
					dp[r][c] = dp[r][c - 1];
				} else if (c == 0) {
					dp[r][c] = dp[r - 1][c];
				} else {
					dp[r][c] = dp[r - 1][c] + dp[r][c - 1];
				}

			}
		}

		return dp[m.length-1][m[0].length-1];

	}

}
