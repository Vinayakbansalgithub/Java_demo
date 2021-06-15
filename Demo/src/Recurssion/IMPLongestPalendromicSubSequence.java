package Recurssion;

public class IMPLongestPalendromicSubSequence {
	public static void main(String[] args) {
		String str = "agbcba";

		StringBuilder input = new StringBuilder();

		input.append(str);
		String strRev = input.reverse().toString();

		int res = getLPS(str, strRev, str.length(), strRev.length());

		System.out.println(res);

	}

	static int getLPS(String str1, String str2, int n1, int n2) {

		// base
		if (n1 == 0 || n2 == 0)
			return 0;

		char s1 = str1.charAt(0);
		char s2 = str2.charAt(0);

		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);

		int length = 0;
		if (s1 == s2) {

			length = getLPS(ros1, ros2, n1 - 1, n2 - 1) + 1;

		} else {

			int c1 = getLPS(str1, ros2, n1, n2 - 1);
			int c2 = getLPS(ros1, str2, n1 - 1, n2);

			length = Math.max(c1, c2);
		}

		return length;
		// TODO Auto-generated method stub
	}
}
