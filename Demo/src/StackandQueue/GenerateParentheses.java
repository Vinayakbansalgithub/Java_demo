package StackandQueue;

public class GenerateParentheses {
	public static void main(String[] args) {
		find("", 3, 0, 0);
	}

	private static void find(String current, int n, int open, int close) {
		// TODO Auto-generated method stub

		if (current.length() == n * 2) {

			System.out.println(current);
		}

		if (open < n) {
			find(current + "(", n, open + 1, close);
		}

		if (close < open) {
			find(current + ")", n, open, close + 1);
		}

	}
}
