package Matrix;

import java.util.HashSet;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		int a[][] = { { 1, 1, 1 }, { 2, 0, 6 }, { 9, 8, 7 } };
		find(a);
	}

	static void find(int[][] a) {

		HashSet<Integer> row = new HashSet<Integer>();
		HashSet<Integer> col = new HashSet<Integer>();

		int r = a.length;
		int c = a[0].length;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				if (a[i][j] == 0) {
					row.add(i);
					col.add(j);

				}

			}
		}

		for (Integer R : row) {

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {

					a[R][j] = 0;
				}
			}

		}

		for (Integer C : col) {
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {

					a[i][C] = 0;
				}
			}
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();

		}

	}
}
