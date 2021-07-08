package Graph;

public class Islands {

	public static void main(String[] args) {

		int M[][] = new int[][] { { 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 1 }, { 1, 0, 0, 1, 1 } };

		count(M);

	}

	static void count(int[][] m) {
		// TODO Auto-generated method stub

		int count = 0;
		boolean visited[][] = new boolean[m.length][m[0].length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (visited[i][j] == false && m[i][j] == 1) {
					checknbrs(i, j, visited, m);
					count++;
				}
			}
		}

		System.out.println("count is " + count);

	}

	private static void checknbrs(int i, int j, boolean[][] visited, int[][] m) {
		// TODO Auto-generated method stub

		if (i < 0 || j < 0 || i >= m.length || j >= m[i].length || m[i][j] == 0 || visited[i][j] == true) {
			return;
		}
		System.out.println(m[i][j]);
		visited[i][j] = true;

		checknbrs(i - 1, j, visited, m);
		checknbrs(i, j - 1, visited, m);
		checknbrs(i + 1, j, visited, m);
		checknbrs(i, j + 1, visited, m);

	}
}
