package ArrayQuestions;

import java.util.Arrays;

public class ProductofArrayExceptItself {

	// Method for maximum amount of water
	static void findproduct(int[] arr, int n) {
		// left[i] contains height of tallest bar to the
		// left of i'th bar including itself
		int left[] = new int[n];

		// Right [i] contains height of tallest bar to
		// the right of ith bar including itself
		int right[] = new int[n];

		int result[] = new int[n];

		// Fill left array
		left[0] = arr[0];
		for (int i = 1; i < n; i++)
			left[i] = left[i - 1] * arr[i];

		// Fill right array
		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--)
			right[i] = right[i + 1] * arr[i];

		for (int i = 0; i < n - 1; i++) {

			if (i == 0) {
				result[i] = right[i + 1];
			} else
				result[i] = left[i - 1] * right[i + 1];

		}

		result[n - 1] = left[n - 2];

		System.out.println(Arrays.toString(result));

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 10, 3, 5, 6, 2 };

		findproduct(arr, arr.length);

	}

}
