package dp;

// leet 115
public class DistinctSubsequences {
	public static void main(String[] args) {

		String T = "rabbbit";
		String S = "rabbit";
		System.out.println(findSubsequenceCount(T, S, T.length(), S.length()));

	}

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
