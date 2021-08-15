package Extra;

public class PrintMatrixdiagonal {

	static final int ROW = 5;
	static final int COL = 4;

	static void diagonalOrder(int[][] m) {
		// TODO Auto-generated method stub

		for (int i = 0; i < ROW; i++) {

			int r = i;
			int c = 0;

			while (r >= 0 && c < COL) {
				System.out.print(m[r][c]);
				r = r - 1;
				c = c + 1;

			}
			System.out.println();

		}

		for (int i = 1; i < COL; i++) {

			int r = ROW - 1;
			int c = i;

			while (c < COL) {

				System.out.print(m[r][c]);
				r = r - 1;
				c = c + 1;
			}
			System.out.println();

		}

	}

	static void printMatrix(int[][] m) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COL; j++)
				System.out.print(m[i][j] + " ");
			System.out.print("\n");
		}

	}

	public static void main(String[] args) {
		int M[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, { 17, 18, 19, 20 }, };
		printMatrix(M);

		System.out.print("\nDiagonal printing of matrix is \n");
		diagonalOrder(M);
	}

}
