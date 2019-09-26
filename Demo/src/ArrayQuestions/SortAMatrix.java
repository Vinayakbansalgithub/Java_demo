package ArrayQuestions;

import java.util.Arrays;

public class SortAMatrix {

	static int[][] sort(int r, int c, int[][] arr) {

		int singlearr[] = new int[r * c];
		int k = 0;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				singlearr[k] = arr[i][j];

				k++;

			}
		}

		Arrays.parallelSort(singlearr);

		k = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				arr[i][j] = singlearr[k];

				k++;

			}
		}
		return arr;

	}

	private static void search(int[][] arr, int r, int c, int elemnet) {

		int rowStart = 0;
		int columnStart = 0;
		int rowEnd = r - 1;
		int columnEnd = c - 1;

		while (rowStart < rowEnd) {

			if (elemnet == arr[rowStart][columnEnd]) {
				break;
			} else {

				if (elemnet > arr[rowStart][columnEnd]) {

					rowStart = rowStart + 1;

				} else {
					rowEnd = rowStart;

				}

			}

		}
		System.out.println("element is in row " + rowStart);

		for (int i = 0; i <= columnEnd; i++) {
			if (elemnet == arr[rowStart][i]) {

				System.out.println("index is  " + rowStart + "  " + i);
			}
		}

	}

	public static void main(String[] args) {
		int r = 3;
		int c = 3;
		int a[][] = { { 1, 4, 7 }, { 2, 3, 6 }, { 9, 8, 7 } };
		a = sort(r, c, a);
		search(a, r, c, 3);

	}

}
