package Arrays;

import java.util.Arrays;

public class WaveSort {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 6, 3, 2, 20, 100, 80 };
		find(arr);
	}

	static void find(int[] arr) {

		for (int i = 1; i < arr.length; i += 2) {
			if (arr[i] > arr[i - 1]) {
				swap(arr, i, i - 1);
			}

			if (i < arr.length - 2 && arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		}

		System.out.println(Arrays.toString(arr));

	}

	static void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
