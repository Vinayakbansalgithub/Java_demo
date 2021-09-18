package Matrix;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

	static class Point {
		int i;
		int j;

		Point(int i, int j) {
			this.i = i;
			this.j = j;
		}

	}

	public static void main(String[] args) {

		int M[][] = new int[][] { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		// int M[][] = new int[][] { { 2, 1, 1 }, { 0, 1, 1 }, { 1, 0, 1 } };
		// int M[][] = new int[][] { { 2 }, { 1 } };
		// int M[][] = new int[][] { { 1, 2 } };
//		int M[][] = new int[][] { { 0, 2, 2 } };

		count(M);

	}

	
	// bfs
	static void count(int[][] m) {
		// TODO Auto-generated method stub

		int count = 0;
		boolean visited[][] = new boolean[m.length][m[0].length];
		Queue<Point> queue = new LinkedList<RottenOranges.Point>();

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				if (m[i][j] == 2) {
					queue.add(new Point(i, j));
					visited[i][j] = true;
					while (!queue.isEmpty()) {

						Point p = queue.poll();

						int res = 0;
						res += markNbrs(p.i - 1, p.j, visited, m);
						res += markNbrs(p.i, p.j - 1, visited, m);
						res += markNbrs(p.i + 1, p.j, visited, m);
						res += markNbrs(p.i, p.j + 1, visited, m);

						if (res > 0)
							count++;

					}

				}
			}
		}

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					count = -1;

			}
		}

		System.out.println("count is " + count);

	}

	private static int markNbrs(int i, int j, boolean[][] visited, int[][] m) {
		// TODO Auto-generated method stub

		if (i < 0 || j < 0 || i >= m.length || j >= m[i].length || m[i][j] == 0 || visited[i][j] == true
				|| m[i][j] == 2) {
			return 0;
		}

		m[i][j] = 2;
		visited[i][j] = true;
		return 1;

	}
}
