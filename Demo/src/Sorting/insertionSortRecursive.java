package Sorting;

import java.util.Arrays;

public class insertionSortRecursive {
	// Recursive function to sort an array using
	// insertion sort
	static void insertionSort(int arr[], int i, int n) {
		int value = arr[i];
		int j = i;

		// Find index j within the sorted subset arr[0..i-1]
		// where element arr[i] belongs
		while (j > 0 && arr[j - 1] > value) {
			arr[j] = arr[j - 1];
			j--;
		}

		arr[j] = value;

		// Note that subarray arr[j..i-1] is shifted to
		// the right by one position i.e. arr[j+1..i]
		if (i + 1 <= n) {
			insertionSort(arr, i + 1, n);
		}
	}

	// Driver Method
	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6 };

		insertionSort(arr, 0, arr.length - 1);

		System.out.println(Arrays.toString(arr));
	}
}
