package ArrayQuestions;

import java.util.Iterator;

// leet 392. Is Subsequence
public class IsSubsequence {
	public static void main(String[] args) {
		boolean res = find("hello", "hlo");
		System.out.println(res);

		String big = "rabbbit";
		String small = "rabbit";
		System.out.println(findSubsequenceCount(big, small));

	}

	private static boolean find(String big, String small) {

		int smallPointer = 0;

		for (int i = 0; i < big.length(); i++) {

			if (big.charAt(i) == small.charAt(smallPointer)) {
				smallPointer++;
			}

			if (small.length() == smallPointer)
				return true;

		}

		// TODO Auto-generated method stub
		return false;
	}

	static int findSubsequenceCount(String big, String small) {
		
		int n = big.length();
		int m = small.length();

		// T can't appear as a subsequence in S
		if (m > n)
			return 0;

		// mat[i][j] stores the count of
		// occurrences of T(1..i) in S(1..j).
		int mat[][] = new int[n + 1][m + 1];

		// Initializing first column with
		// all 0s. An emptystring can't have
		// another string as suhsequence
		for (int i = 1; i <= m; i++)
			mat[0][i] = 0;

		// Initializing first row with all 1s.
		// An empty string is subsequence of all.
		for (int j = 0; j <= n; j++)
			mat[j][0] = 1;

		// Fill mat[][] in bottom up manner
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				// If last characters don't match,
				// then value is same as the value
				// without last character in S.
				if (big.charAt(i - 1) != small.charAt(j - 1))
					mat[i][j] = mat[i-1][j];

				// Else value is obtained considering two cases.
				// a) All substrings without last character in S
				// b) All substrings without last characters in
				// both.
				else
					mat[i][j] = mat[i-1][j] + mat[i - 1][j - 1];
			}
		}

		/*
		 * uncomment this to print matrix mat for (int i = 1; i <= m; i++, cout << endl)
		 * for (int j = 1; j <= n; j++) System.out.println ( mat[i][j] +" ");
		 */
		return mat[n][m];
	}

}
