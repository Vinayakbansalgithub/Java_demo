package Recurssion;

public class JosephusProblem {
	public static void main(String[] args) {
		int n = 2;
		int k = 2;

		int res = find(n, k);

		// because initially it was zero based indexing anmd we need one baserd indexing
		System.out.println(res + 1);
	}

	static int find(int n, int k) {
		// TODO Auto-generated method stub

		if (n == 1) {
			return 0;
		}

		return (find(n - 1, k) + k) % n;

	}

}
