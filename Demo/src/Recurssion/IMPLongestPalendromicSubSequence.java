package Recurssion;

public class IMPLongestPalendromicSubSequence {
	public static void main(String[] args) {
		String str = "acdcga";

		int res = getLCS(str, 0, str.length() - 1);

		System.out.println(res);

	}

	static int getLCS(String str, int start, int end) {
		// TODO Auto-generated method stub

		
		if (start == end) {
			return 1;
		}
		
		
		int result;

		if (str.charAt(start) == str.charAt(end)) {
			result = getLCS(str, start + 1, end - 1) + 2;
		} else {
			int o1 = getLCS(str, start + 1, end);
			int o2 = getLCS(str, start, end - 1);
			result = Math.max(o1, o2);
		}

		return result;
	}
}
