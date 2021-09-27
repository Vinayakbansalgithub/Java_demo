package Matrix;

import java.util.Arrays;


// leetcode 48
public class RotateImage {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		find(arr);
	}

	private static void find(int[][] arr) {
		// TODO Auto-generated method stub

		// transpose

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[i].length; j++) {

				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;

			}
			// System.out.println(arr);

		}

		// reverse

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length / 2; j++) {

				int temp = arr[i][j];
				arr[i][j] = arr[i][arr[i].length - 1 - j];
				arr[i][arr[i].length - 1 - j] = temp;

			}

		}

		System.out.println(Arrays.toString(arr));
	}
}
