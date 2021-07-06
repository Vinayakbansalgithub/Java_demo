package Recurssion;

//Given a “2 x n” board and tiles of size “2 x 1”, 

//count the number of ways to tile the given board using the 2 x 1 tiles. A tile can either be placed horizontally 
//i.e., as a 1 x 2 tile or vertically i.e., as 2 x 1 tile. 

//problem 2 Tiling with M x 1 Tiles  n1

public class IMPTileAFloor {

	static int ways(int floor) {

		if (floor == 0)
			return 0;

		if (floor == 1)
			return 1;

		return ways(floor - 1) + ways(floor - 2);
	}

	public static void main(String[] args) {

		int floor = 6;

		int result = ways(floor);

		System.out.println(result);

		result = waysnMXN(3, 2);

		System.out.println(result);
	}

	private static int waysnMXN(int m, int n) {
		// TODO Auto-generated method stub

		int dp[] = new int[n + 1];

		for (int i = 1; i <= n; i++) {

			if (i < m) {
				dp[i] = i;
			} else if (i == m) {
				dp[i] = 2;
			} else {
				dp[i] = dp[i - 1] + dp[i - m];
			}
		}

		return dp[n];
	}
}

//1 1 2 3 5 8 13