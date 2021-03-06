package Recurssion;

import java.util.Arrays;
import java.util.Base64;

public class LargestNumeberFormedFromArray {

	static int max = 0;

	int arrayToInt(int[] arr) {

		StringBuilder s = new StringBuilder();
		for (int i : arr) {
			s.append(i);
		}
		return Integer.parseInt(s.toString()); // parse integer out of the string
	}

	public static void main(String[] args) {
		int arr[] = { 9, 34, 8 };
		int n = arr.length;
		LargestNumeberFormedFromArray permutation = new LargestNumeberFormedFromArray();
		permutation.permute(arr, 0, n - 1);
		System.out.println("number is " + max);

	}

	private void permute(int arr[], int l, int r) {
		if (l == r) {
			System.out.println(Arrays.toString(arr));
			if (max < arrayToInt(arr))
				max = arrayToInt(arr);
		} else {
			for (int i = l; i <= r; i++) {

				arr = swap(arr, i, l);
				permute(arr, l + 1, r);
				arr = swap(arr, i, l);

			}
		}
	}

	public int[] swap(int arr[], int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

}
