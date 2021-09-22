package dp;

import java.util.Arrays;

//https://www.youtube.com/watch?v=3KPVNz_KUGM&ab_channel=KashishMehndiratta

// redone form https://www.youtube.com/watch?v=aZuQXkO0-XA&ab_channel=Pepcoding
public class PerfectSquare {
	public static void main(String[] args) {
		int result = find(4);

		System.out.println(result);
	}

	static int find(int n) {

		int[] dp = new int[n + 1];

		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {

			int min = Integer.MAX_VALUE;
			for (int j = 1; j * j <= i; j++) {
				int rem = i - j * j;
				if (dp[rem] < min) {
					min = dp[rem];
				}
			}

			dp[i] = min + 1;

		}


		return dp[n];
	}
}
