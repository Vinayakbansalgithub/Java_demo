package dp;

import java.util.Arrays;

//https://www.youtube.com/watch?v=3KPVNz_KUGM&ab_channel=KashishMehndiratta
public class PerfectSquare {
	public static void main(String[] args) {
		int result = find(12);

		System.out.println(result);
	}

	static int find(int n) {

		int[] dp = new int[n + 1];

		Arrays.fill(dp, Integer.MAX_VALUE);

		dp[0] = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j * j <= i; j++) {
				int val = 1 + dp[i - (j * j)];
				dp[i] = Math.min(dp[i], val);

			}
		}

		return dp[n];
	}
}
