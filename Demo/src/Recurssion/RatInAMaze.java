package Recurssion;

public class RatInAMaze {

	private static void checknbrs(int[][] m, boolean[][] visited, int i, int j) {

		if (i < 0 || j < 0 || i >= m.length || j >= m[i].length || m[i][j] == 0 || visited[i][j] == true) {
			return;
		}

		visited[i][j] = true;

		if (i == m.length - 1 && j == m[i].length - 1) {
			System.out.println("reached ");
			for (int i1 = 0; i1 < 4; i1++) {
				for (int j1 = 0; j1 < 4; j1++) {
					System.out.print(visited[i1][j1]);
				}
				System.out.println();
			}

		} else {

			checknbrs(m, visited, i + 1, j);
			checknbrs(m, visited, i, j + 1);
			checknbrs(m, visited, i - 1, j);
			checknbrs(m, visited, i, j - 1);

		}

	}

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int[] n = { 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1 };
		int z = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = n[z++];
			}
		}
		boolean[][] visited = new boolean[4][4];

		checknbrs(arr, visited, 0, 0);

	}

}
