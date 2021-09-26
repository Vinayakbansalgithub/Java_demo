package Matrix;

// leet 1219. Path with Maximum Gold
public class GoldMine {

	private static void getMaxGoldAtLevel(int[][] m, int r, int c) {
		boolean visited[][] = new boolean[m.length][m[0].length];
		int max = 0;

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] > 0) {
					max = Math.max(checknbrs(i, j, visited, m), max);
				}
			}
		}
		System.out.println("max gold " + max);

	}

	private static int checknbrs(int i, int j, boolean[][] visited, int[][] m) {
		if (i < 0 || j < 0 || i >= m.length || j >= m[i].length || m[i][j] == 0 || visited[i][j] == true) {
			return 0;
		}
		visited[i][j] = true;

		int up = checknbrs(i - 1, j, visited, m);
		int left = checknbrs(i, j - 1, visited, m);
		int down = checknbrs(i + 1, j, visited, m);
		int right = checknbrs(i, j + 1, visited, m);

		visited[i][j] = false;

		return Math.max(Math.max(Math.max(up, down), left), right) + m[i][j];

	}

	public static void main(String arg[]) {

		int gold[][] = { { 1, 0, 7 }, { 2, 0, 6 }, { 3, 4, 5 }, { 0, 3, 0 }, { 9, 0, 20 } };

		int m = 5, n = 3;

		getMaxGoldAtLevel(gold, m, n);
	}

}
