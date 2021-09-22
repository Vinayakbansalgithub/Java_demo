package Matrix;

//329. Longest Increasing Path in a Matrix

public class LongestIncrementPathInaMatric {

	public static void main(String[] args) {

		int M[][] = new int[][] { { 3, 4, 5 }, { 3, 2, 6 }, { 2, 2, 1 } };

		count(M);

	}

	static int max;

	static void count(int[][] m) {
		// TODO Auto-generated method stub

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				max = Math.max(checknbrs(i, j, null, null, m), max);

			}
		}

		System.out.println("max is " + max);

	}

	private static int checknbrs(Integer i, Integer j, Integer oldi, Integer oldj, int[][] m) {
		// TODO Auto-generated method stub

		if (oldi != null && oldj != null
				&& (i < 0 || j < 0 || i >= m.length || j >= m[i].length || m[i][j] <= m[oldi][oldj])) {
			return 0;
		}

		int up = checknbrs(i - 1, j, i, j, m);
		int left = checknbrs(i, j - 1, i, j, m);
		int down = checknbrs(i + 1, j, i, j, m);
		int right = checknbrs(i, j + 1, i, j, m);
		int res = Math.max(Math.max(Math.max(up, down), left), right) + 1;
		System.out.println(res + "  i:" + i + " j:" + j);
		return res;

	}
}
