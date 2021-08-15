package dp;

public class Fabonachi {

	public static void main(String[] args) {
		int res = find(10, new int[11]);
		System.out.println(res);
	}

	private static int find(int n, int[] arr) {
		// TODO Auto-generated method stub

		if (n == 1) {
			return n;
		}
		if (n == 0) {
			return n;
		}

		if (arr[n] != 0) {
			return arr[n];
		}

		int r1 = find(n - 1, arr);
		int r2 = find(n - 2, arr);

		arr[n] = r1 + r2;
		return arr[n];

	}

}
