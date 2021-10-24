package Recurssion;

public class WordSearchproblem {

	static public boolean wordBreak(String word, char[][] grid) {

		boolean visited[][] = new boolean[grid.length][grid[0].length];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {

				if (grid[i][j] == word.charAt(0)) {

					if (dfs(i, j, visited, grid, 0, word))
						return true;
					else
						return false;
				}

			}
		}

		return false;
	}

	static boolean dfs(int i, int j, boolean visited[][], char[][] grid, int k, String word) {
		// TODO Auto-generated method stub

		if (k == word.length())
			return true;

		if (i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || visited[i][j] == true
				|| word.charAt(k) != grid[i][j]) {
			return false;
		}

		visited[i][j] = true;

		if (dfs(i - 1, j, visited, grid, k + 1, word) ||
				dfs(i, j - 1, visited, grid, k + 1, word)|| 
				dfs(i + 1, j, visited, grid, k + 1, word) ||
				dfs(i, j + 1, visited, grid, k + 1, word)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		char[][] grid = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };

		String word = "SEE";
		System.out.println(wordBreak(word, grid));

	}
}
