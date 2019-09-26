package Recurssion;

public class RatInAMaze {

	// For searching in all 8 direction
	static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
	static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };
	static int[][] temp = new int[4][4];
	static boolean endProg = false;

	private static void movement(int[][] arr, int[][] temp, boolean[][] visited, int startRow, int startCol) {

		for (int i = 0; i < 8; i++) {
			int r = startRow + x[i];
			int c = startCol + y[i];

			if (condition(arr, visited, r, c)) {

				temp[r][c] = 1;
				visited[r][c] = true;

				movement(arr, temp, visited, r, c);

				if (r == 3 && c == 3) {

					System.out.println("d");
					endProg = true;

				}

				if (!endProg) {
					temp[r][c] = 0;
					visited[r][c] = false;
				}

			}

		}

	}

	static boolean condition(int[][] arr, boolean[][] visited, int r, int c) {

		if (r >= 0 && c >= 0 && c < 4 && r < 4 && arr[r][c] == 1 && visited[r][c] == false)
			return true;

		else
			return false;

	}

	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		int[] n = { 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1 };
		int z = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i][j] = n[z++];
			}
		}
		boolean[][] visited = new boolean[4][4];

		temp[0][0] = 1;
		visited[0][0] = true;
		movement(arr, temp, visited, 0, 0);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(temp[i][j]);
			}
			System.out.println();
		}

	}

}
