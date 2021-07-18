package Recurssion;

//https://www.youtube.com/watch?v=4Urd0a0BNng&ab_channel=AdityaVermaAdityaVerma

// abc acd
public class IMPLongestCommonSubSequence {
	static int getLCS(String str1, String str2, int n1, int n2) {

		// base
		if (n1 == 0 || n2 == 0)
			return 0;

		char s1 = str1.charAt(0);
		char s2 = str2.charAt(0);

		String ros1 = str1.substring(1);
		String ros2 = str2.substring(1);

		int length = 0;
		if (s1 == s2) {

			length = getLCS(ros1, ros2, n1 - 1, n2 - 1) + 1;

		} else {

			int c1 = getLCS(str1, ros2, n1, n2 - 1);
			int c2 = getLCS(ros1, str2, n1 - 1, n2);

			length = Math.max(c1, c2);
		}

		return length;
		// TODO Auto-generated method stub
	}

	public static void main(String[] args) {
		String str1 = "abcdee";
		String str2 = "acdeeee";

		int res = getLCS(str1, str2, str1.length(), str2.length());
		System.out.println(res);

	}

}
