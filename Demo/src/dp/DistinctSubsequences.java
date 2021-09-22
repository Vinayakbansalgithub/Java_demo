package dp;

// leet 115
public class DistinctSubsequences {
	public static void main(String[] args) {

		String T = "rabbbit";
		String S = "rabbit";
		System.out.println(findSubsequenceCount(T, S, T.length(), S.length()));

		System.out.println(findSubsequenceCountTable(T, S));

	}

	private static int findSubsequenceCountTable(String t, String s) {
		// TODO Auto-generated method stub

		int[][] dp = new int[t.length() + 1][s.length() + 1];

		dp[0][0] = 1;

		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp[i].length; j++) {
				if (j == 0)
					dp[i][j] = 1;
			}

		}

		for (int i = 1; i <= t.length(); i++) {
			for (int j = 1; j <= s.length(); j++) {
				if (t.charAt(i - 1) == s.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
				} else {
					dp[i][j] = dp[i - 1][j];
				}

			}

		}

		return dp[t.length()][s.length()];
	}

	
	// easy
	static int findSubsequenceCount(String S, String T, int k, int l) {

		if (l == 0) {
			return 1;
		}
		if (k == 0) {
			return 0;
		}

		char s1 = S.charAt(k - 1);
		char s2 = T.charAt(l - 1);

		if (s1 != s2) {

			return findSubsequenceCount(S, T, k - 1, l);

		} else {

			return findSubsequenceCount(S, T, k - 1, l - 1) + findSubsequenceCount(S, T, k - 1, l);

		}

	}

}
