package Arrays;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 3, 12 };
		find(arr);
	}

	static void find(int[] arr) {
		// TODO Auto-generated method stub

		int index = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				arr[index] = arr[i];
				index++;
			}

		}

		for (int j = index; j < arr.length; j++) {
			arr[j] = 0;
		}

		System.out.println(Arrays.toString(arr));

	}
}
