package Recurssion;

import java.util.Arrays;

public class QuickSort {
	private static void sort(int[] arr, int start, int end) {
		// consider pivot as middle element
		int pivot = (end + start) / 2;
		int left = start;
		int right = end;

		while (left > right) {
			return;
		}
		
		// male pivot in the middle
		while (left <= right) {

			while (arr[left] < arr[pivot]) {
				left++;
			}
			while (arr[pivot] < arr[right]) {
				right--;
			}

			if (left <= right) {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				left++;
				right--;
			}

		}
		sort(arr, start, right);
		sort(arr, left, end);

	}

	public static void main(String[] args) {

		int arr[] = { 10, 5, 14, 6 ,8 };
		sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

}
