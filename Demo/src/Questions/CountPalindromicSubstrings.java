package Questions;

public class CountPalindromicSubstrings {
	public static void main(String[] args) {
		String str = "abccb";
		find(str);
	}

	private static void find(String str) {
		// TODO Auto-generated method stub

		boolean dp[][] = new boolean[str.length()][str.length()];

		int count = 0;

		int length = 0;

		for (int dig = 0; dig < str.length(); dig++) {
			for (int row = 0, col = dig; col < str.length(); col++, row++) {
				if (dig == 0) {
					dp[row][col] = true;
					count++;

				} else if (dig == 1) {

					if (str.charAt(row) == str.charAt(col)) {
						dp[row][col] = true;
						count++;

					}
				} else {

					System.out.println(str.charAt(row));
					System.out.println(str.charAt(col));

					System.out.println(dp[row + 1][col - 1]);
					if (str.charAt(row) == str.charAt(col) && dp[row + 1][col - 1]) {
						dp[row][col] = true;
						count++;

					}

				}

				if (dp[row][col]) {
					length = dig + 1;
				}

			}
		}

		System.out.println(count);
		System.out.println(length);

	}
}
