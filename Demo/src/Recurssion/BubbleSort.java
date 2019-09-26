package Recurssion;

import java.util.Arrays;

public class BubbleSort {

	private static void sort(int[] arr, int start, int end) {
		// TODO Auto-generated method stub

		if (end == 0 || start == arr.length - 1) {
			return;
		}

		if (arr[start] > arr[start + 1]) {
			int temp = arr[start + 1];
			arr[start + 1] = arr[start];
			arr[start] = temp;
		}
		sort(arr, start + 1, end);

		sort(arr, 0, end - 1);

		return;

	}

	public static void main(String[] args) {
		int arr[] = { 50, 40, 30, 20, 10 };
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
