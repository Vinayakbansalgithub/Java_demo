package dp;

public class WaysCoinChannge {

	static int[][] dp;

	public static void main(String[] args) {

		int num[] = new int[] {1,2,3};
		int sum = 5;

		dp = new int[num.length + 1][sum + 1];

		for (int i = 0; i <= num.length; i++) {

			for (int j = 0; j <= sum; j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = 1;
				} else if (i == 0) {
					dp[i][j] = 0;
				} else if (j == 0) {
					dp[i][j] = 1;
				}
			}
		}

		isSubSetSum(num, num.length, sum);

	}

	static void isSubSetSum(int[] num, int length, int sum) {

		for (int i = 1; i <= length; i++) {

			for (int j = 1; j <= sum; j++) {

				if (num[i - 1] <= j) {
					
					//           ...  in unbound insted opf i-1 we use i
					dp[i][j] = dp[i][j - num[i - 1]]+ dp[i - 1][j];
				} else {

					dp[i][j] = dp[i - 1][j];
				}

			}
		}

		System.out.println(dp[length][sum]);

	}

	
}
