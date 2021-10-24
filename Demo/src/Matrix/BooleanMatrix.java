package Matrix;

public class BooleanMatrix {

	public static int[][] modifyMatrix(int mat[][], int R, int C) {

		int temp[][] = new int[R][C];

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {

				if (mat[i][j] == 1) {

					int r = 0;
					int c = j;
					while (r < R) {

						temp[r++][c] = 1;

					}
					r = i;
					c = 0;
					while (c < C) {

						temp[r][c++] = 1;

					}

				}

			}
		}

		mat = temp;
		return mat;

	}

	public static void printMatrix(int mat[][], int R, int C) {
		int i, j;
		for (i = 0; i < R; i++) {
			for (j = 0; j < C; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int mat[][] = { { 0, 0, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 }, };

		System.out.println("Matrix Intially");

		printMatrix(mat, 3, 4);

		mat = modifyMatrix(mat, 3, 4);
		System.out.println("Matrix after modification n");
		printMatrix(mat, 3, 4);

	}

}
