package ArrayQuestions;

// leet 392. Is Subsequence
public class IsSubsequence {
	public static void main(String[] args) {
		boolean res = find("hello", "hlo");
		System.out.println(res);

		String big = "rabbbit";
		String small = "rabbit";

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
		return false;
	}

}
