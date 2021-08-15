package Arrays;

//https://www.youtube.com/watch?v=IiAsqfjhZnY&ab_channel=Pepcoding
public class CountNumberOfWaysPartitionSetIntoKSubsets {

	// teams and players

	public static void main(String args[]) {
		countDP(3, 2);

	}

	static char[] countDP(int people, int teams) {
		// TODO Auto-generated method stub

		int dp[][] = new int[teams + 1][people + 1];

		for (int t = 1; t <= teams; t++) {
			for (int p = 1; p <= people; p++) {

				if (t == p)
					dp[t][p] = 1;
				else if (t > p)
					dp[t][p] = 0;
				else {
					dp[t][p] = dp[t][p-1]*t+dp[t-1][p-1];

				}

			}

		}

		System.out.println("ans " + dp[teams][people]);

		return null;
	}
}



