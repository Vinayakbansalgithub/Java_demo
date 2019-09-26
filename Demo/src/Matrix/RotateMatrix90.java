package Matrix;

public class RotateMatrix90 {

	static void transpose(int r, int c, int[][] arr) {
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (i <= j) {

					int temp;
					temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}

		}

		System.out.println("Matrix after Transpose");

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();

		}

		for (int i = 0; i < r; i++) {

			for (int j = 0; j < c / 2; j++) {
				int temp;
				temp = arr[i][j];
				arr[i][j] = arr[i][c - j - 1];
				arr[i][c - j - 1] = temp;

			}

		}

		System.out.println("Matrix after 90");

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		int R = 3;
		int C = 3;
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		
		System.out.println("given matrix");
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();

		}
		
		for (int i = 0; i < 2; i++) {
			transpose(R, C, arr);
		System.out.println("matrix after 180");

		}
	}
}
