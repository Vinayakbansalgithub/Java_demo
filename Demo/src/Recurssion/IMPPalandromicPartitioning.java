package Recurssion;

public class IMPPalandromicPartitioning {

	static boolean isPalindrom(String str, int si, int ei) {

		if (si == ei)
			return true;

		if (str.charAt(si) != str.charAt(ei))
			return false;

		if (si < ei) {
			isPalindrom(str, si + 1, ei - 1);
		}

		return true;
	}

	static int partition(String str, int si, int ei) {

		if (isPalindrom(str, si, ei)) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		for (int i = si; i < ei; i++) {

			int r1 = partition(str, si, i);
			int r2 = partition(str, i + 1, ei);

			int total = r1 + r2 + 1;

			if (total < min)
				min = total;

		}
		return min;

	}

	public static void main(String[] args) {

		String str = "abacdc";

		int res = partition(str, 0, str.length() - 1);

		System.out.println(res);
	}
}
