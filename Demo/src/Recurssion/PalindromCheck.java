package Recurssion;

public class PalindromCheck {
	public static void main(String[] args) {
		String a = "hellehp";
		boolean b = check(a, 0, a.length() - 1);
		System.out.println(b);
	}

	static boolean check(String a, int start, int end) {

		if (a.length() == 0)
			return true;

		boolean result = false;

		if (end < start)
			return true;

		if (a.charAt(start) == a.charAt(end)) {

			result = check(a, start + 1, end - 1);

		} else
			return false;

		return result;
	}
}
