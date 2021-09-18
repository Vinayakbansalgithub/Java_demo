package Questions;

public class ImplementstrStr {
	public static void main(String[] args) {
		String longString = "GeeksForGeeks";
		String shortString = "For";

		int res = find(longString, shortString);
		System.out.println(res);

	}

	static int find(String longString, String shortString) {

		if (longString.length() == 0)
			return 0;

		char[] charLong = longString.toCharArray();
		char[] charShort = shortString.toCharArray();

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < longString.length() && j < shortString.length()) {
			if (charLong[i] == charShort[j]) {
				i++;
				j++;
			} else {
				i++;
				j = 0;
			}
		}

		System.out.println("i is " + i);
		System.out.println("j is " + j);

		if (j == 0 || (i == longString.length())) {
			return -1;
		}

		return i - j;
	}

}
